public class ConstructorOverloadingApp {
    public static void main(String[] args) {
        // Menggunakan constructor 1 (hanya name)
        ConstructorOverloadingDemo o1 = new ConstructorOverloadingDemo("Ani");
        o1.displayInfo();

        System.out.println("---");

        // Menggunakan constructor 2 (name dan age)
        ConstructorOverloadingDemo o2 = new ConstructorOverloadingDemo("Budi", 25);
        o2.displayInfo();

        System.out.println("---");

        // Menggunakan constructor 3 (name, age, address)
        ConstructorOverloadingDemo o3 = new ConstructorOverloadingDemo("Citra", 22, "Jakarta");
        o3.displayInfo();

        System.out.println("---");

        // Menggunakan constructor 4 (default -> memanggil constructor 1 via this())
        ConstructorOverloadingDemo o4 = new ConstructorOverloadingDemo();
        o4.displayInfo();
    }
}