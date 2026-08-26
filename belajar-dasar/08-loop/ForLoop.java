public class ForLoop {
    public static void main(String[] args) {
        // FOR LOOP - untuk iterasi dengan jumlah tetap
        System.out.println("=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        // COUNTDOWN
        System.out.println("\n=== Countdown ===");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Go!");

        // FOR-EACH (enhanced for) - untuk array/collection
        System.out.println("\n=== For-Each ===");
        String[] buah = {"apel", "mangga", "jeruk", "pisang"};
        for (String b : buah) {
            System.out.println("Buah: " + b);
        }

        // NESTED FOR
        System.out.println("\n=== Nested For (perkalian) ===");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        // BREAK & CONTINUE
        System.out.println("\n=== Break (berhenti di 3) ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }

        System.out.println("\n=== Continue (skip 3) ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }
}
