public class SoalDuaa {
    public static void main(String[] args) {
                int a = 4;
                int b = 3;
                int c = 5;
                int d = 2;
        
                // Menghitung 4^3
                int hasila = 1;
                for (int i = 0; i < b; i++) {
                    hasila *= a;
                }
                System.out.println("Hasil 4^3 = " + hasila);
        
                // Menghitung 5^2
                int hasilb = 1;
                for (int i = 0; i < d; i++) {
                    hasilb *= c;
                }
                System.out.println("Hasil 5^2 = " + hasilb);
        
                // Menghitung 4^3 + 5^2
                int hasil = hasila + hasilb;
        
                System.out.println("Hasil perhitungan 4^3 + 5^2 adalah: " + hasil);
            
    }
}
