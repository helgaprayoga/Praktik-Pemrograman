public class CobaDoWhile {
    public static void main(String[] args) {

        //menghasilkan angka acak antara 1 sampai 0 menggunakan perulangan do while
        double r=0;
        do{
            r=Math.random();
            System.out.println(r);
        }
        while(r<0.99d);
    }
}
