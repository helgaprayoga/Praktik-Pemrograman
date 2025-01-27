import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionListenerMouse {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        final JLabel lb = new JLabel("");
        final String[] items = {" Roti ", " Madu "};
        final JComboBox comboBox = new JComboBox(items);
        JPanel pn = new JPanel();
        frame.add(pn, BorderLayout.WEST);
        pn.add(comboBox, BorderLayout.CENTER);
        pn.add(lb, BorderLayout.NORTH);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                String mn = (String) comboBox.getSelectedItem();
                lb.setText(mn);
            }
        });
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}