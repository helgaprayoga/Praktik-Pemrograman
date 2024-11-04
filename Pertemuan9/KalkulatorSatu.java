import java.awt.Color;
import javax.swing.*;

public class KalkulatorSatu {

    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Kalkulator");
        frame.setSize(285, 310);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);

        // Membuat label dan text field untuk input angka pertama
        JTextField textField = new JTextField();
        textField.setBounds(20, 10, 231, 40);

        // Membuat tombol operasi
        JButton btn1 = new JButton("1");
        btn1.setBounds(20, 60, 50, 40);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.WHITE);

        JButton btn2 = new JButton("2");
        btn2.setBounds(80, 60, 50, 40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        JButton btn3 = new JButton("3");
        btn3.setBounds(140, 60, 50, 40);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setForeground(Color.WHITE);

        JButton btnTambah = new JButton("+");
        btnTambah.setBounds(200, 60, 50, 40);
        btnTambah.setBackground(Color.WHITE);

        JButton btn4 = new JButton("4");
        btn4.setBounds(20, 110, 50, 40);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.setForeground(Color.WHITE);

        JButton btn5 = new JButton("5");
        btn5.setBounds(80, 110, 50, 40);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);

        JButton btn6 = new JButton("6");
        btn6.setBounds(140, 110, 50, 40);
        btn6.setBackground(Color.DARK_GRAY);
        btn6.setForeground(Color.WHITE);

        JButton btnKurang = new JButton("-");
        btnKurang.setBounds(200, 110, 50, 40);
        btnKurang.setBackground(Color.WHITE);

        JButton btn7 = new JButton("7");
        btn7.setBounds(20, 160, 50, 40);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.setForeground(Color.WHITE);

        JButton btn8 = new JButton("8");
        btn8.setBounds(80, 160, 50, 40);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);

        JButton btn9 = new JButton("9");
        btn9.setBounds(140, 160, 50, 40);
        btn9.setBackground(Color.DARK_GRAY);
        btn9.setForeground(Color.WHITE);

        JButton btnKali = new JButton("*");
        btnKali.setBounds(200, 160, 50, 40);
        btnKali.setBackground(Color.WHITE);

        JButton btn0 = new JButton("0");
        btn0.setBounds(20, 210, 50, 40);
        btn0.setBackground(Color.WHITE);

        JButton btnC = new JButton("C");
        btnC.setBounds(80, 210, 50, 40);
        btnC.setBackground(Color.WHITE);

        JButton btnSamaDengan = new JButton("=");
        btnSamaDengan.setBounds(140, 210, 50, 40);
        btnSamaDengan.setBackground(Color.WHITE);

        JButton btnBagi = new JButton("/");
        btnBagi.setBounds(200, 210, 50, 40);
        btnBagi.setBackground(Color.WHITE);

        // Menambahkan komponen ke panel
        panel.add(textField);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btnTambah);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnKurang);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnKali);
        panel.add(btn0);
        panel.add(btnC);
        panel.add(btnSamaDengan);
        panel.add(btnBagi);

        // Menambahkan panel ke frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
