import java.awt.*;
import javax.swing.*;

public class LaundryApp extends JFrame {

    private JTextField txtNoNota, txtNama, txtAlamat, txtJumlah, txtTotalBayar, txtKarpet, txtBedCover;
    private JComboBox<String> cmbJenisLaundry;
    private JTextArea txtHasilOutput;
    private JRadioButton rdbYa, rdbTidak;
    private JCheckBox chkKarpet, chkBedCover;
    private JButton btnBersih, btnKeluar, btnTampil;
    private ButtonGroup antarJemputGroup;

    public LaundryApp() {

        setTitle("Aplikasi Laundry");
        setLayout(null); 


        JLabel lblTitle = new JLabel("Aplikasi Laundry", JLabel.CENTER);
        lblTitle.setFont(new Font("Serif", Font.BOLD, 20));

        txtNoNota = new JTextField();
        txtNama = new JTextField();
        txtAlamat = new JTextField();
        txtJumlah = new JTextField();
        txtTotalBayar = new JTextField();
        txtHasilOutput = new JTextArea();
        txtHasilOutput.setEditable(false);
        cmbJenisLaundry = new JComboBox<>(new String[]{"Express", "Reguler"});
        txtKarpet = new JTextField();
        txtBedCover = new JTextField();
        chkKarpet = new JCheckBox("Karpet");
        chkBedCover = new JCheckBox("Bed Cover");

        rdbYa = new JRadioButton("Ya");
        rdbTidak = new JRadioButton("Tidak");
        antarJemputGroup = new ButtonGroup();
        antarJemputGroup.add(rdbYa);
        antarJemputGroup.add(rdbTidak);

        btnBersih = new JButton("Bersih");
        btnKeluar = new JButton("Keluar");
        btnTampil = new JButton("Tampil");

        lblTitle.setBounds(150, 10, 300, 30);
        
        JLabel lblNoNota = new JLabel("No. Nota:");
        lblNoNota.setBounds(20, 50, 80, 20);
        txtNoNota.setBounds(20, 70, 150, 20);

        JLabel lblNama = new JLabel("Nama Pelanggan:");
        lblNama.setBounds(20, 100, 120, 20);
        txtNama.setBounds(20, 120, 150, 20);

        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 150, 120, 20);
        txtAlamat.setBounds(20, 170, 150, 20);

        JLabel lblJenisLaundry = new JLabel("Jenis Laundry:");
        lblJenisLaundry.setBounds(20, 200, 120, 20);
        cmbJenisLaundry.setBounds(150, 200, 150, 20);

        JLabel lblJumlah = new JLabel("Jumlah (Kg):");
        lblJumlah.setBounds(20, 230, 120, 20);
        txtJumlah.setBounds(150, 230, 50, 20);

        JLabel lblTambahan = new JLabel("Tambahan:");
        lblTambahan.setBounds(20, 260, 120, 20);
        chkKarpet.setBounds(150, 260, 80, 20);
        txtKarpet.setBounds(230, 260, 50, 20);
        chkBedCover.setBounds(150, 290, 80, 20);
        txtBedCover.setBounds(230, 290, 50, 20);

        JLabel lblHasilOutput = new JLabel("Hasil Output:");
        lblHasilOutput.setBounds(320, 50, 100, 20);
        JScrollPane scrollPane = new JScrollPane(txtHasilOutput);
        scrollPane.setBounds(320, 70, 250, 230);

        JLabel lblAntarJemput = new JLabel("Antar Jemput:");
        lblAntarJemput.setBounds(320, 310, 120, 20);
        rdbYa.setBounds(440, 310, 50, 20);
        rdbTidak.setBounds(490, 310, 60, 20);

        JLabel lblTotalBayar = new JLabel("Total Bayar:");
        lblTotalBayar.setBounds(320, 340, 120, 20);
        txtTotalBayar.setBounds(440, 340, 130, 20);

        btnBersih.setBounds(150, 380, 80, 25);
        btnTampil.setBounds(250, 380, 80, 25);
        btnKeluar.setBounds(350, 380, 80, 25);

        add(lblTitle);
        add(lblNoNota); add(txtNoNota);
        add(lblNama); add(txtNama);
        add(lblAlamat); add(txtAlamat);
        add(lblJenisLaundry); add(cmbJenisLaundry);
        add(lblJumlah); add(txtJumlah);
        add(lblTambahan); add(chkKarpet); add(txtKarpet); add(chkBedCover); add(txtBedCover);
        add(lblHasilOutput); add(scrollPane);
        add(lblAntarJemput); add(rdbYa); add(rdbTidak);
        add(lblTotalBayar); add(txtTotalBayar);
        add(btnBersih); add(btnKeluar); add(btnTampil);

        btnBersih.addActionListener(e -> clearFields());
        btnKeluar.addActionListener(e -> System.exit(0));
        btnTampil.addActionListener(e -> displayData());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void clearFields() {
        txtNoNota.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtJumlah.setText("");
        txtTotalBayar.setText("");
        txtKarpet.setText("");
        txtBedCover.setText("");
        txtHasilOutput.setText("");
        antarJemputGroup.clearSelection();
        chkKarpet.setSelected(false);
        chkBedCover.setSelected(false);
    }

    private void displayData() {
        StringBuilder output = new StringBuilder();
        output.append("No Nota: ").append(txtNoNota.getText()).append("\n");
        output.append("Nama Pelanggan: ").append(txtNama.getText()).append("\n");
        output.append("Alamat: ").append(txtAlamat.getText()).append("\n");
        output.append("Jenis Laundry: ").append(cmbJenisLaundry.getSelectedItem()).append("\n");
        output.append("Jumlah (Kg): ").append(txtJumlah.getText()).append("\n");
        output.append("Antar Jemput: ").append(rdbYa.isSelected() ? "Ya" : "Tidak").append("\n");

        if (chkKarpet.isSelected()) {
            output.append("Karpet: ").append(txtKarpet.getText()).append("\n");
        }
        if (chkBedCover.isSelected()) {
            output.append("Bed Cover: ").append(txtBedCover.getText()).append("\n");
        }

        output.append("Total Bayar: ").append(txtTotalBayar.getText()).append("\n");
        txtHasilOutput.setText(output.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LaundryApp::new);
    }
}
