package belajarsatu;

public class Main {

    public static void main(String[] args){

        //tipe data di java
        //byte, integer, short, long, double, float, chat, boolean

        //byte (satuan)
        byte b = 20;
        System.out.println("=====BYTE=====");
        System.out.println("nilai byte b = " + (b + 1));
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " bytes");
        System.out.println("besar byte = " + Byte.SIZE + " bit");

        //integer (satuan)
        int i = 20;
        System.out.println("=====INTEGER=====");
        System.out.println("nilai integer i = " + (i + 1));
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);


        System.out.println("besar integer = " + Integer.BYTES + " bytes");
        System.out.println("besar integer = " + Integer.SIZE + " bit");

        //short (satuan)
        short s = 20;
        System.out.println("=====SHORT=====");
        System.out.println("nilai short s = " + (s + 1));
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar byte = " + Short.BYTES + " bytes");
        System.out.println("besar byte = " + Short.SIZE + " bit");

        //long (satuan)
        long l = 20L;
        System.out.println("=====LONG=====");
        System.out.println("nilai long l = " + (l + 1));
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar byte = " + Long.BYTES + " bytes");
        System.out.println("besar byte = " + Long.SIZE + " bit");

        //double (koma, bilangan real)
        double d = 10.5d;
        System.out.println("=====DOUBLE=====");
        System.out.println("nilai double = " + (d + 1));
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("besar byte = " + Double.BYTES + " bytes");
        System.out.println("besar byte = " + Double.SIZE + " bit");

        //float (koma, bilangan real)
        float f = 20.5f;
        System.out.println("=====FLOAT=====");
        System.out.println("nilai float = " + (f + 1));
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar byte = " + Float.BYTES + " bytes");
        System.out.println("besar byte = " + Float.SIZE + " bit");

        //char (koma, bilangan real)
        char c = 'c';
        System.out.println("=====CHAR=====");
        System.out.println("nilai char = " + c);
        System.out.println("nilai max = " + Character.MAX_VALUE);
        System.out.println("nilai min = " + Character.MIN_VALUE);
        System.out.println("besar byte = " + Character.BYTES + " bytes");
        System.out.println("besar byte = " + Character.SIZE + " bit");

        //boolean (koma, bilangan real)
        boolean bo = true;
        System.out.println("=====BOOLEAN=====");
        System.out.println("nilai boolean = " + bo);
        System.out.println("nilai max = " + Boolean.TRUE);
        System.out.println("nilai min = " + Boolean.FALSE);

    }
}