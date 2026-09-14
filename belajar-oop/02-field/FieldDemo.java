class FieldDemo {
    // Instance field
    String name;
    int age;

    // Static field (milik kelas, bukan objek)
    static String kategori = "Mahasiswa";

    // Final field (nilainya tidak bisa diubah setelah diinisialisasi)
    final String negara = "Indonesia";

    // Default constructor
    FieldDemo() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    FieldDemo(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
    }

    void displayInfo() {
        System.out.println("Nama     : " + name);
        System.out.println("Umur     : " + age);
        System.out.println("Kategori : " + kategori);
        System.out.println("Negara   : " + negara);
    }
}