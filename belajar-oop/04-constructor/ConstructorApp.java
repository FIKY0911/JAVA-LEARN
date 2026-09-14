public class ConstructorApp {
    public static void main(String[] args) {
        // Menggunakan default constructor
        ConstructorDemo d1 = new ConstructorDemo();
        d1.displayInfo();

        System.out.println("---");

        // Menggunakan parameterized constructor
        ConstructorDemo d2 = new ConstructorDemo("Rina", 23, "rina@email.com");
        d2.displayInfo();
    }
}