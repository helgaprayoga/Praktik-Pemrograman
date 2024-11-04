import java.util.Scanner;

public class newMethod {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter/2;
        double luas = Math.PI * Math.pow(jari2,2);
        return luas;
    }

    public void hitungLuasLingkaran(int jari2) {
        double luas = Math.PI * Math.pow(jari2,2);
        System.out.println("Luas lingkaran: " + luas);
    }

    public double volumeTabung(int diameter, int tinggi) {
        int jari2 = diameter/2;
        double volume = Math.PI * Math.pow(jari2,2) * tinggi;
        return volume;
    }

    public double volumeKerucut(int diameter, int tinggi) {
        int jari2 = diameter/2;
        double volume = (1.0/3) * Math.PI * Math.pow(jari2,2) * tinggi;
        return volume;
    }

    public double volumeBola(int diameter) {
        int jari2 = diameter/2;
        double volume = (4.0/3) * Math.PI * Math.pow(jari2,3);
        return volume;
    }

    public static void main(String[] args) {
        newMethod mt = new newMethod(); // corrected here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diameter : ");
        int diameter = scanner.nextInt();

        System.out.print("Tinggi : ");
        int tinggi = scanner.nextInt();

        mt.hitungLuasLingkaran(diameter/2);

        System.out.println("Volume tabung: " + mt.volumeTabung(diameter, tinggi));
        System.out.println("Volume kerucut: " + mt.volumeKerucut(diameter, tinggi));
        System.out.println("Volume bola: " + mt.volumeBola(diameter));

        System.exit(0);
    }
}