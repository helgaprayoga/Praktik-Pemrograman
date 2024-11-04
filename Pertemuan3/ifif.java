public class ifif {
    public static void main(String[] args) {

        int a = 70;
        if (a > 70) {
            System.out.println("Anda Lulus");
        } else if (a == 70) {
            System.out.println("Nilai Anda KKM");
        } else {
            System.out.println("Anda Tidak Lulus");
        }

        int hari = 4;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            default:
                System.out.println("Salah");
        }
    }
}