import javax.swing.JOptionPane;

public class arraydinamis {
    public static void main(String[] args) {
        int data[] = new int[10];
        for (int a=0; a<data.length; a++) {
            String input = JOptionPane.showInputDialog("Masukkan Element Index ke "+a);
            data[a] = Integer.parseInt(input);
            System.out.println("Index ke " + a + " adalah " + data[a]);
        }
    }
}
