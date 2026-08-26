# 08 - Perulangan (Loop)

File: `ForLoop.java`, `WhileLoop.java`, `DoWhileLoop.java`

## For Loop

Digunakan ketika **jumlah iterasi sudah diketahui**:

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// i = 1    → inisialisasi (sekali)
// i <= 5   → kondisi (dicek setiap iterasi)
// i++      → increment (setelah setiap iterasi)
```

### For-Each (Enhanced For)

Untuk iterasi array/collection tanpa index:
```java
String[] buah = {"apel", "mangga", "jeruk"};
for (String b : buah) {
    System.out.println(b);
}
```

## While Loop

Digunakan ketika **jumlah iterasi tidak diketahui**, bergantung pada kondisi:

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // JANGAN LUPA increment, atau infinite loop!
}
```

## Do-While Loop

Sama seperti while, tapi **dieksekusi minimal sekali** (kondisi dicek di akhir):

```java
int i = 10;
do {
    System.out.println(i);  // tetap jalan meskipun i = 10
} while (i < 5);
// Output: 10 (sekali, lalu berhenti)
```

### Perbedaan While vs Do-While

| | While | Do-While |
|---|-------|----------|
| Kondisi dicek | **Sebelum** eksekusi | **Setelah** eksekusi |
| Minimal jalan | 0 kali | 1 kali |

## Break & Continue

### Break
Keluar dari loop **sepenuhnya**:
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;    // berhenti di 5
    System.out.println(i);
}
// Output: 1, 2, 3, 4
```

### Continue
Skip iterasi saat ini, lanjut ke berikutnya:
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;  // skip 3
    System.out.println(i);
}
// Output: 1, 2, 4, 5
```

## Ringkasan

| Loop | Kapan Dipakai |
|------|---------------|
| `for` | Jumlah iterasi pasti |
| `for-each` | Iterasi array/collection |
| `while` | Jumlah iterasi tidak pasti |
| `do-while` | Minimal harus jalan sekali (contoh: menu) |
