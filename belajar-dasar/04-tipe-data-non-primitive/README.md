# 04 - Tipe Data Non-Primitive (Wrapper Class)

Materi ini membahas tipe data non-primitive (objek) di Java, khususnya *Wrapper Classes* yang membungkus tipe data primitif menjadi objek.

## Daftar File
- `TipeData.java` - Penggunaan Wrapper Class, nilai `null`, Autoboxing & Unboxing, serta konversi method nilai primitive.

---

## 1. Apa itu Wrapper Class?

Di Java, setiap tipe data primitif memiliki representasi versi objeknya yang disebut **Wrapper Class**.

| Tipe Data Primitif | Wrapper Class (Objek) | Nilai Default |
|--------------------|-----------------------|---------------|
| `byte` | `Byte` | `null` |
| `short` | `Short` | `null` |
| `int` | `Integer` | `null` |
| `long` | `Long` | `null` |
| `float` | `Float` | `null` |
| `double` | `Double` | `null` |
| `char` | `Character` | `null` |
| `boolean` | `Boolean` | `null` |

---

## 2. Mengapa Membutuhkan Wrapper Class?

1. **Dapat Bernilai `null`**: Tipe primitif tidak bisa menampung `null`, sedangkan Wrapper Class sebagai objek bisa bernilai `null` (sangat berguna pada database atau form input).
2. **Dukungan Java Collections & Generics**: Koleksi seperti `ArrayList<Integer>` atau `HashMap<String, Double>` hanya dapat menerima tipe objek, bukan primitif.
3. **Menyediakan Utility Methods**: Memiliki method bantu bawaan seperti `Integer.parseInt()`, `Double.parseDouble()`, `Integer.toBinaryString()`, dll.

---

## 3. Autoboxing dan Unboxing

- **Autoboxing**: Konversi otomatis dari tipe primitif ke objek wrapper oleh compiler.
- **Unboxing**: Konversi otomatis dari objek wrapper kembali ke tipe primitif.

```java
// Autoboxing (int -> Integer)
int angkaPrimitif = 42;
Integer angkaObjek = angkaPrimitif;

// Unboxing (Integer -> int)
Integer nilaiObjek = 100;
int nilaiPrimitif = nilaiObjek;
```

---

## 4. Konversi Nilai Primitif dari Wrapper Class

Setiap wrapper class numerik menyediakan method konversi tipe:
```java
Integer value = 150;

short s = value.shortValue();
long l = value.longValue();
float f = value.floatValue();
double d = value.doubleValue();
```

---

## Cara Kompilasi dan Eksekusi

```bash
javac TipeData.java
java TipeData
```
