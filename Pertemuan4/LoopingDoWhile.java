public class LoopingDoWhile {
    public static void main(String[] args) {

        System.out.println("Output Vertikal");
        int i = 10;
        do{
        System.out.println(i);
        i++;
        }while (i<=20); 

        System.out.println("Output Horizontal");
        int o = 10;
        do{
        System.out.print(o + " ");
        o++;
        }while (o<=20); 
    }
}
