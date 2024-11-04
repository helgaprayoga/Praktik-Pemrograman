import javax.swing.JOptionPane;

public class ArrayDemo {
    public static void main(String[] args) {
        // Inisialisasi array
        int[] arr = {10, 20, 30, 20, 50, 60, 70, 80, 90, 20};

        // Meminta input dari pengguna melalui JOptionPane
        String input = JOptionPane.showInputDialog("Masukkan nilai elemen yang ingin dicari:");

        // Konversi input dari String ke integer
        int valueToFind = Integer.parseInt(input);

        // Variabel untuk menyimpan indeks yang ditemukan
        String foundIndices = "";

        // Cari semua posisi indeks dari nilai yang dimasukkan pengguna
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToFind) {
                foundIndices += i + " "; // tambahkan indeks yang ditemukan
            }
        }

        // Menampilkan hasil
        if (!foundIndices.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nilai ditemukan pada indeks ke: " + foundIndices);
        } else {
            JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan di dalam array.");
        }
    }
}
