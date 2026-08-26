# 03 - Tipe Data Primitive

File: `TipeDataNumber.java`, `TipeDataChar.java`, `TipeDataString.java`, `Boolean.java`, `KonversiNumber.java`, `KataKunciFinal.java`

## 8 Tipe Data Primitive Java

| Tipe | Ukuran | Nilai Default | Contoh |
|------|--------|---------------|--------|
| `byte` | 1 byte | 0 | `byte x = 120;` |
| `short` | 2 byte | 0 | `short x = 1000;` |
| `int` | 4 byte | 0 | `int x = 100000;` |
| `long` | 8 byte | 0L | `long x = 1000000L;` |
| `float` | 4 byte | 0.0f | `float x = 100.10F;` |
| `double` | 8 byte | 0.0 | `double x = 100.00;` |
| `char` | 2 byte | '\u0000' | `char x = 'A';` |
| `boolean` | 1 bit | false | `boolean x = true;` |

## Number (TipeDataNumber)

### Integer
```java
byte iniByte = 120;       // -128 sampai 127
short iniShort = 1000;    // -32.768 sampai 32.767
int iniInt = 1000000;     // -2 miliar sampai 2 miliar
long iniLong = 100000000L; // pakai suffix L untuk long
```

### Floating Point
```java
float iniFloat = 100.10F;   // suffix F untuk float
double iniDouble = 100.00;  // default untuk desimal
```

### Literals & Underscore
```java
int hexa = 0xFFFFFFF;       // hexadecimal
int binary = 0b100101010;   // binary
long balance = 1_000_000_000_000L;  // underscore untuk keterbacaan
```

## Char (TipeDataChar)

```java
char f = 'F';  // single character, pakai tanda kutip tunggal
```

`char` di Java mendukung **Unicode**, bukan hanya ASCII.

## String (TipeDataString)

```java
String firstName = "Mohamad Fiky";  // tanda kutip ganda
String fullName = firstName + " " + lastName;  // concatenation
```

**Catatan:** String di Java adalah **object**, bukan primitive. Tapi diperlakukan istimewa oleh compiler.

## Boolean

```java
boolean benar = true;
boolean salah = false;
```

Hanya punya dua nilai. Digunakan untuk kondisi di `if`, `while`, dll.

## Konversi Tipe (Casting)

### Widening (otomatis) - kecil ke besar
```java
byte b = 10;
int i = b;    // byte -> int (otomatis, aman)
```

### Narrowing (manual) - besar ke kecil
```java
int i = 1000;
byte b = (byte) i;  // int -> byte (pakai cast manual, bisa kehilangan data)
```

## Kata Kunci `final`

```java
final String NAMA = "Fiky";
NAMA = "Budi";  // ERROR - tidak bisa diubah
```

`final` membuat variabel menjadi **konstanta**. Sekali diisi, tidak bisa diubah.
Konvensi: nama常量 pakai `UPPER_CASE`.
