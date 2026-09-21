public class OperatorTernary {
    public static void main(String[] args) {
        /*
         * OPERATOR TERNARY
         * Operator ternary adalah operator yang membutuhkan 3 OPERAN.
         * Sering digunakan sebagai shorthand (penulisan singkat) dari if-else sederhana.
         *
         * Sintaks:
         * tipeData variabel = (kondisi) ? nilaiJikaTrue : nilaiJikaFalse;
         *                      ^^^^^^^     ^^^^^^^^^^^^   ^^^^^^^^^^^^^
         *                      Operan 1      Operan 2       Operan 3
         */

        int nilai = 78;

        // 1. Menggunakan if-else biasa
        String hasilIfElse;
        if (nilai >= 75) {
            hasilIfElse = "Lulus";
        } else {
            hasilIfElse = "Tidak Lulus";
        }
        System.out.println("Hasil If-Else : " + hasilIfElse);

        // 2. Menggunakan Ternary Operator (jauh lebih ringkas)
        String hasilTernary = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println("Hasil Ternary : " + hasilTernary);

        // 3. Contoh Ternary dengan tipe numerik
        int angka = -15;
        int nilaiMutlak = (angka < 0) ? -angka : angka;
        System.out.println("Nilai mutlak dari " + angka + " adalah: " + nilaiMutlak);

        // 4. Nested Ternary (Ternary Bersarang)
        int score = 85;
        String predikat = (score >= 90) ? "A" :
                          (score >= 80) ? "B" :
                          (score >= 70) ? "C" : "D";
        System.out.println("Score: " + score + " -> Predikat: " + predikat);
    }
}
