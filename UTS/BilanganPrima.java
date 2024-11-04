public class BilanganPrima {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (Prima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean Prima(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}