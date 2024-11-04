
import javax.swing.JOptionPane;

public class VolumeSilinder {
    public static void main(String[] args) {
        double jari = Double.parseDouble(JOptionPane.showInputDialog("Jari - Jari Silinder = "));

        double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Tinggi Silinder = "));

        double volume = 3.14 * jari * jari * tinggi ;

        JOptionPane.showMessageDialog(null, "Volume dari silinder adalah " + volume + "cm");
    }
}
