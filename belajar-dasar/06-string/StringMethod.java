public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello, World!";

        // PANJANG & AKSES
        System.out.println("Length: " + text.length());              // 13
        System.out.println("Char at 0: " + text.charAt(0));         // H
        System.out.println("Substring(0,5): " + text.substring(0, 5)); // Hello

        // PENCARIAN
        System.out.println("Index of 'World': " + text.indexOf("World")); // 7
        System.out.println("Contains 'World': " + text.contains("World")); // true
        System.out.println("Starts with 'Hello': " + text.startsWith("Hello")); // true
        System.out.println("Ends with '!': " + text.endsWith("!")); // true

        // TRANSFORMASI
        System.out.println("Lowercase: " + text.toLowerCase());  // hello, world!
        System.out.println("Uppercase: " + text.toUpperCase());  // HELLO, WORLD!
        System.out.println("Replace: " + text.replace("World", "Java")); // Hello, Java!

        // TRIM - menghapus spasi di awal/akhir
        String padded = "   hello   ";
        System.out.println("Before trim: '" + padded + "'");   // '   hello   '
        System.out.println("After trim:  '" + padded.trim() + "'"); // 'hello'

        // CONCATENATION
        String first = "Fiky";
        String last = "Ba'dafitro";
        String full = first + " " + last;
        System.out.println("\nFull name: " + full);

        // STRING immutabel - method menghasilkan string baru
        String original = "hello";
        String upper = original.toUpperCase();
        System.out.println("Original: " + original); // tetap "hello"
        System.out.println("Upper: " + upper);       // "HELLO"
    }
}
