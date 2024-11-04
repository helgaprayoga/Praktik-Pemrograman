import javax.swing.JOptionPane;

public class IndexMatriks {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 9}, {1, 5}};
        int[][] matrix2 = {{1, 5}, {10, 4}};

        int[][] result = new int[matrix1.length][matrix1[0].length];

        System.out.println("Matrix 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        String searchValue = JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari:");
        int value = Integer.parseInt(searchValue);

        boolean found = false;
        String index1 = "";
        for(int i = 0; i<matrix1.length; i++) {
            for(int j = 0; j<matrix1.length; j++) {
                if(matrix1[i][j] == value) {
                    found = true;
                    index1 += "[" + i + "][" + j + "] ";
                }
            }
        }

        String index2 = "";
        for(int i = 0; i<matrix2.length; i++) {
            for(int j = 0; j<matrix2.length; j++) {
                if(matrix2[i][j] == value) {
                    found = true;
                    index2 += "[" + i + "][" + j + "] ";
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        } else {
            JOptionPane.showMessageDialog(null, "Nilai ditemukan pada index " + index1 + index2);
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Jumlah kedua matriks :");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
