public class jumlahganjilgenap {
    public static void main(String[] args) {
        int [] nilai = {2,4,5,3,7,9};

        int genap = 0;
        for(int i=0 ; i< nilai.length; i++) {
            int x = nilai[i];
            if (nilai[i]/2 == x/2){
                genap = genap+1;
            }
        }
        System.out.println(genap);
    }
}
