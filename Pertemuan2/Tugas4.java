public class Tugas4 {
    
    public static void main(String[] args) {
        
        /* nilai a dan b */
        int a=50;
        double b=40.5;

        /* konversi ke string */
        String konversi_a =String.valueOf(a);
        String konversi_b =String.valueOf(b);

        System.out.println("Integer ke string = " + konversi_a);
        System.out.println("Double ke string = " + konversi_b);

        /* konversi dari string */
        int keinteger =Integer.parseInt(konversi_a);
        double kedouble =Double.parseDouble(konversi_b);

        System.out.println("String ke integer = " + keinteger);
        System.out.println("String ke double = " + kedouble);

    }
}