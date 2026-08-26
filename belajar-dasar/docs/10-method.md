# 10 - Method

File: `Method.java`

## Method

Method adalah **blok kode yang bisa dipanggil ulang** dari tempat lain.
Membantu menghindari duplikasi kode dan membuat program lebih terstruktur.

## Struktur Method

```java
static namaMethod(parameter) {
    // isi method
    return nilai; // jika ada return
}
```

| Bagian | Fungsi |
|--------|--------|
| `static` | Bisa dipanggil tanpa buat objek (dari main) |
| `namaMethod` | Nama method (camelCase) |
| `parameter` | Input data ke method |
| `return` | Output dari method |

## Jenis Method

### 1. Tanpa Parameter & Tanpa Return

```java
static void sapa() {
    System.out.println("Halo!");
}
// dipanggil: sapa();
```

### 2. Dengan Parameter, Tanpa Return

```java
static void sapaNama(String nama) {
    System.out.println("Halo, " + nama + "!");
}
// dipanggil: sapaNama("Fiky");
```

### 3. Dengan Return Value

```java
static int tambah(int a, int b) {
    return a + b;
}
// dipanggil: int hasil = tambah(10, 20);
```

### 4. Dengan Return & Multiple Parameter

```java
static String buatFullName(String depan, String belakang) {
    return depan + " " + belakang;
}
// dipanggil: String nama = buatFullName("Fiky", "Budi");
```

## Method Overloading

Beberapa method **nama sama tapi parameter berbeda**:

```java
static int kali(int a, int b) {
    return a * b;
}

static double kali(double a, double b) {
    return a * b;
}
```

Compiler tahu memanggil yang mana berdasarkan **tipe parameter**:
```java
kali(5, 3);       // memanggil versi int
kali(2.5, 3.0);   // memanggil versi double
```

## Method dengan Array

```java
static int cariMax(int[] numbers) {
    int max = numbers[0];
    for (int n : numbers) {
        if (n > max) max = n;
    }
    return max;
}
// dipanggil: int max = cariMax(new int[]{10, 5, 8});
```

## Return

- `return` menghentikan method dan mengembalikan nilai
- Method `void` boleh pakai `return;` (tanpa nilai) untuk keluar lebih awal
- Method dengan return type **harus** punya return di semua path
