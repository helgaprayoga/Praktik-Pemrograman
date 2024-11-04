import javax.swing.*;
import java.awt.event.*;

class KalkulatorSederhana extends JFrame{
    JLabel angkaPertama = new JLabel ("Masukkan Angka Pertama");
    JTextField textFieldAngkaPertama = new JTextField();
    JLabel angkaKedua = new JLabel ("Masukkan Angka Kedua");
    JTextField textFieldAngkaKedua = new JTextField();
    JLabel hasil = new JLabel ("Hasil");
    JTextField textFieldHasil = new JTextField();
    JButton btnTambah = new JButton("+");
    JButton btnKurang = new JButton("-");
    JButton btnKali = new JButton("*");
    JButton btnBagi = new JButton("/");

    KalkulatorSederhana() {
        setTitle("Kalkulator Sederhana");
        setSize(250,400);
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void komponen() {
        getContentPane().setLayout(null);
        angkaPertama.setBounds(40, 20, 200, 20);
        textFieldAngkaPertama.setBounds(20, 45, 200, 25);
        angkaKedua.setBounds(50, 80, 200, 20);
        textFieldAngkaKedua.setBounds(20, 105, 200, 25);
        hasil.setBounds(100, 140, 200, 20);
        textFieldHasil.setBounds(20, 165, 200, 25);
        textFieldHasil.setEditable(false);
        btnTambah.setBounds(20, 200, 50, 40);
        btnKurang.setBounds(95, 200, 50, 40);
        btnKali.setBounds(170, 200, 50, 40);
        btnBagi.setBounds(95, 265, 50, 40);
        getContentPane().add(angkaPertama);
        getContentPane().add(textFieldAngkaPertama);
        getContentPane().add(angkaKedua);
        getContentPane().add(textFieldAngkaKedua);
        getContentPane().add(hasil);
        getContentPane().add(textFieldHasil);
        getContentPane().add(btnTambah);
        getContentPane().add(btnKurang);
        getContentPane().add(btnKali);
        getContentPane().add(btnBagi);
        setVisible(true);
    }

    void reaksi() {
        textFieldAngkaPertama.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        textFieldAngkaKedua.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });

        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                try {
                    double angkaPertama = Double.parseDouble(textFieldAngkaPertama.getText());
                    double angkaKedua = Double.parseDouble(textFieldAngkaKedua.getText());
                    double hasil = angkaPertama + angkaKedua;
                    textFieldHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        btnKurang.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                try {
                    double angkaPertama = Double.parseDouble(textFieldAngkaPertama.getText());
                    double angkaKedua = Double.parseDouble(textFieldAngkaKedua.getText());
                    double hasil = angkaPertama - angkaKedua;
                    textFieldHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        btnKali.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                try {
                    double angkaPertama = Double.parseDouble(textFieldAngkaPertama.getText());
                    double angkaKedua = Double.parseDouble(textFieldAngkaKedua.getText());
                    double hasil = angkaPertama * angkaKedua;
                    textFieldHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });

        btnBagi.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                try {
                    double angkaPertama = Double.parseDouble(textFieldAngkaPertama.getText());
                    double angkaKedua = Double.parseDouble(textFieldAngkaKedua.getText());
                    double hasil = angkaPertama / angkaKedua;
                    textFieldHasil.setText(String.valueOf(hasil));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            }
        });
    }

    public static void main (String[] args) {
        KalkulatorSederhana eb = new KalkulatorSederhana();
        eb.komponen();
        eb.reaksi();
    }
}