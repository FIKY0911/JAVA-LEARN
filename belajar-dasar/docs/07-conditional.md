# 07 - Kondisional (Pernyataan Kondisi)

File: `IfElse.java`, `SwitchCase.java`

## If-Else

### If Sederhana
```java
if (kondisi) {
    // dieksekusi jika kondisi true
}
```

### If-Else
```java
if (kondisi) {
    // dieksekusi jika true
} else {
    // dieksekusi jika false
}
```

### If-Else If-Else (Chaining)
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

### Ternary Operator

Shortcut untuk if-else satu baris:
```java
int max = (a > b) ? a : b;
// jika a > b maka max = a, selain itu max = b
```

### Nested If

If di dalam if:
```java
if (umur >= 17) {
    if (punyaKTP) {
        System.out.println("Boleh memilih");
    } else {
        System.out.println("Harus punya KTP");
    }
}
```

## Switch

### Basic Switch
```java
switch (nilai) {
    case 1:
        System.out.println("Satu");
        break;
    case 2:
        System.out.println("Dua");
        break;
    default:
        System.out.println("Lainnya");
        break;
}
```

### Switch dengan String
```java
switch (buah) {
    case "apel":
        System.out.println("Merah");
        break;
    case "mangga":
        System.out.println("Kuning");
        break;
}
```

### Fall-Through (Tanpa Break)

Tanpa `break`, eksekusi **lanjut** ke case berikutnya:
```java
switch (2) {
    case 1: System.out.print("Satu ");
    case 2: System.out.print("Dua ");     // tanpa break
    case 3: System.out.print("Tiga ");    // tanpa break
    default: System.out.print("Lainnya");
}
// Output: Dua Tiga Lainnya
```

### Kapan pakai Switch vs If-Else?

- **Switch**: ketika membandingkan **satu variabel** dengan banyak nilai tetap
- **If-else**: ketika kondisi kompleks (range, multiple conditions)
