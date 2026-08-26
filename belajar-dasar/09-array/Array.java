public class Array {
    public static void main(String[] args) {
        // DEKLARASI & INISIALISASI
        int[] angka = {10, 20, 30, 40, 50};
        String[] nama = new String[3]; // array kosong ukuran 3
        nama[0] = "Fiky";
        nama[1] = "Budi";
        nama[2] = "Ani";

        // MENGAKSES ARRAY
        System.out.println("=== Akses Array ===");
        System.out.println("angka[0] = " + angka[0]); // 10
        System.out.println("angka[2] = " + angka[2]); // 30
        System.out.println("nama[1] = " + nama[1]);   // Budi

        // PANJANG ARRAY
        System.out.println("\nPanjang array angka: " + angka.length); // 5

        // LOOPING ARRAY
        System.out.println("\n=== For Loop ===");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }

        System.out.println("\n=== For-Each ===");
        for (String n : nama) {
            System.out.println("Nama: " + n);
        }

        // MODIFIKASI ELEMENT
        System.out.println("\n=== Modifikasi ===");
        angka[2] = 99;
        System.out.println("angka[2] setelah diubah: " + angka[2]); // 99

        // ARRAY DENGAN LOOP - menghitung total
        System.out.println("\n=== Total ===");
        int total = 0;
        for (int a : angka) {
            total += a;
        }
        System.out.println("Total: " + total);

        // ARRAY 2D (multidimensional)
        System.out.println("\n=== Array 2D ===");
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
