# 05 - Operator

File: `OperatorAritmatika.java`, `OperatorPerbandingan.java`, `OperatorLogika.java`

## Operator Aritmatika

| Operator | Fungsi | Contoh | Hasil |
|----------|--------|--------|-------|
| `+` | Penjumlahan | `10 + 3` | `13` |
| `-` | Pengurangan | `10 - 3` | `7` |
| `*` | Perkalian | `10 * 3` | `30` |
| `/` | Pembagian (integer) | `10 / 3` | `3` |
| `%` | Modulus (sisa bagi) | `10 % 3` | `1` |

**Penting:** `10 / 3 = 3` (bukan 3.33) karena kedua-duanya `int`.
Untuk hasil desimal, salah satu harus `double`: `10.0 / 3 = 3.333`

### Increment & Decrement

```java
int x = 5;
x++;    // x = x + 1 (post-increment)
++x;    // x = x + 1 (pre-increment)
x--;    // x = x - 1 (post-decrement)
--x;    // x = x - 1 (pre-decrement)
```

**Bedanya:** `x++` pakai dulu baru naik, `++x` naik dulu baru pakai.

### Compound Assignment

```java
int y = 10;
y += 5;   // y = y + 5  -> 15
y -= 3;   // y = y - 3  -> 12
y *= 2;   // y = y * 2  -> 24
y /= 4;   // y = y / 4  -> 6
y %= 4;   // y = y % 4  -> 2
```

## Operator Perbandingan

| Operator | Fungsi | Contoh |
|----------|--------|--------|
| `==` | Sama dengan | `5 == 5` -> `true` |
| `!=` | Tidak sama dengan | `5 != 3` -> `true` |
| `>` | Lebih besar dari | `5 > 3` -> `true` |
| `<` | Lebih kecil dari | `5 < 3` -> `false` |
| `>=` | Lebih besar atau sama | `5 >= 5` -> `true` |
| `<=` | Lebih kecil atau sama | `5 <= 3` -> `false` |

### Perbandingan String

```java
String a = "hello";
String b = new String("hello");

a == b       // false (objek berbeda)
a.equals(b)  // true  (isi sama)
```

**Selalu pakai `.equals()` untuk membandingkan String**, bukan `==`.

## Operator Logika

| Operator | Fungsi | Rule |
|----------|--------|------|
| `&&` | AND | true hanya jika **keduanya** true |
| `\|\|` | OR | true jika **salah satu** true |
| `!` | NOT | membalik boolean |

### Short-Circuit Evaluation

```java
int x = 0;
boolean result = (x != 0) && (10 / x > 2);
// x != 0 sudah false, jadi bagian kedua TIDAK dieksekusi
// ini mencegah ArithmeticException (division by zero)
```

`&&` berhenti di `false` pertama. `||` berhenti di `true` pertama.
