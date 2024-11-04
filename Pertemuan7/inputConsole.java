import java.io.*;
public class inputConsole {
    public static String readString() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String string = " ";
        try {
            string = bfr.readLine();
        } catch (IOException ex) {
            System.out.println(ex);
        } return string;
    }

    public static int readInt() {
        return Integer.parseInt (readString());
    }

    public static double readDouble() {
        return Double.parseDouble(readString());
    }
}
