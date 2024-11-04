import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class mengurutkanbilangan {
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
        
        int a = Integer.parseInt(Bil1);
        int b = Integer.parseInt(Bil2);
        int c = Integer.parseInt(Bil3);
        
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Urutan bilangan: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Urutan bilangan: " + a + ", " + c + ", " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Urutan bilangan: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Urutan bilangan: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a >= b) {
                System.out.println("Urutan bilangan: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Urutan bilangan: " + c + ", " + b + ", " + a);
            }
        }
    }
}
