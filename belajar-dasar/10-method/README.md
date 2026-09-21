# 10 - Method & Class Method

Materi ini membahas struktur method di Java, parameter, return value, *method overloading*, serta perbedaan mendasar antara **Class Method (*static method*)** dan **Instance Method (*non-static*)**.

## Daftar File
- `Method.java` - Method tanpa parameter/return (`void`), method dengan parameter, method return value, method overloading, dan method yang menerima array.
- `ClassMethod.java` - Class Method (`static`), perbandingan Class Method vs Instance Method, Utility/Helper class, serta Class Method bawaan Java (Standard Library: `Math`, `Integer`, `Double`, `String`, `Character`).

---

## 1. Apa itu Method?

Method adalah **blok kode yang dapat dipanggil kembali (*reusable*)** untuk menjalankan tugas tertentu. Method mencegah duplikasi kode (*DRY - Don't Repeat Yourself*) dan menjadikan program lebih modular serta mudah dirawat.

---

## 2. Struktur Dasar Method

```java
static returnType namaMethod(tipeParam namaParam) {
    // Badan method
    return nilai; // Wajib jika tipe kembalian bukan void
}
```

- `static`: Menandakan Class Method (bisa dipanggil langsung tanpa perlu membuat objek).
- `returnType`: Tipe data yang dikembalikan oleh method (`void` jika tidak menghasilkan nilai).
- `namaMethod`: Nama method (menggunakan format `camelCase`).
- `parameter`: Input data yang dikirimkan ke dalam method saat dipanggil.

---

## 3. Jenis-Jenis Method

### a. Method `void` (Tanpa Return Value)
```java
static void sapaNama(String nama) {
    System.out.println("Halo, " + nama + "!");
}
```

### b. Method dengan Nilai Balik (*Return Value*)
```java
static int tambah(int a, int b) {
    return a + b;
}
```

### c. Method Overloading
Membuat beberapa method dengan **nama yang sama**, tetapi memiliki **tipe atau jumlah parameter yang berbeda**.
```java
static int hitung(int a, int b) { return a + b; }
static double hitung(double a, double b) { return a + b; }
```

---

## 4. Class Method vs Instance Method

| Karakteristik | Class Method (`static`) | Instance Method (non-static) |
|---|---|---|
| **Deklarasi** | Menggunakan kata kunci `static` | Tanpa kata kunci `static` |
| **Kepemilikan** | Terikat pada Class secara keseluruhan | Terikat pada objek (*instance*) spesifik |
| **Pemanggilan** | `NamaClass.namaMethod(...)` tanpa `new` | `objek.namaMethod(...)` membutuhkan `new` |
| **Akses State** | Hanya variabel `static` secara langsung | Bisa mengakses variabel `instance` (`this`) & `static` |
| **Tujuan Umum** | Operasi utilitas (*helper*), fungsi matematika, konversi data | Operasi logika yang memodifikasi/membaca status data objek |

### Contoh Class Method Bawaan Java (Built-in):
- **`Math`**: `Math.max(10, 20)`, `Math.sqrt(25.0)`, `Math.pow(2, 3)`
- **`Integer`**: `Integer.parseInt("100")`
- **`Double`**: `Double.parseDouble("3.14")`
- **`String`**: `String.valueOf(500)`
- **`Character`**: `Character.isDigit('9')`

---

## Cara Kompilasi dan Eksekusi

```bash
javac Method.java
java Method

javac ClassMethod.java
java ClassMethod
```
