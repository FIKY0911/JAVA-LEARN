# 10 - Method & Class Method

File: `Method.java`, `ClassMethod.java`

## Method

Method adalah **blok kode yang bisa dipanggil ulang** dari tempat lain.
Membantu menghindari duplikasi kode (*DRY - Don't Repeat Yourself*) dan membuat program lebih modular serta terstruktur.

## Struktur Method

```java
static returnType namaMethod(tipeParam namaParam) {
    // isi method
    return nilai; // jika bukan void
}
```

| Bagian | Fungsi |
|--------|--------|
| `static` | Menandakan Class Method (bisa dipanggil tanpa membuat objek) |
| `returnType` | Tipe data nilai kembalian (`void` jika tidak mengembalikan nilai) |
| `namaMethod` | Nama method (menggunakan `camelCase`) |
| `parameter` | Input data ke method (bisa lebih dari satu atau kosong) |
| `return` | Nilai output yang dikembalikan ke pemanggil |

---

## Jenis-Jenis Method

### 1. Tanpa Parameter & Tanpa Return (`void`)
```java
static void sapa() {
    System.out.println("Halo!");
}
// Cara panggil: sapa();
```

### 2. Dengan Parameter, Tanpa Return
```java
static void sapaNama(String nama) {
    System.out.println("Halo, " + nama + "!");
}
// Cara panggil: sapaNama("Fiky");
```

### 3. Dengan Return Value
```java
static int tambah(int a, int b) {
    return a + b;
}
// Cara panggil: int hasil = tambah(10, 20);
```

### 4. Dengan Return & Multiple Parameter
```java
static String buatFullName(String depan, String belakang) {
    return depan + " " + belakang;
}
// Cara panggil: String nama = buatFullName("Fiky", "Ba'dafitro");
```

---

## Method Overloading

Method Overloading adalah fitur di Java yang memungkinkan beberapa method memiliki **nama yang sama**, asalkan **tipe atau jumlah parameternya berbeda**.

```java
static int kali(int a, int b) {
    return a * b;
}

static double kali(double a, double b) {
    return a * b;
}
```

Compiler secara otomatis menentukan method yang dipanggil berdasarkan argumen yang dikirim:
```java
kali(5, 3);       // memanggil versi (int, int) -> hasil: 15
kali(2.5, 3.0);   // memanggil versi (double, double) -> hasil: 7.5
```

---

## Class Method vs Instance Method

| Fitur | Class Method (`static`) | Instance Method (non-static) |
|-------|-------------------------|------------------------------|
| **Kata Kunci** | Memiliki kata kunci `static` | Tidak memiliki kata kunci `static` |
| **Kepemilikan** | Milik Class secara keseluruhan | Milik instance / objek spesifik |
| **Pemanggilan** | `NamaClass.namaMethod(...)` tanpa `new` | `namaObjek.namaMethod(...)` butuh `new` |
| **Akses Variabel** | Hanya variabel `static` secara langsung | Bisa mengakses variabel `static` & `instance` (`this`) |
| **Penggunaan Umum** | Fungsi utilitas/helper, operasi matematika | Operasi yang memanipulasi data objek |

### Contoh Class Method (Utility / Helper):
```java
class KalkulatorHelper {
    // Class Method
    public static int tambah(int a, int b) {
        return a + b;
    }
}

// Cara panggil langsung lewat nama class:
int hasil = KalkulatorHelper.tambah(10, 5);
```

### Class Method Bawaan Java (Standard Library):
- **`Math`**: `Math.max(a, b)`, `Math.sqrt(x)`, `Math.pow(a, b)`, `Math.abs(n)`
- **`Integer`**: `Integer.parseInt("123")`
- **`Double`**: `Double.parseDouble("3.14")`
- **`String`**: `String.valueOf(100)`
- **`Character`**: `Character.isDigit('5')`, `Character.toUpperCase('a')`

---

## Cara Jalankan

```bash
cd 10-method
javac Method.java
java Method

javac ClassMethod.java
java ClassMethod
```
