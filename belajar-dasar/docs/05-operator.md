# 05 - Operator, Operan & Ekspresi

File: `OperatorAritmatika.java`, `OperatorPerbandingan.java`, `OperatorLogika.java`, `OperatorTernary.java`, `EkspresiDanOperan.java`

---

## 1. Operan (Operand) dan Operator

- **Operator**: Simbol khusus yang memberitahu compiler untuk melakukan operasi tertentu (seperti `+`, `-`, `*`, `/`, `==`, `&&`, `? :`).
- **Operan (Operand)**: Nilai, variabel, atau hasil ekspresi yang dioperasikan oleh operator.

### Jenis Berdasarkan Jumlah Operan:

1. **Unary Operator (1 Operan)**
   - `-a` (negatif)
   - `!aktif` (logical NOT)
   - `++x`, `x--` (increment / decrement)

2. **Binary Operator (2 Operan)**
   - `a + b` (penjumlahan)
   - `a > b` (relasional)
   - `x && y` (logika AND)

3. **Ternary Operator (3 Operan)**
   - `kondisi ? ekspresiTrue : ekspresiFalse`

---

## 2. Ekspresi (Expression)

**Ekspresi** adalah kombinasi dari nilai (literal), variabel, operator, dan pemanggilan method yang dievaluasi oleh Java untuk menghasilkan **satu nilai tunggal**.

### Jenis-Jenis Ekspresi:
- **Ekspresi Aritmatika**: Menghasilkan nilai numerik, contoh `(a + 5) * 2`
- **Ekspresi Relasional / Boolean**: Menghasilkan nilai boolean `true` atau `false`, contoh `age >= 17 && punyaKTP`
- **Ekspresi Penggabungan String**: Menghasilkan String, contoh `"Halo " + nama`
- **Ekspresi Pemanggilan Method**: Menghasilkan return value method, contoh `Math.sqrt(25)`
- **Ekspresi Penugasan**: Menghasilkan nilai yang di-assign, contoh `(x = 10)`

### Perbedaan Ekspresi vs Pernyataan (Statement) vs Blok (Block):
| Konsep | Penjelasan | Contoh |
|--------|------------|--------|
| **Ekspresi** (*Expression*) | Bagian kode yang menghasilkan nilai | `a + b`, `x > 5` |
| **Pernyataan** (*Statement*) | Satu baris instruksi lengkap (diakhiri `;`) | `int total = a + b;` |
| **Blok** (*Block*) | Sekumpulan pernyataan di dalam `{ ... }` | `{ total += 5; System.out.println(total); }` |

---

## 3. Operator Aritmatika

| Operator | Fungsi | Contoh | Hasil |
|----------|--------|--------|-------|
| `+` | Penjumlahan | `10 + 3` | `13` |
| `-` | Pengurangan | `10 - 3` | `7` |
| `*` | Perkalian | `10 * 3` | `30` |
| `/` | Pembagian (integer) | `10 / 3` | `3` |
| `%` | Modulus (sisa bagi) | `10 % 3` | `1` |

> **Penting:** `10 / 3 = 3` (bukan 3.33) jika kedua-duanya bernilai `int`. Untuk hasil desimal, salah satu harus `double`: `10.0 / 3 = 3.333`.

### Increment & Decrement
```java
int x = 5;
x++;    // x = x + 1 (post-increment, pakai dulu baru naik)
++x;    // x = x + 1 (pre-increment, naik dulu baru pakai)
x--;    // x = x - 1 (post-decrement)
--x;    // x = x - 1 (pre-decrement)
```

### Compound Assignment
```java
int y = 10;
y += 5;   // y = y + 5  -> 15
y -= 3;   // y = y - 3  -> 12
y *= 2;   // y = y * 2  -> 24
y /= 4;   // y = y / 4  -> 6
y %= 4;   // y = y % 4  -> 2
```

---

## 4. Operator Perbandingan

| Operator | Fungsi | Contoh |
|----------|--------|--------|
| `==` | Sama dengan | `5 == 5` -> `true` |
| `!=` | Tidak sama dengan | `5 != 3` -> `true` |
| `>` | Lebih besar dari | `5 > 3` -> `true` |
| `<` | Lebih kecil dari | `5 < 3` -> `false` |
| `>=` | Lebih besar atau sama | `5 >= 5` -> `true` |
| `<=` | Lebih kecil atau sama | `5 <= 3` -> `false` |

> **Selalu pakai `.equals()` untuk membandingkan String**, bukan `==`.

---

## 5. Operator Logika

| Operator | Fungsi | Rule |
|----------|--------|------|
| `&&` | AND | `true` hanya jika **keduanya** `true` |
| `\|\|` | OR | `true` jika **salah satu** `true` |
| `!` | NOT | Membalik boolean (`!true` -> `false`) |

### Short-Circuit Evaluation
```java
int x = 0;
boolean result = (x != 0) && (10 / x > 2);
// x != 0 sudah false, maka bagian kedua (10 / x > 2) TIDAK dieksekusi.
// Ini mencegah error ArithmeticException (pembagian dengan nol).
```

---

## 6. Operator Ternary (`? :`)

Bentuk ringkas percabangan sederhana yang membutuhkan 3 operan:
```java
tipeData variabel = (kondisi) ? nilaiJikaTrue : nilaiJikaFalse;
```

Contoh:
```java
int nilai = 80;
String status = (nilai >= 75) ? "Lulus" : "Tidak Lulus"; // "Lulus"
```

---

## 7. Operator Precedence (Urutan Evaluasi)

Urutan prioritas eksekusi operator di Java (dari tertinggi ke terendah):
1. Tanda kurung `()`
2. Unary `++`, `--`, `+`, `-`, `!`
3. Multiplikatif `*`, `/`, `%`
4. Aditif `+`, `-`
5. Relasional `<`, `<=`, `>`, `>=`
6. Kesetaraan `==`, `!=`
7. Logika AND `&&`
8. Logika OR `||`
9. Ternary `? :`
10. Assignment `=`, `+=`, `-=`, `*=`, `/=`, `%=`
