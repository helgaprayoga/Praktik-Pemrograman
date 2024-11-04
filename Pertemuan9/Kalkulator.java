import java.awt.Color;
import javax.swing.*;

class Kalkulator extends JFrame{
    JTextField textField = new JTextField();
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btnTambah = new JButton("+");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btnKurang = new JButton("-");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnKali = new JButton("*");
    JButton btn0 = new JButton("0");
    JButton btnC = new JButton("C");
    JButton btnSamaDengan = new JButton("=");
    JButton btnBagi = new JButton("/");

    String operator = "";
    double num1 = 0;
    double num2 = 0;

    Kalkulator() {
        setTitle("Kalkulator");
        setSize(285,310);
        setLocation(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void komponen() {
        getContentPane().setLayout(null);

        textField.setBounds(20, 10, 231, 40);
        
        btn1.setBounds(20, 60, 50, 40);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.WHITE);

        btn2.setBounds(80, 60, 50, 40);
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn3.setBounds(140, 60, 50, 40);
        btn3.setBackground(Color.DARK_GRAY);
        btn3.setForeground(Color.WHITE);

        btnTambah.setBounds(200, 60, 50, 40);
        btnTambah.setBackground(Color.WHITE);

        btn4.setBounds(20, 110, 50, 40);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.setForeground(Color.WHITE);

        btn5.setBounds(80, 110, 50, 40);
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);

        btn6.setBounds(140, 110, 50, 40);
        btn6.setBackground(Color.DARK_GRAY);
        btn6.setForeground(Color.WHITE);

        btnKurang.setBounds(200, 110, 50, 40);
        btnKurang.setBackground(Color.WHITE);

        btn7.setBounds(20, 160, 50, 40);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.setForeground(Color.WHITE);

        btn8.setBounds(80, 160, 50, 40);
        btn8.setBackground(Color.BLACK);
        btn8.setForeground(Color.WHITE);

        btn9.setBounds(140, 160, 50, 40);
        btn9.setBackground(Color.DARK_GRAY);
        btn9.setForeground(Color.WHITE);

        btnKali.setBounds(200, 160, 50, 40);
        btnKali.setBackground(Color.WHITE);

        btn0.setBounds(20, 210, 50, 40);
        btn0.setBackground(Color.WHITE);

        btnC.setBounds(80, 210, 50, 40);
        btnC.setBackground(Color.WHITE);

        btnSamaDengan.setBounds(140, 210, 50, 40);
        btnSamaDengan.setBackground(Color.WHITE);

        btnBagi.setBounds(200, 210, 50, 40);
        btnBagi.setBackground(Color.WHITE);

        getContentPane().add(textField);
        getContentPane().add(btn1);
        getContentPane().add(btn2);
        getContentPane().add(btn3);
        getContentPane().add(btnTambah);
        getContentPane().add(btn4);
        getContentPane().add(btn5);
        getContentPane().add(btn6);
        getContentPane().add(btnKurang);
        getContentPane().add(btn7);
        getContentPane().add(btn8);
        getContentPane().add(btn9);
        getContentPane().add(btnKali);
        getContentPane().add(btn0);
        getContentPane().add(btnC);
        getContentPane().add(btnSamaDengan);
        getContentPane().add(btnBagi);
        setVisible(true);
    }

    void reaksi() {
        btn1.addActionListener(e -> textField.setText(textField.getText() + "1"));
        btn2.addActionListener(e -> textField.setText(textField.getText() + "2"));
        btn3.addActionListener(e -> textField.setText(textField.getText() + "3"));
        btn4.addActionListener(e -> textField.setText(textField.getText() + "4"));
        btn5.addActionListener(e -> textField.setText(textField.getText() + "5"));
        btn6.addActionListener(e -> textField.setText(textField.getText() + "6"));
        btn7.addActionListener(e -> textField.setText(textField.getText() + "7"));
        btn8.addActionListener(e -> textField.setText(textField.getText() + "8"));
        btn9.addActionListener(e -> textField.setText(textField.getText() + "9"));
        btn0.addActionListener(e -> textField.setText(textField.getText() + "0"));


        btnTambah.addActionListener(e -> setOperator("+"));
        btnKurang.addActionListener(e -> setOperator("-"));
        btnKali.addActionListener(e -> setOperator("*"));
        btnBagi.addActionListener(e -> setOperator("/"));

        btnC.addActionListener(e -> textField.setText("")); // Menghapus isi text field

        btnSamaDengan.addActionListener(e -> calculateResult());
    }

    private void setOperator(String op) {
        operator = op;
        num1 = Double.parseDouble(textField.getText());
        textField.setText("");
    }

    private void calculateResult() {
        num2 = Double.parseDouble(textField.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        textField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        Kalkulator kk = new Kalkulator();
        kk.komponen();
        kk.reaksi();
    }
}
