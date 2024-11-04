public class TipeMethod {
    // Method Statis
    public static void greet() {
        System.out.println("Hello, World!");
    }

    // Method Non - Statis
    public void display() {
        System.out.println("Display method");
    }

    // Method dengan Parameter
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method Mengembalikan Nilai
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method Void
    public void printMessage() {
        System.out.println("Ini adalah void method.");
    }

    // Panggil dalam main Program
    public static void main(String[] args) {
        greet();
        TipeMethod example = new TipeMethod();
        example.display();
        example.add(5, 10);
        System.out.println("Product: " + example.multiply(3, 4));
        example.printMessage();
    }
}
