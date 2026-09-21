# 05 - Operator, Operan & Ekspresi

Materi ini membahas secara komprehensif tentang operator, operan, jenis-jenis ekspresi, perbedaan ekspresi vs pernyataan (*statement*) vs blok (*block*), serta hierarki prioritas evaluasi operator (*operator precedence*).

## Daftar File
- `OperatorAritmatika.java` - Operator aritmatika dasar (`+`, `-`, `*`, `/`, `%`), increment/decrement (`++`, `--`), dan compound assignment (`+=`, `-=`, `*=`, `/=`, `%=`).
- `OperatorPerbandingan.java` - Operator relasional/perbandingan (`==`, `!=`, `>`, `<`, `>=`, `<=`) dan perbandingan String (`.equals()`).
- `OperatorLogika.java` - Operator logika (`&&`, `||`, `!`) dan konsep *short-circuit evaluation*.
- `OperatorTernary.java` - Operator ternary (`? :`) yang membutuhkan 3 operan sebagai shorthand dari `if-else`.
- `EkspresiDanOperan.java` - Demonstrasi konsep operan (unary, binary, ternary), jenis ekspresi, ekspresi vs statement vs blok, dan operator precedence.

---

## 1. Operan (*Operand*) dan Operator

- **Operator**: Simbol khusus yang menginstruksikan compiler untuk melakukan operasi tertentu (seperti `+`, `-`, `*`, `==`, `&&`, `? :`).
- **Operan (*Operand*)**: Nilai, variabel, atau hasil ekspresi yang dioperasikan oleh operator.

### Jenis Berdasarkan Jumlah Operan:
1. **Unary (1 Operan)**:
   - `-x` (negasi numerik)
   - `!kondisi` (pembalik logika)
   - `++x`, `x--` (increment / decrement)
2. **Binary (2 Operan)**:
   - `a + b` (penjumlahan)
   - `x > y` (perbandingan)
   - `p && q` (logika AND)
3. **Ternary (3 Operan)**:
   - `kondisi ? jikaTrue : jikaFalse`

---

## 2. Ekspresi (*Expression*)

**Ekspresi** adalah kombinasi dari literal nilai, variabel, operator, dan pemanggilan method yang dievaluasi oleh Java untuk menghasilkan **satu nilai tunggal**.

### Jenis-Jenis Ekspresi:
- **Ekspresi Aritmatika**: Menghasilkan nilai angka (contoh: `(10 * 2) + 5`).
- **Ekspresi Relasional / Boolean**: Menghasilkan nilai boolean `true`/`false` (contoh: `umur >= 17`).
- **Ekspresi String**: Menghasilkan teks (contoh: `"Halo, " + nama`).
- **Ekspresi Pemanggilan Method**: Menghasilkan return value method (contoh: `Math.max(a, b)`).
- **Ekspresi Penugasan**: Menghasilkan nilai yang di-assign (contoh: `x = 20`).

---

## 3. Perbedaan Ekspresi vs Pernyataan (*Statement*) vs Blok (*Block*)

| Konsep | Penjelasan | Contoh |
|--------|------------|--------|
| **Ekspresi** (*Expression*) | Bagian kode yang menghasilkan nilai | `a + b`, `nilai >= 75` |
| **Pernyataan** (*Statement*) | Satu baris instruksi lengkap yang diakhiri tanda titik koma `;` | `int total = a + b;` |
| **Blok** (*Block*) | Sekumpulan pernyataan yang dikelompokkan di dalam kurung kurawal `{ ... }` | `{ total += 5; System.out.println(total); }` |

---

## 4. Rangkuman Operator di Java

### a. Operator Aritmatika
| Operator | Operasi | Contoh | Hasil |
|----------|---------|--------|-------|
| `+` | Penjumlahan | `10 + 3` | `13` |
| `-` | Pengurangan | `10 - 3` | `7` |
| `*` | Perkalian | `10 * 3` | `30` |
| `/` | Pembagian integer | `10 / 3` | `3` |
| `%` | Modulus (sisa bagi) | `10 % 3` | `1` |

### b. Operator Perbandingan
| Operator | Arti | Contoh |
|----------|------|--------|
| `==` | Sama dengan | `5 == 5` -> `true` |
| `!=` | Tidak sama dengan | `5 != 3` -> `true` |
| `>` | Lebih besar dari | `5 > 3` -> `true` |
| `<` | Lebih kecil dari | `5 < 3` -> `false` |
| `>=` | Lebih besar atau sama | `5 >= 5` -> `true` |
| `<=` | Lebih kecil atau sama | `5 <= 3` -> `false` |

> **Perhatian:** Selalu gunakan method `.equals()` untuk membandingkan isi teks/String, bukan `==`.

### c. Operator Logika & Short-Circuit
| Operator | Logika | Karakteristik |
|----------|--------|---------------|
| `&&` | AND | `true` hanya jika kedua operan bernilai `true` (berhenti di `false` pertama). |
| `\|\|` | OR | `true` jika salah satu operan bernilai `true` (berhenti di `true` pertama). |
| `!` | NOT | Membalikkan nilai boolean (`!true` menjadi `false`). |

### d. Operator Ternary (`? :`)
```java
tipeData variabel = (kondisi) ? nilaiJikaTrue : nilaiJikaFalse;
```
Contoh:
```java
String status = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
```

---

## 5. Operator Precedence (Urutan Prioritas)

Urutan eksekusi evaluasi operator di Java dari tertinggi ke terendah:
1. `()` (Kurung pengelompokan)
2. `++`, `--`, `+`, `-`, `!` (Unary)
3. `*`, `/`, `%` (Multiplikatif)
4. `+`, `-` (Aditif)
5. `<`, `<=`, `>`, `>=` (Relasional)
6. `==`, `!=` (Kesetaraan)
7. `&&` (Logika AND)
8. `||` (Logika OR)
9. `? :` (Ternary)
10. `=`, `+=`, `-=`, `*=`, `/=`, `%=` (Assignment)

---

## Cara Kompilasi dan Eksekusi

```bash
javac *.java
java OperatorAritmatika
java OperatorPerbandingan
java OperatorLogika
java OperatorTernary
java EkspresiDanOperan
```
