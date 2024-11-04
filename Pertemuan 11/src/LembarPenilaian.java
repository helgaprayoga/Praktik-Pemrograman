import javax.swing.*;
import java.sql.*;

public class LembarPenilaian extends JFrame {
    private JTextField NIM, Nama;
    private JRadioButton btnA, btnB, btnC;
    private JComboBox<String> Matkul;
    private JButton btnCari, btnEdit, btnSimpan, btnHapus, btnKeluar;
    private Connection connection;

    public LembarPenilaian() {
        setTitle("Lembar Penilaian");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(20, 20, 80, 25);
        add(lblNIM);

        NIM = new JTextField();
        NIM.setBounds(100, 20, 150, 25);
        add(NIM);

        btnCari = new JButton("Cari");
        btnCari.setBounds(260, 20, 80, 25);
        add(btnCari);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(20, 60, 80, 25);
        add(lblNama);

        Nama = new JTextField();
        Nama.setBounds(100, 60, 240, 25);
        add(Nama);

        JLabel lblKelas = new JLabel("Kelas");
        lblKelas.setBounds(20, 100, 80, 25);
        add(lblKelas);

        btnA = new JRadioButton("A");
        btnA.setBounds(100, 100, 50, 25);
        add(btnA);

        btnB = new JRadioButton("B");
        btnB.setBounds(150, 100, 50, 25);
        add(btnB);

        btnC = new JRadioButton("C");
        btnC.setBounds(200, 100, 50, 25);
        add(btnC);

        ButtonGroup groupKelas = new ButtonGroup();
        groupKelas.add(btnA);
        groupKelas.add(btnB);
        groupKelas.add(btnC);

        JLabel lblMatakuliah = new JLabel("Mata Kuliah");
        lblMatakuliah.setBounds(20, 140, 80, 25);
        add(lblMatakuliah);

        Matkul = new JComboBox<>(new String[]{"Kalkulus", "Fisika", "Pemrograman", "Agama", "Teknik Digital"});
        Matkul.setBounds(100, 140, 150, 25);
        add(Matkul);

        btnEdit = new JButton("Edit");
        btnEdit.setBounds(20, 200, 80, 25);
        add(btnEdit);

        btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(110, 200, 80, 25);
        add(btnSimpan);

        btnHapus = new JButton("Hapus");
        btnHapus.setBounds(200, 200, 80, 25);
        add(btnHapus);

        btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(290, 200, 80, 25);
        add(btnKeluar);

        connectToDatabase();
        
        btnCari.addActionListener(e -> cariData());
        btnSimpan.addActionListener(e -> simpanData());
        btnEdit.addActionListener(e -> editData());
        btnHapus.addActionListener(e -> hapusData());
        btnKeluar.addActionListener(e -> System.exit(0));
    }

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/firstdb";
            String user = "root";
            String pass = "1234";
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to database successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to connect to database!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cariData() {
        String nim = NIM.getText();
        String query = "SELECT * FROM nama_nim WHERE NIM = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, nim);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                Nama.setText(rs.getString("Nama"));
                String kelas = rs.getString("Kelas");
                btnA.setSelected("A".equals(kelas));
                btnB.setSelected("B".equals(kelas));
                btnC.setSelected("C".equals(kelas));
                Matkul.setSelectedItem(rs.getString("Matakuliah"));
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void simpanData() {
        String nim = NIM.getText();
        String nama = Nama.getText();
        String kelas = btnA.isSelected() ? "A" : btnB.isSelected() ? "B" : "C";
        String matakuliah = (String) Matkul.getSelectedItem();

        String query = "INSERT INTO nama_nim (NIM, Nama, Kelas, Matakuliah) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setString(3, kelas);
            pst.setString(4, matakuliah);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void editData() {
        String nim = NIM.getText();
        String nama = Nama.getText();
        String kelas = btnA.isSelected() ? "A" : btnB.isSelected() ? "B" : "C";
        String matakuliah = (String) Matkul.getSelectedItem();

        String query = "UPDATE nama_nim SET Nama = ?, Kelas = ?, Matakuliah = ? WHERE NIM = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, nama);
            pst.setString(2, kelas);
            pst.setString(3, matakuliah);
            pst.setString(4, nim);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void hapusData() {
        String nim = NIM.getText();
        String query = "DELETE FROM nama_nim WHERE NIM = ?";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, nim);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
            clearFields();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clearFields() {
        NIM.setText("");
        Nama.setText("");
        btnA.setSelected(false);
        btnB.setSelected(false);
        btnC.setSelected(false);
        Matkul.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LembarPenilaian().setVisible(true);
        });
    }
}
