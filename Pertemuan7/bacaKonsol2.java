import java.util.Scanner;

public class bacaKonsol2 {
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
        System.out.print("data1 = ");
        int data1 = ic.nextInt();
        System.out.print("data2 = ");
        int data2 = ic.nextInt();
        int data3 = data1 + data2;
        System.out.println("data1 + data2 = " + data3);
    }
}