public class WhileLoop {
    public static void main(String[] args) {
        // WHILE LOOP - selama kondisi true
        System.out.println("=== While Loop ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("Iterasi ke-" + i);
            i++;
        }

        // WHILE untuk validasi input
        System.out.println("\n=== Simulasi counting ===");
        int count = 0;
        int target = 10;
        while (count < target) {
            count++;
            if (count == 5) {
                System.out.println("Setengah jalan!");
            }
        }
        System.out.println("Selesai! Count: " + count);

        // WHILE dengan break
        System.out.println("\n=== While + Break ===");
        int angka = 1;
        while (true) { // infinite loop, dihentikan dengan break
            if (angka > 5) break;
            System.out.print(angka + " ");
            angka++;
        }
        System.out.println();
    }
}
