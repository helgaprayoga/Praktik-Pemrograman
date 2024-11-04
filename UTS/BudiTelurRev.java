public class BudiTelurRev {
    public static void main(String[] args) {
        int telur = 50; // Banyak telur yang dibeli
        int maxCount = 5; // Budi hanya bisa menghitung sampai 5
        int trips = 0; // Banyaknya Budi bolak balik ke toko

        while (telur > 0) {
            if (telur >= maxCount) {
                telur -= maxCount;
                trips++;
            } else {
                trips++;
                break;
            }
        }
        System.out.println("Beli telur " + telur + " -> Bolak-balik ke toko sebanyak " + trips + " kali.");
    }
}