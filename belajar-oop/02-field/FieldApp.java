public class FieldApp {
    public static void main(String[] args) {
        // Akses static field melalui kelas
        System.out.println("Kategori: " + FieldDemo.kategori);

        // Ubah static field
        FieldDemo.kategori = "Mahasiswa aktif";
        System.out.println("Kategori setelah ubah: " + FieldDemo.kategori);

        // Buat objek dengan default constructor
        FieldDemo f1 = new FieldDemo();
        f1.displayInfo();

        System.out.println("---");

        // Buat objek dengan parameterized constructor
        FieldDemo f2 = new FieldDemo("Budi", 21);
        f2.displayInfo();

        System.out.println("---");

        // Akses langsung ke field
        f2.name = "Andi";
        f2.age = 22;
        System.out.println("Nama setelah ubah: " + f2.name);
    }
}