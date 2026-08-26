# 04 - Tipe Data Non-Primitive (Wrapper Classes)

File: `TipeData.java`

## Apa itu Wrapper Class?

Setiap primitive di Java punya **versi object-nya** yang disebut wrapper class.

| Primitive | Wrapper |
|-----------|---------|
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

## Kenapa Perlu Wrapper?

1. **Generics** tidak bisa pakai primitive: `ArrayList<int>` tidak legal, harus `ArrayList<Integer>`
2. **Nullable** - object bisa `null`, primitive tidak
3. **Utility methods** - ada method seperti `Integer.parseInt()`, `Integer.toHexString()`

## Deklarasi

```java
Integer iniInteger = 100;      // autoboxing (int -> Integer otomatis)
Long iniLong = 10000L;

Byte iniByte = null;           // bisa null (tidak seperti byte)
System.out.println(iniByte);   // null

iniByte = 100;                 // isi setelah deklarasi
System.out.println(iniByte);   // 100
```

## Autoboxing & Unboxing

```java
// Autoboxing: primitive -> wrapper (otomatis)
int primitive = 42;
Integer object = primitive;   // otomatis dibungkus

// Unboxing: wrapper -> primitive (otomatis)
Integer obj = 100;
int prim = obj;               // otomatis dibuka bungkusnya
```

## Konversi ke Tipe Lain

```java
Integer value = 100;
short s = value.shortValue();   // -> short
long l = value.longValue();     // -> long
float f = value.floatValue();   // -> float
```

Setiap wrapper class punya method `byteValue()`, `shortValue()`, `intValue()`, `longValue()`, `floatValue()`, `doubleValue()` untuk konversi.
