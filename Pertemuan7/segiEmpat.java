public class segiEmpat {
    public void segiEmpat(int panjang, int lebar) {
        double luas;
        double keliling;
        luas = panjang*lebar;
        keliling = (2*panjang) + (2*lebar);
        System.out.println("-----------------------");
        System.out.println("Panjang Segi Empat = " + panjang);
        System.out.println("Lebar Segi Empat = " + lebar);
        System.out.println("Luas Segi Empat = " + luas);
        System.out.println("Keliling Segi Empat = " + keliling);
    }

    public static void main(String[] args) {
        segiEmpat se = new segiEmpat();
        se.segiEmpat(10, 5);
    }
}
