public class ArrayGanjil {
    public static void main (String[] args) {
        char [] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println("ELemen Index ke-" + i + " = " + letters[i]);
            }
        }
    }
}