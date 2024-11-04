public class ArrayTakBeraturan {
    public static void main(String[] args) {
        float [] x = {5, 3, 7};
        float total = 0;

        for (int i = 0; i<= 2; i++) {
            total = total + x[i];
        }

        System.out.println("Total = " + total);
    }
}
