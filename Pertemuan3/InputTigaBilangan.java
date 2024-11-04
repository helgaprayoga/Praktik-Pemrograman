import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputTigaBilangan {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Menanyakan input bilangan pertama
            System.out.print("Masukkan Nilai Pertama = ");
            String input1 = reader.readLine();
            int nilai1 = Integer.parseInt(input1);

            // Menanyakan input bilangan kedua
            System.out.print("Masukkan Nilai Kedua = ");
            String input2 = reader.readLine();
            int nilai2 = Integer.parseInt(input2);

            // Menanyakan input bilangan ketiga
            System.out.print("Masukkan Nilai Ketiga = ");
            String input3 = reader.readLine();
            int nilai3 = Integer.parseInt(input3);

            // Menampilkan nilai-nilai yang dimasukkan
            System.out.println("Nilai-nilai yang dimasukkan = " + nilai1 + ", " + nilai2 + ", " + nilai3);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input");
        } catch (NumberFormatException e) {
            System.out.println("Input yang dimasukkan harus berupa angka.");
        }
    }
}