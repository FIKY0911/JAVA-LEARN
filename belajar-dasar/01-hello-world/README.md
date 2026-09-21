# 01 - Hello World & Text Displaying

Materi ini membahas pengenalan dasar struktur program Java dan berbagai teknik menampilkan teks (*text displaying*) ke layar.

## Daftar File
- `HelloWorld.java` - Struktur dasar program Java dan mencetak teks sederhana
- `TextDisplaying.java` - Menampilkan teks menggunakan `print`, `println`, `printf`, format specifiers, dan escape sequences

---

## 1. Struktur Program Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

### Penjelasan Komponen:
- `public class HelloWorld`: Deklarasi kelas publik. Nama kelas **harus sama persis** dengan nama file (`HelloWorld.java`).
- `public static void main(String[] args)`: Method utama (*entry point*) yang pertama kali dijalankan saat program Java dieksekusi.
  - `public`: Dapat diakses oleh Java Runtime dari mana saja.
  - `static`: Dapat dijalankan langsung oleh JVM tanpa harus membuat objek (instansiasi) kelas terlebih dahulu.
  - `void`: Tidak mengembalikan nilai apapun.
  - `String[] args`: Parameter array String untuk menerima argumen baris perintah (*command-line arguments*).

---

## 2. Text Displaying (Menampilkan Teks)

Java menyediakan beberapa cara untuk menampilkan teks melalui `System.out`:

### a. `System.out.println()`
Mencetak teks ke layar dan otomatis menambahkan baris baru (*newline*) di akhir.
```java
System.out.println("Halo!");
System.out.println("Dunia!");
```

### b. `System.out.print()`
Mencetak teks tanpa menambahkan baris baru di akhir (teks selanjutnya dicetak bersambung).
```java
System.out.print("Teks 1 ");
System.out.print("Teks 2");
```

### c. `System.out.printf()` / `System.out.format()`
Mencetak teks dengan format tertentu (*formatted output*) menggunakan penanda format (*format specifiers*).
```java
String nama = "Fiky";
int umur = 20;
double ipk = 3.856;

System.out.printf("Nama: %s, Umur: %d, IPK: %.2f%n", nama, umur, ipk);
```

#### Format Specifiers Populer:
| Specifier | Tipe Data | Keterangan |
|-----------|-----------|------------|
| `%s` | String | Format teks |
| `%d` | Integer | Format bilangan bulat desimal |
| `%f` | Float/Double | Format bilangan pecahan |
| `%.2f` | Float/Double | Membulatkan 2 angka di belakang koma |
| `%c` | Char | Format karakter tunggal |
| `%b` | Boolean | Format boolean (`true`/`false`) |
| `%n` | Newline | Pindah baris (platform-independent) |
| `%-15s` | String | Teks rata kiri dengan lebar 15 karakter |
| `%,d` | Integer | Pemisah ribuan dengan tanda koma (cth: `15,000`) |

### d. Escape Sequences (Karakter Khusus)
| Karakter | Nama | Fungsi |
|----------|------|--------|
| `\n` | Newline | Membuat baris baru |
| `\t` | Tab | Memberi spasi tabulasi |
| `\"` | Double Quote | Menampilkan tanda kutip ganda |
| `\'` | Single Quote | Menampilkan tanda kutip tunggal |
| `\\` | Backslash | Menampilkan tanda garis miring terbalik |

---

## Cara Kompilasi dan Eksekusi

```bash
# Kompilasi
javac HelloWorld.java
javac TextDisplaying.java

# Eksekusi
java HelloWorld
java TextDisplaying
```
