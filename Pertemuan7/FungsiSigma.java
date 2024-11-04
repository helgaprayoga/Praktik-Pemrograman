public class FungsiSigma {

    public static double hitungSigma(int n, double x) {
        double total = 0;
        for (int i = 1; i <= n; i++) {
            total += (x + 2 * i);
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 5; // Contoh nilai n
        double x = 3; // Contoh nilai x

        double hasil = hitungSigma(n, x);
        System.out.println("Hasil dari sigma (x + 2i) untuk n = " + n + " dan x = " + x + " adalah: " + hasil);
    }
}