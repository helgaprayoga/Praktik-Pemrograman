import java.util.Scanner;

public class SoalEmpat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan bulat (n): ");
        int n = scanner.nextInt();

        int countGenap = 0;
        int countGanjil = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan bulat " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                countGenap++;
                System.out.println(num + " adalah genap");
            } else {
                countGanjil++;
                System.out.println(num + " adalah ganjil");
            }
        }

        System.out.println("Jumlah bilangan genap: " + countGenap);
        System.out.println("Jumlah bilangan ganjil: " + countGanjil);
    }
}