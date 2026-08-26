# 09 - Array

File: `Array.java`

## Array

Array adalah **kumpulan data dengan tipe sama** yang disimpan dalam urutan, dengan ukuran **tetap** setelah dibuat.

## Deklarasi & Inisialisasi

```java
// Cara 1: langsung isi
int[] angka = {10, 20, 30, 40, 50};

// Cara 2: tentukan ukuran, isi nanti
String[] nama = new String[3];
nama[0] = "Fiky";
nama[1] = "Budi";
nama[2] = "Ani";
```

## Mengakses Element

```java
angka[0]   // 10 (index mulai dari 0!)
angka[2]   // 30
nama[1]    // "Budi"
```

## Panjang Array

```java
angka.length   // 5 (bukan method, tapi field)
```

## Iterasi Array

### Pakai For Loop
```java
for (int i = 0; i < angka.length; i++) {
    System.out.println("angka[" + i + "] = " + angka[i]);
}
```

### Pakai For-Each
```java
for (int a : angka) {
    System.out.println("Nilai: " + a);
}
```

## Modifikasi Element

```java
angka[2] = 99;  // ubah element di index 2
```

## Array 2D (Matriks)

```java
int[][] matriks = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Iterasi 2D
for (int i = 0; i < matriks.length; i++) {
    for (int j = 0; j < matriks[i].length; j++) {
        System.out.print(matriks[i][j] + "\t");
    }
    System.out.println();
}
```

## Keterbatasan Array

| Kekurangan | Solusi |
|-----------|--------|
| Ukuran **tetap** setelah dibuat | Pakai `ArrayList` |
| Tidak bisa tambah/hapus element | Pakai `ArrayList` |
| Tipe data harus sama | Pakai `Object[]` atau generic |

## Tips

- Index selalu mulai dari **0**
- Akses di luar index = `ArrayIndexOutOfBoundsException`
- `length` adalah **field**, bukan method - tidak pakai `()`
