# 01 - Hello World & Text Displaying

File: `HelloWorld.java`, `TextDisplaying.java`

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

---

## Text Displaying (Menampilkan Teks)

Di Java, terdapat 3 cara utama untuk menampilkan output teks ke konsol melalui `System.out`:

### 1. `System.out.println()`
Mencetak teks dan otomatis **berpindah ke baris baru** (newline) di akhir.

```java
System.out.println("Baris 1");
System.out.println("Baris 2");
```

### 2. `System.out.print()`
Mencetak teks **tanpa** berpindah ke baris baru (teks berikutnya dicetak bersambung di baris yang sama).

```java
System.out.print("Halo ");
System.out.print("Dunia"); // Hasil: Halo Dunia
```

### 3. `System.out.printf()` & `System.out.format()`
Mencetak teks dengan format tertentu (*formatted output*) menggunakan *format specifiers*.

```java
String nama = "Fiky";
int umur = 20;
double ipk = 3.856;

System.out.printf("Nama: %s, Umur: %d, IPK: %.2f%n", nama, umur, ipk);
// Hasil: Nama: Fiky, Umur: 20, IPK: 3.86
```

#### Format Specifier Umum:
| Specifier | Tipe Data | Keterangan |
|-----------|-----------|------------|
| `%s` | String | Menampilkan teks |
| `%d` | Integer / Bilangan Bulat | Format desimal integer |
| `%f` | Floating Point | Bilangan pecahan (`%.2f` membulatkan 2 desimal) |
| `%c` | Char | Menampilkan karakter tunggal |
| `%b` | Boolean | Menampilkan `true` atau `false` |
| `%n` | Newline | Pindah baris (platform-independent) |
| `%,d` | Integer | Format ribuan dengan koma (contoh: `15,000`) |
| `%-15s` | String | Format rata kiri dengan lebar 15 karakter |

### 4. Escape Sequences (Karakter Khusus)

| Karakter | Arti | Contoh Penggunaan |
|----------|------|-------------------|
| `\n` | Newline (baris baru) | `System.out.println("A\nB");` |
| `\t` | Tab horizontal | `System.out.println("Kolom1\tKolom2");` |
| `\"` | Karakter tanda kutip dua | `System.out.println("Dia berkata \"Halo\"");` |
| `\'` | Karakter tanda kutip satu | `System.out.println('\'');` |
| `\\` | Karakter backslash | `System.out.println("C:\\Windows");` |

---

## Cara Jalankan

```bash
cd 01-hello-world
javac HelloWorld.java
java HelloWorld

javac TextDisplaying.java
java TextDisplaying
```

## Catatan

- Nama file **harus sama** dengan nama class.
- Java pakai `camelCase` untuk nama method/variabel, `PascalCase` untuk nama class.
