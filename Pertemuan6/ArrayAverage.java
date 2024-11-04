import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Jumlah Nilai : ");
        int jumlahmatkul = input.nextInt();

        double [] nilai = new double[jumlahmatkul];
        double totalnilai = 0.0;

        for (int i=0; i<jumlahmatkul; i++) {
            System.out.print("Masukkan Nilai ke-" + (i+1) + ": ");
            nilai[i] = input.nextDouble();
            totalnilai += nilai[i];
        }

        double average = totalnilai / jumlahmatkul;

        System.out.println(nama + ", nilai rata-rata adalah " + average);

        input.close();
    }
}
