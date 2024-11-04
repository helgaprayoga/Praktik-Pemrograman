public class SoalDuab {

    private static long hasil;
    public static void main(String[] args) {
        
        long a = 5;
        long b = 4;
        long faktoriala = 1;
        for(int i = 0; i<=a;i++) {
            faktoriala = 1;
            for(int faktor = 2; faktor<=i; faktor++)
            faktoriala*=faktor;
        }
        System.out.println(a + "! " + "= " + faktoriala);

        long faktorialb = 1;
        for(int i = 0; i<=b;i++) {
            faktorialb = 1;
            for(int faktor = 2; faktor<=i; faktor++)
            faktorialb*=faktor;
        }
        System.out.println(b + "! " + "= " + faktorialb);

        hasil = faktoriala + faktorialb;
        System.out.println("Hasil " + a + "! " + "+ " + b + "!" + " = " + hasil);
    }
}
