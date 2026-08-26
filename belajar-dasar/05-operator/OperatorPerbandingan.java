public class OperatorPerbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // OPERATOR PERBANDINGAN menghasilkan boolean
        System.out.println("a == b : " + (a == b)); // false (sama dengan)
        System.out.println("a != b : " + (a != b)); // true  (tidak sama dengan)
        System.out.println("a > b  : " + (a > b));  // false (lebih besar dari)
        System.out.println("a < b  : " + (a < b));  // true  (lebih kecil dari)
        System.out.println("a >= b : " + (a >= b)); // false (lebih besar atau sama)
        System.out.println("a <= b : " + (a <= b)); // true  (lebih kecil atau sama)

        // PERBANDINGAN STRING
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("\nString comparison:");
        System.out.println("s1 == s2    : " + (s1 == s2));     // true (same object in pool)
        System.out.println("s1 == s3    : " + (s1 == s3));     // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (same content)
    }
}
