public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // OPERATOR DASAR
        System.out.println("a + b = " + (a + b)); // 13
        System.out.println("a - b = " + (a - b)); // 7
        System.out.println("a * b = " + (a * b)); // 30
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 1 (modulus/sisa bagi)

        // INCREMENT & DECREMENT
        int x = 5;
        System.out.println("\nIncrement:");
        System.out.println("x++ = " + (x++)); // 5 (post-increment, pakai dulu baru naik)
        System.out.println("x sekarang = " + x); // 6
        System.out.println("++x = " + (++x)); // 7 (pre-increment, naik dulu baru pakai)

        System.out.println("\nDecrement:");
        System.out.println("x-- = " + (x--)); // 7 (post-decrement)
        System.out.println("x sekarang = " + x); // 6
        System.out.println("--x = " + (--x)); // 5 (pre-decrement)

        // COMPOUND ASSIGNMENT
        int y = 10;
        y += 5;  // y = y + 5  -> 15
        y -= 3;  // y = y - 3  -> 12
        y *= 2;  // y = y * 2  -> 24
        y /= 4;  // y = y / 4  -> 6
        y %= 4;  // y = y % 4  -> 2
        System.out.println("\nCompound assignment y = " + y); // 2
    }
}
