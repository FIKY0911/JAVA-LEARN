# 03 - Tipe Data Primitive

Materi ini membahas 8 tipe data primitif di Java, konversi tipe data (type casting), serta penggunaan kata kunci `final` untuk membuat konstanta.

## Daftar File
- `TipeDataNumber.java` - Bilangan bulat (integer) dan pecahan (floating point)
- `TipeDataChar.java` - Tipe data karakter tunggal (Unicode)
- `TipeDataString.java` - Tipe data teks (String) dan manipulasi dasar
- `Boolean.java` - Tipe data logika boolean (`true` / `false`)
- `KonversiNumber.java` - Konversi tipe data numerik (Widening & Narrowing casting)
- `KataKunciFinal.java` - Konstanta dengan kata kunci `final`

---

## 1. Tabel 8 Tipe Data Primitif Java

| Tipe Data | Ukuran | Nilai Default | Rentang Nilai |
|-----------|--------|---------------|---------------|
| `byte` | 1 byte (8 bit) | `0` | -128 s.d. 127 |
| `short` | 2 byte (16 bit) | `0` | -32,768 s.d. 32,767 |
| `int` | 4 byte (32 bit) | `0` | -2,147,483,648 s.d. 2,147,483,647 |
| `long` | 8 byte (64 bit) | `0L` | -9,223,372,036,854,775,808 s.d. 9,223,372,036,854,775,807 |
| `float` | 4 byte (32 bit) | `0.0f` | Pecahan presisi tunggal (suffix `F`/`f`) |
| `double` | 8 byte (64 bit) | `0.0d` | Pecahan presisi ganda (default untuk desimal) |
| `char` | 2 byte (16 bit) | `'\u0000'` | Karakter tunggal Unicode (tanda petik tunggal `'`) |
| `boolean`| 1 bit | `false` | `true` atau `false` |

---

## 2. Literals & Underscore pada Angka

Java mendukung penulisan angka dengan format berbeda serta penggunaan underscore `_` untuk meningkatkan keterbacaan:
```java
int desimal = 100;
int hex = 0xFF;         // Hexadecimal diawali 0x
int biner = 0b1010;     // Binary diawali 0b
long balance = 1_000_000_000_000L; // Underscore sebagai pemisah ribuan
```

---

## 3. Konversi Tipe Data (Type Casting)

### a. Widening Casting (Otomatis)
Konversi dari tipe data lebih kecil ke lebih besar. Dilakukan otomatis oleh compiler karena tidak ada risiko kehilangan data.
`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`
```java
byte b = 10;
int i = b; // Otomatis
```

### b. Narrowing Casting (Manual)
Konversi dari tipe data lebih besar ke lebih kecil. Wajib ditulis manual dengan casting `(tipeData)` karena berisiko terjadi *overflow* atau pemotongan data.
`double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`
```java
int i = 1000;
byte b = (byte) i; // Manual casting
```

---

## 4. Kata Kunci `final` (Konstanta)

Variabel yang dideklarasikan dengan `final` nilainya bersifat konstan (tidak dapat diubah setelah diinisialisasi).
```java
final double PI = 3.14159;
final String NAMA_APLIKASI = "Belajar Java";
// PI = 3.14; // ERROR: cannot assign a value to final variable
```

Konvensi: Nama konstanta umumnya ditulis dengan huruf kapital penuh menggunakan snake_case (`UPPER_SNAKE_CASE`).

---

## Cara Kompilasi dan Eksekusi

```bash
javac *.java
java TipeDataNumber
java TipeDataChar
java Boolean
java KonversiNumber
java KataKunciFinal
```
