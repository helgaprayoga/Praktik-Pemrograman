import javax.swing.JOptionPane;

public class percobaan {
    public static void main(String[] args) {
        int dataSize = 10;
        int[] data = new int[dataSize];

        // Input array elements using JOptionPane
        for (int i = 0; i < dataSize; i++) {
            String input = JOptionPane.showInputDialog("Masukkan Element Index ke " + i);
            data[i] = Integer.parseInt(input);
            System.out.println("Index ke " + i + " adalah " + data[i]);
        }

        // Find maximum and minimum values
        int max = data[0];
        int min = data[0];

        for (int i = 1; i < dataSize; i++) {
            if (data[i] > max) {
                max = data[i];
            } else if (data[i] < min) {
                min = data[i];
            }
        }

        // Display maximum and minimum values using JOptionPane
        String message = "Data Max = " + max + "\nData Min = " + min;
        JOptionPane.showMessageDialog(null, message, "Maximum and Minimum Values", JOptionPane.INFORMATION_MESSAGE);
    }
}