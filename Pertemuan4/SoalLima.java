import javax.swing.*;
public class SoalLima {
    public static void main(String[] args) {
        String angka=JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan : ");
        
                int n = Integer.parseInt(angka); // Jumlah baris
        
                // Loop untuk setiap baris
                for (int i = 1; i <= n; i++) {
                    // Loop untuk mencetak bintang di sisi kiri
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    
                    // Loop untuk mencetak spasi di tengah
                    for (int j = i - 1; j < n; j++) {
                        System.out.print(" ");
                    }
                    
                    // Loop untuk mencetak bintang di sisi kanan
                    for (int j = i; j <= n; j++) {
                        System.out.print("*");
                    }
                    
                    // Pindah ke baris berikutnya
                    System.out.println();
                }
            }
        }
        



