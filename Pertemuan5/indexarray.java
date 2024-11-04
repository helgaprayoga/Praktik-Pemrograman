import javax.swing.JOptionPane;

public class indexarray {
    public static void main(String[] args) {
        int data [] = {4,6,4,2,8,4,2,11};

        String input = JOptionPane.showInputDialog("Masukkan angka yang ingin anda cari");

        int cari = Integer.parseInt(input);
        String index = "";

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                index += i + " ";
            }
        }
        if (!index.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nilai ditemukan pada indeks ke: " + index);
        } else {
            JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan di dalam array");
        }
    }
}
