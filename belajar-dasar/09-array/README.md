# 09 - Array

Materi ini membahas struktur data Array (larik) 1 dimensi dan multi-dimensi (2D) di Java, cara deklarasi, inisialisasi, pengaksesan elemen, perulangan, dan karakteristiknya.

## Daftar File
- `Array.java` - Deklarasi array, inisialisasi, akses indeks, looping (`for` & `for-each`), modifikasi data, dan Array 2 Dimensi.

---

## 1. Apa itu Array?

Array adalah struktur data yang digunakan untuk menyimpan sekumpulan data dengan **tipe yang sama** secara berurutan dalam memori, dengan kapasitas **ukuran tetap (*fixed size*)** setelah dialokasikan.

---

## 2. Deklarasi & Inisialisasi Array

### a. Langsung Mengisi Nilai (Array Literal)
```java
int[] angka = {10, 20, 30, 40, 50};
String[] nama = {"Fiky", "Budi", "Ani"};
```

### b. Menentukan Ukuran Terlebih Dahulu
```java
int[] data = new int[5]; // Array dengan kapasitas 5 elemen (default nilai: 0)
data[0] = 100;
data[1] = 200;
```

---

## 3. Karakteristik & Aturan Penting

- **Indeks Berbasis Nol (*0-Indexed*)**: Elemen pertama berada pada indeks `0`, dan elemen terakhir pada indeks `panjang - 1`.
- **Field `.length`**: Digunakan untuk mengetahui jumlah elemen array (merupakan properti/field, bukan method, sehingga tanpa kurung `()`).
- **Batas Indeks**: Mengakses indeks di luar rentang akan menyebabkan error `ArrayIndexOutOfBoundsException`.

---

## 4. Array 2 Dimensi (Matriks)

Array 2 Dimensi adalah array yang elemennya berupa array lainnya (baris dan kolom).

```java
int[][] matriks = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Akses baris ke-0, kolom ke-1:
int val = matriks[0][1]; // Nilai: 2
```

---

## Cara Kompilasi dan Eksekusi

```bash
javac Array.java
java Array
```
