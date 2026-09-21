# 02 - Variabel & Deklarasi

Materi ini membahas konsep variabel, deklarasi, inisialisasi, dan penggunaan tipe data dinamis (`var`) di Java.

## Daftar File
- `Variable.java` - Contoh deklarasi variabel, inisialisasi, penggunaan `var`, dan penggabungan teks (*concatenation*).

---

## 1. Apa itu Variabel?

Variabel adalah **nama untuk lokasi memori** yang digunakan untuk menyimpan data. Di Java yang bersifat *strongly-typed*, setiap variabel harus memiliki tipe data yang sudah ditentukan sebelum digunakan.

---

## 2. Deklarasi & Inisialisasi

Ada dua cara mendefinisikan variabel:

### a. Deklarasi Terlebih Dahulu, Inisialisasi Belakangan
```java
String name;            // Deklarasi variabel
name = "Mohamad Fiky";  // Inisialisasi nilai
```

### b. Deklarasi dan Inisialisasi Sekaligus
```java
int age = 20;
String address = "Indonesia";
```

---

## 3. Tipe Data Dinamis (`var`)

Mulai Java 10, Java memperkenalkan kata kunci `var` (*Local-Variable Type Inference*). Compiler Java akan otomatis mendeteksi tipe data dari nilai inisialisasinya.

```java
var firstName = "Mohamad";  // Otomatis bertipe String
var age = 20;               // Otomatis bertipe int
var address = "Indonesia";  // Otomatis bertipe String
```

> **Catatan Penting:** Saat menggunakan `var`, variabel **wajib langsung diinisialisasi**.
> ```java
> var x; // ERROR: compiler tidak bisa menebak tipe data tanpa nilai awal
> ```

---

## 4. Aturan Penamaan Variabel (Identifier)

| Benar | Salah | Alasan Salah |
|-------|-------|--------------|
| `firstName` | `first-name` | Tanda minus `-` tidak diperbolehkan |
| `totalNilai` | `total Nilai` | Tidak boleh ada spasi |
| `score2` | `2score` | Tidak boleh diawali angka |
| `_address` | `class` | `class` adalah reserved keyword di Java |

Gunakan konvensi **camelCase** untuk penamaan variabel di Java (contoh: `namaLengkap`, `nomorTelepon`).

---

## 5. String Concatenation

Operator `+` yang digunakan pada teks (String) berfungsi untuk menggabungkan teks (*concatenation*):
```java
System.out.print(firstName + " " + middleName + " " + lastName);
```

---

## Cara Kompilasi dan Eksekusi

```bash
javac Variable.java
java Variable
```
