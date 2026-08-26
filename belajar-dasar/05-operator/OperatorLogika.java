public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // AND - harus dua-duanya true
        System.out.println("true && true  : " + (true && true));   // true
        System.out.println("true && false : " + (true && false));  // false

        // OR - cukup satu true
        System.out.println("true || false : " + (true || false));  // true
        System.out.println("false || false: " + (false || false)); // false

        // NOT - membalik boolean
        System.out.println("!true  : " + (!true));  // false
        System.out.println("!false : " + (!false)); // true

        // CONTOH PRAKTIS
        int umur = 20;
        boolean punyaKTP = true;

        boolean bolehVote = (umur >= 17) && punyaKTP;
        System.out.println("\nUmur " + umur + ", punya KTP: " + punyaKTP);
        System.out.println("Boleh vote: " + bolehVote); // true

        // SHORT-CIRCUIT EVALUATION
        // && berhenti di false pertama, || berhenti di true pertama
        int x = 0;
        boolean result = (x != 0) && (10 / x > 2); // aman karena x != 0 sudah false
        System.out.println("\nShort-circuit result: " + result); // false
    }
}
