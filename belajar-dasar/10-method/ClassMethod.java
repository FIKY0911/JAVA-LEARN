// Class pembantu (Helper / Utility Class) yang berisi Class Method (Static Method)
class KalkulatorHelper {
    // Class Method (Static Method): tidak memerlukan pembuatan objek (new)
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double hitungLuasLingkaran(double jariJari) {
        final double PI = 3.14159265359;
        return PI * jariJari * jariJari;
    }
}

// Class dengan perbandingan Class Method vs Instance Method
class Mahasiswa {
    // Instance Variable (milik masing-masing objek)
    String nama;
    int nilai;

    // Static / Class Variable (milik kelas bersama)
    static int jumlahMahasiswa = 0;

    // Constructor
    Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
        jumlahMahasiswa++;
    }

    // Instance Method: butuh objek dibuat terlebih dahulu
    void tampilkanInfo() {
        System.out.println("Nama: " + this.nama + ", Nilai: " + this.nilai);
    }

    // Class Method (Static Method): milik class, dipanggil tanpa objek
    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public static String tentukanKelulusan(int nilai) {
        return (nilai >= 75) ? "LULUS" : "TIDAK LULUS";
    }
}

public class ClassMethod {

    // Class Method di dalam class utama
    static void header(String judul) {
        System.out.println("\n=== " + judul + " ===");
    }

    public static void main(String[] args) {
        /*
         * ==========================================================
         * 1. APA ITU CLASS METHOD (STATIC METHOD)?
         * ==========================================================
         * Class Method adalah method yang didefinisikan dengan kata kunci 'static'.
         * Method ini terikat pada LEVEL CLASS, bukan pada level objek (instance).
         * Kita bisa memanggilnya langsung dengan sintaks:
         *     NamaClass.namaMethod(argumen);
         * TANPA perlu membuat objek menggunakan keyword 'new'.
         */

        header("1. MEMANGGIL CLASS METHOD SENDIRI & CLASS LAIN");

        // Memanggil Class Method di dalam class yang sama
        header("Class Method di Class yang Sama");

        // Memanggil Class Method dari class helper lain (tanpa keyword new)
        int hasilTambah = KalkulatorHelper.tambah(15, 25);
        int hasilKali = KalkulatorHelper.kali(4, 7);
        double luasLingkaran = KalkulatorHelper.hitungLuasLingkaran(7);

        System.out.println("KalkulatorHelper.tambah(15, 25)           = " + hasilTambah);
        System.out.println("KalkulatorHelper.kali(4, 7)              = " + hasilKali);
        System.out.printf("KalkulatorHelper.hitungLuasLingkaran(7)   = %.2f%n", luasLingkaran);


        /*
         * ==========================================================
         * 2. CLASS METHOD VS INSTANCE METHOD
         * ==========================================================
         */
        header("2. CLASS METHOD VS INSTANCE METHOD");

        // Instance Method butuh pembuatan objek (new):
        Mahasiswa mhs1 = new Mahasiswa("Fiky", 90);
        Mahasiswa mhs2 = new Mahasiswa("Budi", 68);

        System.out.println("--- Instance Method (dipanggil dari objek) ---");
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();

        System.out.println("\n--- Class Method (dipanggil langsung dari Class) ---");
        System.out.println("Total mahasiswa terdaftar: " + Mahasiswa.getJumlahMahasiswa());
        System.out.println("Status mhs1 (90): " + Mahasiswa.tentukanKelulusan(90));
        System.out.println("Status mhs2 (68): " + Mahasiswa.tentukanKelulusan(68));


        /*
         * ==========================================================
         * 3. CLASS METHOD BAWAAN JAVA (STANDARD LIBRARY)
         * ==========================================================
         * Java menyediakan banyak class method bawaan yang sering digunakan:
         */
        header("3. CLASS METHOD BAWAAN JAVA (BUILT-IN)");

        // a. Class Math
        System.out.println("Math.max(10, 50)       : " + Math.max(10, 50));
        System.out.println("Math.min(10, 50)       : " + Math.min(10, 50));
        System.out.println("Math.sqrt(49)          : " + Math.sqrt(49));
        System.out.println("Math.pow(2, 3)         : " + Math.pow(2, 3));
        System.out.println("Math.abs(-125)         : " + Math.abs(-125));

        // b. Class Wrapper (Integer, Double, Boolean, dll.)
        int angkaParsed = Integer.parseInt("12345");
        double doubleParsed = Double.parseDouble("98.76");
        System.out.println("Integer.parseInt(\"12345\") : " + (angkaParsed + 5));
        System.out.println("Double.parseDouble(\"98.76\"): " + (doubleParsed + 1.24));

        // c. Class String & Character
        String strAngka = String.valueOf(5000);
        System.out.println("String.valueOf(5000)   : " + strAngka);
        System.out.println("Character.isDigit('8') : " + Character.isDigit('8'));
        System.out.println("Character.toUpperCase('a') : " + Character.toUpperCase('a'));
    }
}
