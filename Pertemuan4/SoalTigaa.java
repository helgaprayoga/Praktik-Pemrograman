import java.util.Scanner;

public class SoalTigaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Masukkan angka dari 1-10" + " : ");
            int angka = input.nextInt();
            
            if (angka == 1) {
                System.out.println("Satu");
            } else if (angka == 2) {
                System.out.println("Dua");
            } else if (angka == 3) {
                System.out.println("Tiga");
            } else if (angka == 4) {
                System.out.println("Empat");
            } else if (angka == 5) {
                System.out.println("Lima");
            } else if (angka == 6) {
                System.out.println("Enam");
            } else if (angka == 7) {
                System.out.println("Tujuh");
            } else if (angka == 8) {
                System.out.println("Delapan");
            } else if (angka == 9) {
                System.out.println("Sembilan");
            } else if (angka == 10) {
                System.out.println("Sepuluh");
            } else {
                System.out.println("Invalid Number");
            }
            
        input.close();
    }
}