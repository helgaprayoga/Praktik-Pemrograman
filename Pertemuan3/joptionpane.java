import javax.swing.JOptionPane;

public class joptionpane {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Masukkan Nama Anda");

        String nim = "";
        nim = JOptionPane.showInputDialog("Masukkan NIM Anda");

        String msg = "Hallo Selamat Datang " + name + " " + nim;
        JOptionPane.showMessageDialog(null, msg);
    }
}