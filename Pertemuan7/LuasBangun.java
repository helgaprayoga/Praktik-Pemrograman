import javax.swing.JOptionPane;

public class LuasBangun {
    public static void main(String[] args) {
        int pilihan = Integer.parseInt(JOptionPane.showInputDialog("Pilih bangun yang ingin dihitung luasnya:\n1. Persegi\n2. Lingkaran\n3. Segitiga"));

        switch (pilihan) {
            case 1:
                int sisi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang sisi persegi:"));
                double luasPersegi = hitungLuasPersegi(sisi);
                JOptionPane.showMessageDialog(null, "Luas persegi adalah: " + luasPersegi);
                break;
            case 2:
                int diameter = Integer.parseInt(JOptionPane.showInputDialog("Masukkan diameter lingkaran:"));
                double luasLingkaran = hitungLuasLingkaran(diameter);
                JOptionPane.showMessageDialog(null, "Luas lingkaran adalah: " + luasLingkaran);
                break;
            case 3:
                int alas = Integer.parseInt(JOptionPane.showInputDialog("Masukkan panjang alas segitiga:"));
                int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
                double luasSegitiga = hitungLuasSegitiga(alas, tinggi);
                JOptionPane.showMessageDialog(null, "Luas segitiga adalah: " + luasSegitiga);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pilihan tidak valid");
        }
    }

    public static double hitungLuasPersegi(int sisi) {
        return Math.pow(sisi, 2);
    }

    public static double hitungLuasLingkaran(int diameter) {
        int jariJari = diameter / 2;
        return Math.PI * Math.pow(jariJari, 2);
    }

    public static double hitungLuasSegitiga(int alas, int tinggi) {
        return (alas * tinggi) / 2;
    }
}