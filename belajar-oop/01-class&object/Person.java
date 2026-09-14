// CLASS
// Class adalah template/blueprint untuk membuat objek.
// Di dalam class, kita mendefinisikan:
//   - Field (variabel yang merepresentasikan data/objek)
//   - Method (fungsi yang merepresentasikan perilaku/objek)
//   - Constructor (method khusus untuk inisialisasi objek saat dibuat)
//
// Sintaks: class NamaKelas { ... }

class Person {
    // Field: variabel yang menggambarkan data/keadaan sebuah objek
    String name;
    int age;

    // Constructor: method khusus yang otomatis dipanggil
    // saat kita membuat objek baru dengan kata kunci `new`
    Person(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
    }

    // Method: fungsi yang merepresentasikan aksi/perilaku sebuah objek
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + name);
    }
}
