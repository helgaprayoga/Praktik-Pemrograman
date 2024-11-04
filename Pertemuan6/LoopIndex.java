import javax.swing.JOptionPane;

public class LoopIndex {
    public static void main(String[] args) {
        int data2 [][] = {{4,6,4,2,8,4,2,10}, {4,6,4,2,8,4,2,10}};

        // Mencetak data menggunakan loop
        System.out.println("====For Loop====");
        for(int a = 0; a<data2.length; a++) {
            for(int b = 0; b<data2[a].length; b++) {
                System.out.print(data2[a][b] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("====While Loop====");
        int i = 0;
        while(i<data2.length) {
            int j = 0;
            while(j<data2[i].length) {
                System.out.print(data2[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("====Do While Loop====");
        i = 0;
        do { 
            int j = 0;
            do { 
                System.out.print(data2[i][j] + " ");
                j++;
            } while (j<data2[i].length);
            System.out.println();
            i++;
        } while (i<data2.length);

        // Mencari nilai index
        String searchValue = JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:");
        int value = Integer.parseInt(searchValue);

        
        boolean found = false;
        String index = "";
        for (int c = 0; c < data2.length; c++) {
            for (int j = 0; j < data2[c].length; j++) {
                if (data2[c][j] == value) {
                    found = true;
                    index += "[" + c + "][" + j + "] ";

                    
                    String newValue = JOptionPane.showInputDialog("Masukkan nilai yang baru :");
                    int newValueInt = Integer.parseInt(newValue);
                    data2[c][j] = newValueInt;
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        } else {
            JOptionPane.showMessageDialog(null, "Nilai ditemukan pada index " + index);
            // Display the updated array
            System.out.println("Array terbaru :");
            for (int c = 0; c < data2.length; c++) {
                for (int j = 0; j < data2[c].length; j++) {
                    System.out.print(data2[c][j] + " ");
                }
                System.out.println();
            }
        }

        // Menjumlahkan element pada index ganjil
        int sum = 0;
        for(int o = 0; o<data2.length; o++) {
            for(int p = 0; p<data2[o].length; p++) {
                if(p % 2 == 1) {
                    sum += data2[o][p];
                    System.out.print("data2[" + o + "][" + p + "] = " + data2[o][p] + " ");
                }
            }
            System.out.println();
        }
        JOptionPane.showMessageDialog(null, "Jumlah element index ganjil " + sum);
    }
}
