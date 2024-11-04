public class SoalDuac {
    public static void main(String[] args) {
        
        int a = 4;
        int b = 2;
        int c = 5;
        int d = 1;
        
        // Menghitung 4^2
        int hasila = 1;
        for (int i = 0; i < b; i++) {
            hasila *= a;
        }
        System.out.println("Hasil 4^2 = " + hasila);

        // Menghitung 5^1
        int hasilc = 1;
        for (int i = 0; i < d; i++) {
            hasilc *= c;
        }
        System.out.println("Hasil 5^1 = " + hasilc);

        int hasil = (hasila + hasilc)/(hasilc + hasila);
        System.out.println(hasila+" + "+hasilc+" / "+hasilc+" + "+hasila+" = "+hasil);
    }
}
