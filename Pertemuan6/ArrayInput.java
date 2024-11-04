import java.util.Scanner;
public class ArrayInput {
    public static void main(String[] args) {
        char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan huruf yang ingin anda cari : ");
        char cari = input.next().charAt(0);
        boolean ditemukan = false;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == cari) {
                System.out.println("Karakter ditemukan");
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Karakter tidak ditemukan");
        }

        input.close();
    }
}
