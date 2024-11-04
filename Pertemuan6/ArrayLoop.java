public class ArrayLoop {
    public static void main(String[] args) {
        int data2 [][] = {{4,6,4,7,8,3,2,10}, {4,6,4,2,8,8,2,10}};

        System.out.println("====While Loop====");
        int i = 0;
        while(i<data2.length) {
            int j = 0;
            while(j<data2[i].length) {
                System.out.print(data2[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println("====Do While Loop====");
        i = 0;
        do { 
            int j = 0;
            do { 
                System.out.print(data2[i][j] + " ");
                j++;
            } while (j<data2[i].length);
            System.out.println();
            i++;
        } while (i<data2.length);

        System.out.println("====For Loop====");
        for(int k = 0; k<data2.length; k++) {
            for(int l = 0; l<data2[k].length; l++) {
                System.out.print(data2[k][l] + " ");
            }
            System.out.println();
        }

        double sum = 0;
        for(int m = 0; m<data2.length; m++) {
            for(int n = 0; n<data2[m].length; n++) {
                sum += data2[m][n];
            }
        }

        double average = sum / data2.length;

        System.out.println("Nilai rata - rata array : " + average);
    }
}
