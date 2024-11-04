import java.util.Scanner;

// Kelas untuk menyimpan data individu dalam buku alamat
class BukuAlamatEntry {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String alamatEmail;

    // Constructor
    public BukuAlamatEntry(String nama, String alamat, String nomorTelepon, String alamatEmail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.alamatEmail = alamatEmail;
    }

    // Accessor (getter) methods
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    // Mutator (setter) methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }
}

// Kelas untuk buku alamat yang dapat menyimpan hingga 100 entri
class BukuAlamat {
    private BukuAlamatEntry[] entries;
    private int jumlahEntries;

    // Constructor
    public BukuAlamat() {
        entries = new BukuAlamatEntry[100];
        jumlahEntries = 0;
    }

    // Method untuk menambahkan data
    public void masukkanData(BukuAlamatEntry entry) {
        if (jumlahEntries < 100) {
            entries[jumlahEntries] = entry;
            jumlahEntries++;
        } else {
            System.out.println("Buku alamat penuh.");
        }
    }

    // Method untuk menghapus data berdasarkan nama
    public void hapusData(String nama) {
        for (int i = 0; i < jumlahEntries; i++) {
            if (entries[i].getNama().equalsIgnoreCase(nama)) {
                entries[i] = entries[jumlahEntries - 1];
                entries[jumlahEntries - 1] = null;
                jumlahEntries--;
                System.out.println("Data dengan nama " + nama + " telah dihapus.");
                return;
            }
        }
        System.out.println("Data dengan nama " + nama + " tidak ditemukan.");
    }

    // Method untuk menampilkan seluruh data
    public void tampilkanSeluruhData() {
        for (int i = 0; i < jumlahEntries; i++) {
            BukuAlamatEntry entry = entries[i];
            System.out.println("Nama: " + entry.getNama());
            System.out.println("Alamat: " + entry.getAlamat());
            System.out.println("Nomor Telepon: " + entry.getNomorTelepon());
            System.out.println("Alamat E-Mail: " + entry.getAlamatEmail());
            System.out.println("---------------------------");
        }
    }

    // Method untuk memperbarui data berdasarkan nama
    public void updateData(String nama, BukuAlamatEntry updatedEntry) {
        for (int i = 0; i < jumlahEntries; i++) {
            if (entries[i].getNama().equalsIgnoreCase(nama)) {
                entries[i] = updatedEntry;
                System.out.println("Data dengan nama " + nama + " telah diperbarui.");
                return;
            }
        }
        System.out.println("Data dengan nama " + nama + " tidak ditemukan.");
    }
}

// Kelas utama untuk interaksi pengguna
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BukuAlamat bukuAlamat = new BukuAlamat();

        while (true) {
            System.out.println("\nMenu Buku Alamat:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Seluruh Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline setelah nextInt

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon: ");
                    String nomorTelepon = scanner.nextLine();
                    System.out.print("Masukkan Alamat E-Mail: ");
                    String alamatEmail = scanner.nextLine();
                    
                    BukuAlamatEntry entry = new BukuAlamatEntry(nama, alamat, nomorTelepon, alamatEmail);
                    bukuAlamat.masukkanData(entry);
                    System.out.println("Data berhasil ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan Nama yang ingin dihapus: ");
                    String namaHapus = scanner.nextLine();
                    bukuAlamat.hapusData(namaHapus);
                    break;

                case 3:
                    System.out.println("Seluruh Data Buku Alamat:");
                    bukuAlamat.tampilkanSeluruhData();
                    break;

                case 4:
                    System.out.print("Masukkan Nama yang ingin diupdate: ");
                    String namaUpdate = scanner.nextLine();
                    System.out.print("Masukkan Nama Baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan Alamat Baru: ");
                    String alamatBaru = scanner.nextLine();
                    System.out.print("Masukkan Nomor Telepon Baru: ");
                    String nomorTeleponBaru = scanner.nextLine();
                    System.out.print("Masukkan Alamat E-Mail Baru: ");
                    String alamatEmailBaru = scanner.nextLine();

                    BukuAlamatEntry updatedEntry = new BukuAlamatEntry(namaBaru, alamatBaru, nomorTeleponBaru, alamatEmailBaru);
                    bukuAlamat.updateData(namaUpdate, updatedEntry);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}
