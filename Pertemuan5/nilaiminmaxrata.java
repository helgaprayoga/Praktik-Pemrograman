import javax.swing.JOptionPane;

public class nilaiminmaxrata {
    public static void main(String[] args) {

        int data[] = new int[10];
        for (int a=0; a<data.length; a++) {
            String input = JOptionPane.showInputDialog("Masukkan Element Index ke "+a);
            data[a] = Integer.parseInt(input);
            System.out.println("Index ke " + a + " adalah " + data[a]);
        }

        double sum = 0;
        for (int a= 0; a<data.length; a++) {
            sum += data[a];
        }

        double average = (double) sum / data.length;

        int max = data[0];
        int min = data[0];

        for (int a=0; a<data.length; a++) {
            if (data[a] > max) {
                max = data[a];
            }
            else if (data[a] < min) {
                min = data [a];
            }
        }

        String indexmax = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                indexmax += i + " ";
            }
        }

        String indexmin = "";
        for (int i = 0; i < data.length; i++) {
            if (data[i] == min) {
                indexmin += i + " ";
            }
        }

        String message = "Data Max = " + max + "\nData Min = " + min + "\nData Rata Rata = " + average + "\nData Max Berada Pada Index = " + indexmax + "\nData Min Berada Pada Index = " + indexmin;
        JOptionPane.showMessageDialog(null, message, "Nilai Max, Min, dan Rata Rata", JOptionPane.INFORMATION_MESSAGE);
        
        String searchInput = JOptionPane.showInputDialog("Masukkan nilai element yang ingin dicari");
        int searchValue = Integer.parseInt(searchInput);
        boolean found = false;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchValue) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            String newInput = JOptionPane.showInputDialog("Masukkan nilai baru untuk menggantikan nilai " + searchValue);
            int newValue = Integer.parseInt(newInput);
            data[index] = newValue;
            JOptionPane.showMessageDialog(null, "Nilai baru telah diupdate. Berikut adalah array yang diperbarui:", "Update Array", JOptionPane.INFORMATION_MESSAGE);
            for (int i = 0; i < data.length; i++) {
                System.out.println("Index ke " + i + " adalah " + data[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nilai tidak ditemukan dalam array", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

