import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InputBilangan {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String Bil1 = "";
        String Bil2 = "";
        String Bil3 = "";

        try {
            System.out.print("A = ");
            Bil1 = dataIn.readLine();
            System.out.print("B = ");
            Bil2 = dataIn.readLine();
            System.out.print("C = ");
            Bil3 = dataIn.readLine();

        } catch(IOException e) {
            System.out.print("Error!");
        }
        
        int satu = Integer.parseInt(Bil1);
        int dua = Integer.parseInt(Bil2);
        int tiga = Integer.parseInt(Bil3);
        
        System.out.println("Bilangan 1 = " + satu);
        System.out.println("Bilangan 2 = " + dua);
        System.out.println("Bilangan 3 = " + tiga);

        if (satu <= dua && satu <= tiga) {
            if (dua <= tiga) {
                System.out.println("Urutan bilangan: " + satu + ", " + dua + ", " + tiga);
            } else {
                System.out.println("Urutan bilangan: " + satu + ", " + tiga + ", " + dua) ;
            }
        } else if (dua <= satu && dua <= tiga) {
            if (satu <= tiga) {
                System.out.println("Urutan bilangan: " + dua + ", " + satu + ", " + tiga);
            } else {
                System.out.println("Urutan bilangan: " + dua + ", " + tiga + ", " + satu);
            }
        } else {
            if (satu <= dua)  {
                System.out.println("Urutan bilangan: " + tiga + ", " + satu + ", " + dua) ;
            } else {
                System.out.println("Urutan bilangan: " + tiga + ", " + dua + ", " + satu);
            }
        }
    }
}
