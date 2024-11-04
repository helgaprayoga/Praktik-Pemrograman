import java.util.Scanner;

public class IndexArray {
    public static void main(String[] args) {
        int data [] = {3, 8, 5, 9, 8, 6, 1, 0, 8, 7};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai yang ingin anda cari : ");

        int cari = input.nextInt();
        String index = "";

        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                index += i + " ";
            }
        }

        if (!index.isEmpty()) {
            System.out.println("Data ditemukan pada index ke : " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
