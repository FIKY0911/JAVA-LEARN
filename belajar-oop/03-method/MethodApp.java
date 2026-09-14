public class MethodApp {
    public static void main(String[] args) {
        MethodDemo m = new MethodDemo("Siti", 20);

        // Panggil method tanpa parameter
        m.sayHello();

        System.out.println("---");

        // Panggil method dengan parameter
        m.introduce("membaca");

        System.out.println("---");

        // Panggil method dengan return value
        String greeting = m.getGreeting();
        System.out.println(greeting);

        int umurDepan = m.hitungUmurTahunDepan();
        System.out.println("Umur tahun depan: " + umurDepan);

        System.out.println("---");

        // Method overloading
        System.out.println("tambah(2, 3)    = " + m.tambah(2, 3));
        System.out.println("tambah(2, 3, 5) = " + m.tambah(2, 3, 5));
    }
}