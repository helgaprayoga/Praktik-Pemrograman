import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CobaAksiReaksi extends JFrame {
    JTextArea nama = new JTextArea(10,10);
    JButton bt = new JButton("Copy");
    JTextArea txnama = new JTextArea(10,10);
    
    CobaAksiReaksi() {
        super("Coba Event Handling");
        setLocation(200,300);
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void tampilan() {
        getContentPane().add(nama);
        nama.append("Nama kamu siapa");
        getContentPane().add(bt);
        getContentPane().add(txnama);
        txnama.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }

    void aksi_reaksi () {
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txnama.append(nama.getSelectedText());
            }
        });
    }

    public static void main(String[] args) {
        CobaAksiReaksi f = new CobaAksiReaksi();
        f.tampilan();
        f.aksi_reaksi();
    }
}
