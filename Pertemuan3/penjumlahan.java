import javax.swing.JOptionPane;
public class penjumlahan {
    public static void main(String[] args) {

        int A = Integer.parseInt(JOptionPane.showInputDialog("Nilai A = "));
        System.out.print("A = ");

        int B = Integer.parseInt(JOptionPane.showInputDialog("Nilai B = "));
        System.out.print("B = ");

        int hasil = A + B;
        String msg = A + " + " + B + " = " + hasil;
        JOptionPane.showMessageDialog(null, msg);
    }
}