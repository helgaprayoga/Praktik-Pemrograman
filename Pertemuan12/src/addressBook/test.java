package addressBook;

import java.sql.*;
import java.util.Scanner;

public class test {
    private String name;
    private String address;
    private int telephoneNumber;
    private String email;
    private Connection connection;
    private Scanner input = new Scanner(System.in);

    // Koneksi ke database
    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/firstdb"; // Ganti dengan nama database Anda
            String user = "root"; // Ganti dengan username MySQL Anda
            String pass = "1234"; // Ganti dengan password MySQL Anda
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected to the database!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to connect to the database!");
        }
    }

    // Konstruktor
    public AddressBook() {
        connectToDatabase();
    }

    // Method untuk mengambil input dari user
    public void getInput() {
        System.out.print("Masukkan Nama: ");
        name = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        address = input.nextLine();

        System.out.print("Masukkan Nomor Telepon: ");
        telephoneNumber = input.nextInt();
        input.nextLine(); // Clear newline

        System.out.print("Masukkan Email: ");
        email = input.nextLine();
    }

    // Method untuk menyimpan data ke database
    public void simpanData() {
        String query = "INSERT INTO nama_nim (Nama, Alamat, Telepon, Email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setInt(3, telephoneNumber);
            pst.setString(4, email);
            pst.executeUpdate();
            System.out.println("Data berhasil disimpan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to save data to the database.");
        }
    }

    // Method untuk menutup koneksi
    public void close() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook(); // Membuat objek AddressBook

        addressBook.getInput();  // Mengambil input dari pengguna
        addressBook.simpanData(); // Menyimpan data ke database
        addressBook.close(); // Menutup koneksi

        System.out.println("Program selesai.");
    }
}
