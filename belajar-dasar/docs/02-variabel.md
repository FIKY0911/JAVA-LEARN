# 02 - Variabel

File: `Variable.java`

## Variabel

Variabel adalah **nama untuk ruang penyimpanan data** di memori.
Di Java, setiap variabel harus punya tipe data yang jelas.

## Deklarasi & Inisialisasi

```java
// Deklarasi dulu, isi belakangan
String name;
name = "Fiky";

// Deklarasi + inisialisasi sekaligus
int age = 20;
String address = "Indonesia";
```

## Tipe Data Dinamis (`var`)

Sejak Java 10, bisa pakai `var` supaya tipe data otomatis dideteksi oleh compiler:

```java
var firstName = "Mohamad";  // compiler tahu ini String
var age = 20;               // compiler tahu ini int
```

**Tapi:** tetap harus ada **inisialisasi** saat deklarasi. Ini tidak legal:
```java
var x;  // ERROR - compiler tidak bisa menebak tipenya
```

## Aturan Penamaan Variabel

| Benar | Salah |
|-------|-------|
| `myName` | `my-name` |
| `age2` | `2age` |
| `_count` | `class` (reserved keyword) |

## Print dengan Concatenation

```java
System.out.print(firstName + " " + middleName + " " + lastName);
```

Operator `+` pada String berfungsi sebagai **penggabung teks** (concatenation).
