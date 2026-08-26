public class IfElse {
    public static void main(String[] args) {
        int umur = 20;

        // IF SEDERHANA
        if (umur >= 17) {
            System.out.println("Umur " + umur + ": Sudah dewasa");
        }

        // IF-ELSE
        int nilai = 75;
        if (nilai >= 70) {
            System.out.println("Nilai " + nilai + ": Lulus");
        } else {
            System.out.println("Nilai " + nilai + ": Tidak lulus");
        }

        // IF-ELSE IF-ELSE (chaining)
        String grade;
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C";
        } else if (nilai >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Nilai " + nilai + " -> Grade: " + grade);

        // TERNARY OPERATOR (shortcut if-else untuk satu expression)
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("\nMax(" + a + ", " + b + ") = " + max);

        // NESTED IF
        boolean punyaKTP = true;
        int umur2 = 20;
        if (umur2 >= 17) {
            if (punyaKTP) {
                System.out.println("\nBoleh memilih");
            } else {
                System.out.println("\nHarus punya KTP dulu");
            }
        } else {
            System.out.println("\nBelum cukup umur");
        }
    }
}
