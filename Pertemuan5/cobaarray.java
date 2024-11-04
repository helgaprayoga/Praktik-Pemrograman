import javax.swing.JOptionPane;

public class cobaarray {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Jumlah Element Yang Ingin Di Input:");
        int n = Integer.parseInt(input);

        int[] data = new int[n];
        for (int a = 0; a < n; a++) {
        input = JOptionPane.showInputDialog("Masukkan Element ke " + (a + 1) + ":");
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

        int jumlahganjil = 0;
        for (int i = 0; i < data.length; i++) {
        if (i % 2 != 0) {
        jumlahganjil += data[i];
            }
        }

        String jumlahindex = "Jumlah Element Index Ganjil = " + jumlahganjil;
        JOptionPane.showMessageDialog(null, jumlahindex);

        if (jumlahganjil % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Jumlah Element Index Ganjil Adalah Genap");
          } else {
            JOptionPane.showMessageDialog(null, "Jumlah Element Index Ganjil Adalah Ganjil");
        }

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
              if (data[i] > data[j]) {
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
              }
            }
          }
          String urutanarray = "";
          for (int i = 0; i < data.length; i++) {
            urutanarray += data[i] + " ";
          }
          JOptionPane.showMessageDialog(null, "Urutan Array : " + urutanarray);
        
    }
}
