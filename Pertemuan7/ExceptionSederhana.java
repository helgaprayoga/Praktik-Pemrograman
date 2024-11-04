public class ExceptionSederhana {
    public static void main(String[] args) {
        try {
            int[] data = {1, 2, 3};
            System.out.println(data[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            System.out.println("Blok finally dieksekusi.");
        }
    }
}
