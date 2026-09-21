public class EkspresiDanOperan {
    public static void main(String[] args) {
        /*
         * ==========================================================
         * 1. APA ITU OPERAN (OPERAND) DAN OPERATOR?
         * ==========================================================
         * - Operator: Simbol khusus yang melakukan operasi (contoh: +, -, *, /, ==, &&).
         * - Operan (Operand): Nilai, variabel, atau konstanta yang dioperasikan oleh operator.
         *
         * Berdasarkan jumlah operan:
         * a. Unary (1 operan)   : ++x, -a, !kondisi
         * b. Binary (2 operan)  : a + b, x > y, p && q
         * c. Ternary (3 operan) : kondisi ? hasilTrue : hasilFalse
         */

        System.out.println("=== 1. CONTOH OPERAN BERDASARKAN JUMLAHNYA ===");
        int a = 10;
        int b = 5;

        // a. Unary Operator (1 Operan)
        int negatifA = -a;          // '-' adalah operator unary, 'a' adalah 1 operan
        boolean aktif = true;
        boolean tidakAktif = !aktif; // '!' adalah operator unary, 'aktif' adalah 1 operan
        System.out.println("Unary minus (-a)   : " + negatifA);
        System.out.println("Unary NOT (!aktif) : " + tidakAktif);

        // b. Binary Operator (2 Operan)
        int jumlah = a + b;         // '+' adalah operator binary; 'a' (kiri) dan 'b' (kanan) adalah 2 operan
        boolean lebihBesar = a > b; // '>' adalah operator binary; 'a' dan 'b' adalah 2 operan
        System.out.println("Binary (+): a + b  : " + jumlah);
        System.out.println("Binary (>): a > b  : " + lebihBesar);

        // c. Ternary Operator (3 Operan)
        // Format: operan1 (kondisi) ? operan2 (jika true) : operan3 (jika false)
        String status = (a >= 10) ? "Cukup" : "Kurang";
        System.out.println("Ternary (? :)      : " + status);


        /*
         * ==========================================================
         * 2. APA ITU EKSPRESI (EXPRESSION)?
         * ==========================================================
         * Ekspresi adalah kombinasi variabel, konstanta, operator,
         * dan pemanggilan method yang dievaluasi menjadi SATU NILAI.
         */
        System.out.println("\n=== 2. JENIS-JENIS EKSPRESI DI JAVA ===");

        // a. Ekspresi Aritmatika (menghasilkan angka/numerik)
        int ekspresiAritmatika = (a * 2) + (b * 3);
        System.out.println("Ekspresi Aritmatika ((10*2) + (5*3)) : " + ekspresiAritmatika);

        // b. Ekspresi Relasional / Boolean (menghasilkan nilai boolean: true/false)
        boolean ekspresiBoolean = (a > 5) && (b < 10);
        System.out.println("Ekspresi Boolean ((a > 5) && (b < 10)): " + ekspresiBoolean);

        // c. Ekspresi Penggabungan String (menghasilkan teks/String)
        String ekspresiString = "Nilai total = " + ekspresiAritmatika;
        System.out.println("Ekspresi String                      : " + ekspresiString);

        // d. Ekspresi Pemanggilan Method (menghasilkan return value dari method)
        double ekspresiMethod = Math.sqrt(64.0) + Math.max(a, b);
        System.out.println("Ekspresi Pemanggilan Method          : " + ekspresiMethod);

        // e. Ekspresi Penugasan (Assignment Expression)
        int x;
        int y = (x = 20) + 5; // (x = 20) adalah ekspresi penugasan yang menghasilkan nilai 20
        System.out.println("Nilai x: " + x + ", Nilai y: " + y);


        /*
         * ==========================================================
         * 3. PERBEDAAN EKSPRESI, PERNYATAAN (STATEMENT), DAN BLOK
         * ==========================================================
         * - Ekspresi (Expression) : Bagian yang menghasilkan nilai (contoh: a + b, x > 10).
         * - Pernyataan (Statement): Satu instruksi utuh yang dieksekusi, diakhiri titik koma ';'
         * - Blok (Block)          : Sekumpulan pernyataan yang diapit tanda kurung kurawal '{ ... }'
         */
        System.out.println("\n=== 3. EKSPRESI VS PERNYATAAN VS BLOK ===");
        // Ekspresi: (a + b)
        // Pernyataan deklarasi & penugasan: int total = a + b;
        int total = a + b;

        // Blok:
        {
            // Di dalam blok lokal
            int bonus = 5;
            total += bonus; // Pernyataan di dalam blok
            System.out.println("Total dalam blok: " + total);
        }


        /*
         * ==========================================================
         * 4. OPERATOR PRECEDENCE (URUTAN EVALUASI EKSPRESI)
         * ==========================================================
         * Java mengevaluasi operator berdasarkan tingkat prioritasnya:
         * 1. Tanda kurung ()
         * 2. Unary (+, -, ++, --, !)
         * 3. Perkalian, Pembagian, Modulus (*, /, %)
         * 4. Penjumlahan, Pengurangan (+, -)
         * 5. Relasional (<, <=, >, >=, ==, !=)
         * 6. Logika (&&, ||)
         * 7. Ternary (? :)
         * 8. Assignment (=, +=, -=, *=, /=, %=)
         */
        System.out.println("\n=== 4. OPERATOR PRECEDENCE ===");
        int hasil1 = 10 + 5 * 2;     // Perkalian didahulukan: 10 + 10 = 20
        int hasil2 = (10 + 5) * 2;   // Tanda kurung didahulukan: 15 * 2 = 30
        System.out.println("10 + 5 * 2   = " + hasil1);
        System.out.println("(10 + 5) * 2 = " + hasil2);
    }
}
