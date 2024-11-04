import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoalEmpat {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan jumlah bilangan bulat yang ingin diinput: ");
            int n = Integer.parseInt(reader.readLine());

            int countGenap = 0;
            int countGanjil = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan bulat " + (i + 1) + ": ");
                int num = Integer.parseInt(reader.readLine());

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
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
    }
}