import javax.swing.JOptionPane;

public class NewClassIndexArray {
    public static void main(String[] args) {
        int data2 [][] = {{4,6,4,7,8,3,2,10}, {4,6,4,2,8,8,2,10}};

        String input = JOptionPane.showInputDialog("Masukkan Nilai Yang Ingin Anda Cari :");

        int nilai = Integer.parseInt(input);
        String index = "";

        for(int i=0; i<data2.length; i++) {
            for(int j=0; j<data2[i].length; j++) {
                if(data2[i][j] == nilai) {
                    index += "[" + i + "][" + j + "], ";
                }
            }
        }

        if(!index.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nilai ditemukan pada index ke " + index);
        }
    }
}
