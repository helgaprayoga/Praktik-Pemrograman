public class BudiTelur {
    public static void main(String[] args) {
        int telur = 21;
        int max = 5;
        int pergi = 0;

        while (telur > 0) {
            int count = Math.min(telur, max);
            telur -= count;
            pergi++;
            System.out.println("Beli telur " + count + " -> Bolak-balik ke toko sebanyak " + pergi + " kali.");
        }
    }
}