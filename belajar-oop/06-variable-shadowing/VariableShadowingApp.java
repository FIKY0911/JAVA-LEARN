public class VariableShadowingApp {
    public static void main(String[] args) {
        // Membuat objek VariableShadowingDemo
        VariableShadowingDemo shadowing = new VariableShadowingDemo("Fiky", "Jakarta");

        // Memanggil method sayHello
        shadowing.sayHello("Budi");

        System.out.println("---");

        // Menampilkan info objek
        // Nilai field 'name' dan 'address' akan bernilai null
        // karena terjadi Variable Shadowing pada constructor
        shadowing.displayInfo();
    }
}
