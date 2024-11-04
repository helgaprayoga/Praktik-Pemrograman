public class loopingarray {
    public static void main(String[] args) {

        int data [] = {4,6,4,2,8,4,2,11};

        System.out.println("=====while-loop=====");
        int x = 0;
        while (x < data.length) {
            System.out.println(data[x]);
            x++;
        }

        System.out.println();
        System.out.println("=====do-while-loop=====");
        int o = 0;
        do{
            System.out.println(data[o]);
            o++;
        }
        while (o < data.length);

        System.out.println();
        System.out.println("=====for-loop=====");
        for(int i = 0 ; i < data.length ; i++) {
            System.out.println(data[i]);
        }
    }
}
