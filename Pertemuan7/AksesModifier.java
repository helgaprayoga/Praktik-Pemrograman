public class AksesModifier {
    public static void main(String[] args) {
        AksesModifier modifier = new AksesModifier();
        modifier.publicMethod();
        modifier.privateMethod();
        modifier.defaultMethod();
        modifier.protectedMethod();
    }

    // Dapat diakses dari mana saja.
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Hanya dapat diakses dalam kelas yang sama.
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Dapat diakses dalam kelas yang sama dan oleh subclass.
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Hanya dapat diakses dalam paket yang sama.
    void defaultMethod() {
        System.out.println("Default method");
    }
}