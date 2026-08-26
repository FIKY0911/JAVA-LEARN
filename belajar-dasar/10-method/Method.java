public class Method {

    // METHOD TANPA PARAMETER & RETURN
    static void sapa() {
        System.out.println("Halo! Selamat datang di Java!");
    }

    // METHOD DENGAN PARAMETER
    static void sapaNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // METHOD DENGAN RETURN VALUE
    static int tambah(int a, int b) {
        return a + b;
    }

    // METHOD DENGAN BEBERAPA PARAMETER & RETURN
    static String buatFullName(String depan, String belakang) {
        return depan + " " + belakang;
    }

    // METHOD OVERLOADING - nama sama, parameter berbeda
    static int kali(int a, int b) {
        return a * b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    // METHOD DENGAN ARRAY
    static int cariMax(int[] numbers) {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max) max = n;
        }
        return max;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        // Panggil method tanpa parameter
        sapa();

        // Panggil method dengan parameter
        sapaNama("Fiky");
        sapaNama("Budi");

        // Gunakan return value
        int hasil = tambah(10, 20);
        System.out.println("\n10 + 20 = " + hasil);

        // Langsung di-print
        System.out.println("5 + 3 = " + tambah(5, 3));

        // Method yang mengembalikan String
        String fullName = buatFullName("Fiky", "Ba'dafitro");
        System.out.println("Full name: " + fullName);

        // Method overloading
        System.out.println("\n=== Overloading ===");
        System.out.println("kali(5, 3)     = " + kali(5, 3));       // 15 (int)
        System.out.println("kali(2.5, 3.0) = " + kali(2.5, 3.0)); // 7.5 (double)

        // Method dengan array
        System.out.println("\n=== Method dengan Array ===");
        int[] data = {45, 12, 89, 3, 67};
        System.out.println("Max dari data: " + cariMax(data)); // 89
    }
}
