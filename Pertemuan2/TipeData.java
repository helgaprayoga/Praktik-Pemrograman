import java.util.Scanner;

public class TipeData {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Umur : ");
    byte umur = scanner.nextByte();

    System.out.print("Tahun Lahir : ");
    short tahunlahir = scanner.nextShort();

    System.out.print("Penghasilan Perbulan : ");
    int penghasilan = scanner.nextInt();

    System.out.print("Nomor HP : ");
    String longValue = scanner.next();

    System.out.print("Berat Badan : ");
    float berat = scanner.nextFloat();

    System.out.print("Nilai pi : ");
    double pi = scanner.nextDouble();

    System.out.print("Kelas : ");
    char kelas = scanner.next().charAt(0);

    System.out.println("\n======Data Anda======");

    System.out.println("Umur : " + umur);
    System.out.println("Tahun Lahir : " + tahunlahir);
    System.out.println("Penghasilan Perbulan : " + penghasilan);
    System.out.println("Nomor HP : " + longValue);
    System.out.println("Berat Badan : " + berat);
    System.out.println("Nilai pi : " + pi);
    System.out.println("Kelas : " + kelas);

    scanner.close();

    }

 
}

