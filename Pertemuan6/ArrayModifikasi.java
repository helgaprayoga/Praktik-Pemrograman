public class ArrayModifikasi {
    public static void main(String[] args) {
        int baris,kolom;  
        int[][] bil = {
            {1, 2, 35, 7, 10, 29, 27, 67, 90, 16},
            {6, 7, 4, 1, 0, 27, 59, 17, 29, 56},
            {2, 6, 47, 63, 28, 69, 20, 17, 57, 20},
            {10, 0, 6, 3, 78, 9, 20, 58, 26, 89},
            {19, 36, 67, 28, 18, 57, 3, 6, 27, 20},
            {56, 38, 69, 4, 67, 19, 5, 78, 19, 0},
            {2, 67, 28, 68, 26, 57, 40, 27, 58, 39},
            {46, 68, 28, 60, 19, 0, 47, 38, 69, 36},
            {16, 58, 36, 69, 25, 47, 39, 10, 28, 36},
            {2, 68, 39, 9, 27, 56, 7, 10, 49, 57}
            };
            for (baris = 0; baris < 10; baris++ )  {
                for (kolom = 0; kolom < 10; kolom++ ) {
                    System.out.println("Data [" + baris + "," + kolom + "] = " + bil[baris][kolom]);
                }
            }
    }
}