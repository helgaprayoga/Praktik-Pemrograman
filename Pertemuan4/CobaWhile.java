public class CobaWhile {
    public static void main(String[] args) {

        //program menghasilkan angka acak antara 0 sampai 1
        double r = 0;
        while(r<0.99d) {
            //Math.random digunakan untuk menghasilkan angka acak dari 0 sampai 1
            r = Math.random();
            System.out.println(r);
        }
    }
}
