public class CobaFor1 {
    public static void main(String[] args) {
        
        //program  menghitung luas lingkaran

        for(double jari = 1.0;jari<=2;jari+=0.2) {
            //Math.PI adalah nilai pi

            System.out.println("Radius = " + jari + "Luas = " + jari*Math.PI*jari);
        }
    }
}
