import javax.swing.*;

public class KalkulatorSederhana {

    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(250, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Membuat label dan text field untuk input angka pertama
        JLabel labelAngkaPertama = new JLabel("Masukkan Angka Pertama :");
        labelAngkaPertama.setBounds(40, 20, 200, 20);
        JTextField textFieldAngkaPertama = new JTextField();
        textFieldAngkaPertama.setBounds(20, 45, 200, 25);

        // Membuat label dan text field untuk input angka kedua
        JLabel labelAngkaKedua = new JLabel("Masukkan Angka Kedua :");
        labelAngkaKedua.setBounds(50, 80, 200, 20);
        JTextField textFieldAngkaKedua = new JTextField();
        textFieldAngkaKedua.setBounds(20, 105, 200, 25);

        // Membuat label dan text field untuk hasil
        JLabel labelHasil = new JLabel("Hasil :");
        labelHasil.setBounds(100, 140, 200, 20);
        JTextField textFieldHasil = new JTextField();
        textFieldHasil.setBounds(20, 165, 200, 25);

        // Membuat tombol operasi (+, -, *, /)
        JButton btnTambah = new JButton("+");
        btnTambah.setBounds(20, 200, 50, 40);
        JButton btnKurang = new JButton("-");
        btnKurang.setBounds(95, 200, 50, 40);
        JButton btnKali = new JButton("/");
        btnKali.setBounds(170, 200, 50, 40);
        JButton btnBagi = new JButton("*");
        btnBagi.setBounds(95, 265, 50, 40);

        // Menambahkan komponen ke panel
        panel.add(labelAngkaPertama);
        panel.add(textFieldAngkaPertama);
        panel.add(labelAngkaKedua);
        panel.add(textFieldAngkaKedua);
        panel.add(labelHasil);
        panel.add(textFieldHasil);
        panel.add(btnTambah);
        panel.add(btnKurang);
        panel.add(btnKali);
        panel.add(btnBagi);

        // Menambahkan panel ke frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
