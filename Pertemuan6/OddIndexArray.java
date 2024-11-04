public class OddIndexArray {
    public static void main(String[] args) {
        int[][] data2 = {
            {4, 6, 4, 7, 8, 3, 2, 10},
            {4, 6, 4, 2, 8, 8, 2, 10}
        };

        System.out.println("Elemen dengan indeks ganjil dalam array:");

        for (int i = 0; i < data2.length; i++) {
            for (int j = 0; j < data2[i].length; j++) {
                if (j % 2 == 1) {  // Memeriksa indeks ganjil
                    System.out.print("data2[" + i + "][" + j + "] = " + data2[i][j] + " ");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
