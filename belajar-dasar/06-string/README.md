# 06 - String & String Method

Materi ini membahas tipe data `String` di Java, sifat *immutability* (tidak dapat diubah), dan method-method manipulasi teks yang sering digunakan.

## Daftar File
- `StringMethod.java` - Berbagai method manipulasi String (akses karakter, substring, pencarian, transformasi huruf, replace, trim, dan immutability).

---

## 1. Karakteristik String di Java

1. **Berupa Objek**: String di Java merupakan objek dari class `java.lang.String`.
2. **String Constant Pool**: Java mengoptimalkan penyimpanan String literal di memori *pool*.
3. **Immutable**: Nilai objek String yang sudah dibuat tidak bisa diubah. Operasi modifikasi akan menghasilkan objek String **baru**.

---

## 2. Method-Method Penting pada String

### a. Panjang & Akses Karakter
```java
String text = "Hello, World!";
int len = text.length();        // 13 (panjang teks)
char c = text.charAt(0);        // 'H' (karakter pada indeks ke-0)
String sub = text.substring(0, 5); // "Hello" (potongan indeks 0 s.d. sebelum 5)
```

### b. Pencarian & Validasi
```java
text.indexOf("World");    // 7 (indeks awal kecocokan, atau -1 jika tidak ada)
text.contains("World");   // true (apakah mengandung substring tertentu)
text.startsWith("Hello"); // true (apakah diawali teks tertentu)
text.endsWith("!");       // true (apakah diakhiri teks tertentu)
text.isEmpty();           // false (apakah panjang teks = 0)
```

### c. Transformasi Huruf & Penggantian
```java
text.toLowerCase();              // "hello, world!"
text.toUpperCase();              // "HELLO, WORLD!"
text.replace("World", "Java");   // "Hello, Java!"
```

### d. Membersihkan Spasi (*Trim*)
```java
String padded = "   halo dunia   ";
padded.trim(); // "halo dunia" (menghilangkan spasi di awal dan akhir)
```

---

## 3. Konsep Immutability

```java
String original = "belajar java";
String hasil = original.toUpperCase();

System.out.println(original); // "belajar java" (string asli TIDAK berubah)
System.out.println(hasil);    // "BELAJAR JAVA" (objek baru)
```

> **Tips:** Jika perlu melakukan manipulasi/penggabungan string berkali-kali di dalam perulangan (*loop*), gunakan `StringBuilder` atau `StringBuffer` untuk performa memori yang optimal.

---

## Cara Kompilasi dan Eksekusi

```bash
javac StringMethod.java
java StringMethod
```
