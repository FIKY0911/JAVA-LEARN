# 06 - String

File: `StringMethod.java`

## String di Java

String di Java adalah **object** (bukan primitive), tapi diperlakukan istimewa dengan sintaks literal (`"hello"`).

**Penting:** String di Java **immutable** - setelah dibuat, tidak bisa diubah. Setiap method menghasilkan String **baru**.

## Method Penting

### Panjang & Akses

```java
String text = "Hello, World!";
text.length();            // 13 - panjang karakter
text.charAt(0);           // 'H' - karakter di index ke-0
text.substring(0, 5);     // "Hello" - potongan dari index 0 sampai sebelum 5
```

### Pencarian

```java
text.indexOf("World");    // 7 - index awal "World" (atau -1 jika tidak ada)
text.contains("World");   // true
text.startsWith("Hello"); // true
text.endsWith("!");       // true
```

### Transformasi

```java
text.toLowerCase();       // "hello, world!"
text.toUpperCase();       // "HELLO, WORLD!"
text.replace("World", "Java");  // "Hello, Java!"
```

### Trim (Hapus Spasi)

```java
String padded = "   hello   ";
padded.trim();            // "hello" - hapus spasi di awal & akhir
```

### Concatenation

```java
String a = "Fiky";
String b = "Ba'dafitro";
String full = a + " " + b;  // "Fiky Ba'dafitro"
```

## Immutability

```java
String original = "hello";
String upper = original.toUpperCase();

System.out.println(original); // "hello" (tetap sama!)
System.out.println(upper);    // "HELLO" (string baru)
```

Method String tidak mengubah original, tapi menghasilkan object baru.
Jika sering concat dalam loop, pakai `StringBuilder` (lebih efisien).
