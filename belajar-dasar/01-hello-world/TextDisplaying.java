public class TextDisplaying {
    public static void main(String[] args) {
        // 1. System.out.println() - Mencetak teks dan menambahkan baris baru (newline) di akhir
        System.out.println("=== 1. System.out.println() ===");
        System.out.println("Baris pertama");
        System.out.println("Baris kedua");
        System.out.println(); // Mencetak baris kosong

        // 2. System.out.print() - Mencetak teks TANPA menambahkan baris baru di akhir
        System.out.println("=== 2. System.out.print() ===");
        System.out.print("Teks ini ");
        System.out.print("berada di ");
        System.out.print("satu baris yang sama.\n\n");

        // 3. System.out.printf() & System.out.format() - Mencetak teks dengan format tertentu (formatted output)
        System.out.println("=== 3. System.out.printf() ===");
        String nama = "Fiky";
        int umur = 20;
        double ipk = 3.8567;
        char grade = 'A';
        boolean aktif = true;

        /*
         * Format Specifier umum:
         * %s -> String (teks)
         * %d -> Integer (bilangan bulat desimal)
         * %f -> Floating-point (bilangan desimal/pecahan)
         * %.2f -> Floating-point dengan pembulatan 2 angka di belakang koma
         * %c -> Character (karakter tunggal)
         * %b -> Boolean (true/false)
         * %n -> Newline independen dari sistem operasi
         */
        System.out.printf("Nama  : %s%n", nama);
        System.out.printf("Umur  : %d tahun%n", umur);
        System.out.printf("IPK   : %.2f (asli: %f)%n", ipk, ipk);
        System.out.printf("Grade : %c%n", grade);
        System.out.printf("Aktif : %b%n", aktif);

        // Format lebar dan perataan (width & alignment)
        System.out.println("\n--- Format Lebar dan Tabel ---");
        System.out.printf("%-15s | %-10s | %-8s%n", "NAMA BARANG", "JUMLAH", "HARGA");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s | %-10d | Rp %,d%n", "Buku Tulis", 5, 15000);
        System.out.printf("%-15s | %-10d | Rp %,d%n", "Pensil 2B", 12, 3500);
        System.out.printf("%-15s | %-10d | Rp %,d%n", "Penghapus", 2, 2000);

        // 4. Escape Sequences / Karakter Khusus
        System.out.println("\n=== 4. Escape Sequences ===");
        System.out.println("Baris 1\nBaris 2 (menggunakan \\n)");
        System.out.println("Kolom1\tKolom2\tKolom3 (menggunakan \\t)");
        System.out.println("Dia berkata: \"Belajar Java itu menyenangkan!\" (menggunakan \\\")");
        System.out.println("Karakter petik tunggal: \'A\' (menggunakan \\\')");
        System.out.println("Path direktori: C:\\Users\\Fiky\\Documents (menggunakan \\\\)");
    }
}
