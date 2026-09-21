# 08 - Perulangan (Looping)

Materi ini membahas berbagai jenis struktur kontrol perulangan (*loop*) di Java, termasuk `for`, `for-each`, `while`, `do-while`, serta kontrol aliran perulangan dengan `break` dan `continue`.

## Daftar File
- `ForLoop.java` - Perulangan `for` terhitung, *nested for loop*, dan perulangan `for-each`.
- `WhileLoop.java` - Perulangan `while` berdasarkan kondisi, *infinite loop prevention*, serta penggunaan `break` dan `continue`.
- `DoWhileLoop.java` - Perulangan `do-while` (kondisi dievaluasi di akhir).

---

## 1. Perulangan `for`

Digunakan ketika jumlah perulangan/iterasi sudah diketahui secara pasti.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iterasi ke-" + i);
}
```
- Inisialisasi: `int i = 1` (dijalankan satu kali di awal).
- Kondisi: `i <= 5` (dicek sebelum setiap iterasi dijalankan).
- Step/Increment: `i++` (dijalankan setelah setiap badan perulangan selesai).

### Enhanced For Loop (`for-each`)
Sangat praktis untuk menelusuri elemen Array atau Collection tanpa perlu mengelola variabel indeks manual:
```java
String[] namaBuah = {"Apel", "Mangga", "Jeruk"};
for (String buah : namaBuah) {
    System.out.println(buah);
}
```

---

## 2. Perulangan `while`

Digunakan ketika jumlah iterasi belum pasti dan bergantung pada suatu kondisi logika (kondisi dicek **sebelum** blok kode dieksekusi).

```java
int count = 1;
while (count <= 5) {
    System.out.println("Count: " + count);
    count++; // Pastikan nilai variabel pengubah kondisi di-update!
}
```

---

## 3. Perulangan `do-while`

Mirip dengan `while`, namun evaluasi kondisi dilakukan **di akhir blok**. Artinya, badan perulangan dipastikan **berjalan minimal 1 kali** meskipun kondisinya dari awal bernilai `false`.

```java
int i = 10;
do {
    System.out.println("Nilai i: " + i); // Tetap dieksekusi 1 kali
} while (i < 5);
```

---

## 4. Kata Kunci `break` dan `continue`

- **`break`**: Menghentikan perulangan secara paksa dan keluar dari blok perulangan seutuhnya.
- **`continue`**: Menghentikan/melewatkan (*skip*) sisa kode pada iterasi saat ini, lalu langsung melanjutkan ke iterasi berikutnya.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 3) continue; // Melewati angka 3
    if (i == 8) break;    // Berhenti saat mencapai 8
    System.out.print(i + " "); // Output: 1 2 4 5 6 7
}
```

---

## Cara Kompilasi dan Eksekusi

```bash
javac *.java
java ForLoop
java WhileLoop
java DoWhileLoop
```
