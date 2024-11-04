package bukuAlamat;

import java.util.Scanner;

class DataAlamat {
    private String name;
    private String address;
    private String telephone;
    private String email;

    public DataAlamat(String name, String address, String telephone, String email) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Program {
    private DataAlamat[] input;
    private int jumlahInput;

    public Program() {
        input = new DataAlamat[100];
        jumlahInput = 0;
    }

    public void masukkanData(DataAlamat entry) {
        if(jumlahInput < 100) {
            input[jumlahInput] = entry;
            jumlahInput++;
        }
        else {
            System.out.println("Data sudah penuh");
        }
    }

    public void hapusData(String name) {
        for(int i = 0; i < jumlahInput; i++) {
            if(input[i].getName().equalsIgnoreCase(name)) {
                input[i] = input[jumlahInput - 1];
                input[jumlahInput - 1] = null;
                jumlahInput--;
                System.out.println("Data dengan nama " + name + " telah dihapus.");
                return;
            }
        }
    }

    public void tampilkanSeluruhData() {
        for(int i = 0; i < jumlahInput; i++) {
            DataAlamat entry = input[i];
            System.out.println("Nama : " + entry.getName());
            System.out.println("Alamat : " + entry.getAddress());
            System.out.println("Nomor Telepon : " + entry.getTelephone());
            System.out.println("Email : " + entry.getEmail());
            System.out.println("---------------------------------");
        }
    }

    public void updateData(String name, DataAlamat updateEntry) {
        for(int i = 0; i < jumlahInput; i++) {
            if(input[i].getName().equalsIgnoreCase(name)) {
                input[i] = updateEntry;
                System.out.println("Data dengan nama " + name + " telah diperbarui.");
                return;
            }
        }
        System.out.println("Data dengan nama " + name + " tidak ditemukan");
    }

}

public class BukuAlamat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program program = new Program();

        while (true) { 
            System.out.println("\n Menu Buku Alamat :");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Seluruh Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan Nama : ");
                String name = scanner.nextLine();
                System.out.print("Masukkan Alamat : ");
                String address = scanner.nextLine();
                System.out.print("Masukkan Nomor Telepone : ");
                String telephone = scanner.nextLine();
                System.out.print("Masukkan Alamat Email : ");
                String email = scanner.nextLine();

                DataAlamat entry = new DataAlamat(name, address, telephone, email);
                program.masukkanData(entry);
                System.out.println("Data berhasil ditambahkan.");
                break;

                case 2:
                System.out.print("Masukkan nama yang ingin dihapus : ");
                String namaHapus = scanner.nextLine();
                program.hapusData(namaHapus);
                break;

                case 3:
                System.out.println("Seluruh data buku alamat : ");
                program.tampilkanSeluruhData();
                break;

                case 4:
                System.out.print("Masukkan nama yang ingin diupdate : ");
                String namaUpdate = scanner.nextLine();
                System.out.print("Masukkan nama baru : ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan alamat baru : ");
                String alamatBaru = scanner.nextLine();
                System.out.print("Masukkan nomor telepone baru : ");
                String nomorBaru = scanner.nextLine();
                System.out.print("Masukkan email : ");
                String emailBaru = scanner.nextLine();

                DataAlamat updateEntry = new DataAlamat(namaBaru, alamatBaru, nomorBaru, emailBaru);
                program.updateData(namaUpdate, updateEntry);
                break;

                case 5 :
                System.out.println("Keluar dari ptogram.");
                scanner.close();
                return;

                default :
                System.out.println("Opsi tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
