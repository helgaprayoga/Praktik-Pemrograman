import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nama Mahasiswa :");
    String nama = scanner.nextLine();

    System.out.print("Nomor Mahasiswa :");
    String nomorMahasiswa = scanner.nextLine();
    
    System.out.println("\nData Mahasiswa:");
    System.out.println("Nama Mahasiswa:" + nama);
    System.out.println("Nomor Mahasiswa:" + nomorMahasiswa);

    scanner.close();
    }
} 