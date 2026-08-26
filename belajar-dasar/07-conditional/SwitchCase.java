public class SwitchCase {
    public static void main(String[] args) {
        // SWITCH BASIC - integer
        int hari = 3;
        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Tidak valid";
                break;
        }
        System.out.println("Hari ke-" + hari + ": " + namaHari);

        // SWITCH dengan String
        String buah = "mangga";
        switch (buah) {
            case "apel":
                System.out.println(buah + ": merah");
                break;
            case "mangga":
                System.out.println(buah + ": kuning");
                break;
            case "jeruk":
                System.out.println(buah + ": oranye");
                break;
            default:
                System.out.println(buah + ": warna tidak diketahui");
        }

        // FALL-THROUGH - tanpa break, eksekusi lanjut ke case berikutnya
        System.out.print("\nFall-through: ");
        int angka = 2;
        switch (angka) {
            case 1:
                System.out.print("Satu ");
                // tanpa break, lanjut ke case 2
            case 2:
                System.out.print("Dua ");
                // tanpa break, lanjut ke case 3
            case 3:
                System.out.print("Tiga ");
                break;
            default:
                System.out.print("Lainnya");
        }
        System.out.println(); // Output: Dua Tiga
    }
}
