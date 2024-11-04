import java.util.Scanner;

public class Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah baris matriks : ");
        int baris = input.nextInt();
        System.out.print("Jumlah kolom matriks : ");
        int kolom = input.nextInt();

        int [][] matriks = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Elemen [" + i + "][" + j + "] : ");
                matriks[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<matriks.length; i++) {
            for (int j=0; j<matriks[i].length; j++) {
                matriks[i][j] = matriks[i][j] * 5;
            }
        }

        System.out.println("Hasil Matriks");
        for (int i=0; i<matriks.length; i++) {
            for (int j=0; j<matriks.length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
