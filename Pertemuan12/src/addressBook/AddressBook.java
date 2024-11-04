package addressBook;

import java.sql.*;
import java.util.Scanner;

public class AddressBook {
    private String name;
    private String address;
    private String telephoneNumber;
    private String email;
    private Connection connection;
    private Scanner input = new Scanner(System.in);

    private void connectToDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/address_book";
            String user = "root";
            String pass = "1234";
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Successfully connected to the database.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Failed to connect to the database!");
        }
    }

    public AddressBook() {
        connectToDatabase();
    }

    public void getInput() {
        System.out.print("Masukkan Nama: ");
        name = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        address = input.nextLine();

        System.out.print("Masukkan Nomor HP: ");
        telephoneNumber = input.nextLine();

        System.out.print("Masukkan Email: ");
        email = input.nextLine();
    }

    public void simpanData() {
        String query = "INSERT INTO dataaddressbook (name, address, number, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, telephoneNumber);
            pst.setString(4, email);
            pst.executeUpdate();
            System.out.println("Data berhasil disimpan!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.getInput();
        addressBook.simpanData();

        System.out.println("Program selesai.");
    }
}