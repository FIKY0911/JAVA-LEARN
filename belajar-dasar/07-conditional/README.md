# 07 - Kondisional (Percabangan)

Materi ini membahas kontrol alur logika keputusan di Java menggunakan percabangan `if`, `if-else`, `if-else if`, *nested if*, serta `switch-case`.

## Daftar File
- `IfElse.java` - Percabangan `if`, `else`, `else if`, *nested if*, dan operator ternary.
- `SwitchCase.java` - Percabangan `switch-case` dengan integer, string, efek *fall-through* tanpa `break`, dan `default`.

---

## 1. Percabangan If-Else

### a. If Sederhana
```java
if (nilai >= 75) {
    System.out.println("Lulus");
}
```

### b. If-Else
```java
if (umur >= 17) {
    System.out.println("Boleh membuat SIM");
} else {
    System.out.println("Belum cukup umur");
}
```

### c. If-Else If-Else Chaining (Banyak Kondisi)
```java
if (nilai >= 90) {
    grade = "A";
} else if (nilai >= 80) {
    grade = "B";
} else if (nilai >= 70) {
    grade = "C";
} else {
    grade = "D";
}
```

### d. Nested If (If Bersarang)
```java
if (umur >= 17) {
    if (punyaKTP) {
        System.out.println("Boleh memilih");
    } else {
        System.out.println("Wajib memiliki KTP terlebih dahulu");
    }
}
```

---

## 2. Percabangan Switch-Case

Percabangan `switch` sangat cocok saat mengevaluasi satu variabel terhadap banyak kemungkinan nilai konstan.

```java
String hari = "Senin";

switch (hari) {
    case "Senin":
        System.out.println("Awal pekan");
        break;
    case "Jumat":
        System.out.println("Menjelang akhir pekan");
        break;
    case "Sabtu":
    case "Minggu":
        System.out.println("Hari libur");
        break;
    default:
        System.out.println("Hari kerja biasa");
        break;
}
```

### Konsep Fall-Through:
Jika kata kunci `break` dihilangkan pada suatu `case`, maka program akan otomatis mengeksekusi blok kode di bawahnya hingga menemukan `break` atau akhir blok `switch`.

---

## 3. Kapan Menggunakan If-Else vs Switch-Case?

- **Gunakan `Switch-Case`**: Saat mencocokkan nilai tunggal diskret yang sudah pasti (misal: menu pilihan, nama hari, kode status).
- **Gunakan `If-Else`**: Saat pengujian melibatkan rentang (*range* nilai, misal `nilai > 80`), kondisi gabungan (`&&`, `||`), atau kondisi ekspresi kompleks.

---

## Cara Kompilasi dan Eksekusi

```bash
javac IfElse.java
java IfElse

javac SwitchCase.java
java SwitchCase
```
