public class DoWhileLoop {
    public static void main(String[] args) {
        // DO-WHILE - dieksekusi minimal sekali, baru cek kondisi
        System.out.println("=== Do-While Loop ===");
        int i = 1;
        do {
            System.out.println("Iterasi ke-" + i);
            i++;
        } while (i <= 5);

        // PERBEDAAN WHILE vs DO-WHILE
        System.out.println("\n=== Perbedaan WHILE vs DO-WHILE ===");
        int x = 10;

        // While: tidak dieksekusi sama sekali karena kondisi false
        while (x < 5) {
            System.out.println("While: " + x);
        }
        System.out.println("While selesai (tidak ada output)");

        // Do-while: dieksekusi sekali meskipun kondisi false
        do {
            System.out.println("Do-While: " + x);
        } while (x < 5);

        // CONTOH PRAKTIS: menu sederhana
        System.out.println("\n=== Simulasi Menu ===");
        int pilihan = 0;
        do {
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Keluar");
            // Simulasi user memilih "3"
            pilihan = 3;
            System.out.println("User memilih: " + pilihan);
        } while (pilihan != 3);

        System.out.println("Program selesai!");
    }
}
