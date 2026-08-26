# 01 - Hello World

File: `HelloWorld.java`

## Apa itu Java?

Java adalah bahasa pemrograman **compiled** dan **object-oriented**.
Setiap program Java minimal punya satu class, dan titik masuknya adalah method `main`.

## Struktur Program Java

```java
public class HelloWorld {          // deklarasi class (nama = nama file)
    public static void main(String[] args) {  // method main = titik masuk program
        System.out.println("Hello World");     // cetak teks ke layar
    }
}
```

### Penjelasan

| Kata Kunci | Fungsi |
|-----------|--------|
| `public` | Bisa diakses dari mana saja |
| `class` | Wadah untuk kode Java |
| `static` | Bisa dipanggil tanpa membuat objek |
| `void` | Tidak mengembalikan nilai |
| `String[] args` | Parameter untuk argumen command line |

## Cara Jalankan

```bash
javac HelloWorld.java   // kompilasi -> menghasilkan HelloWorld.class
java HelloWorld          // jalankan
```

Output:
```
Hello World
```

## Catatan

- Nama file **harus sama** dengan nama class.
- Java pakai `camelCase` untuk nama method/variabel, `PascalCase` untuk nama class.
- `System.out.println()` cetak + newline, `System.out.print()` cetak tanpa newline.
