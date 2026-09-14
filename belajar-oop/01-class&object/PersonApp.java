public class PersonApp {
    public static void main(String[] args) {

        // OBJECT
        // Object adalah instansi dari sebuah class.
        // Membuat object di Java memakai kata kunci `new`.
        // Sintaks: ClassName namaVariabel = new ClassName(...);
        //
        // Setiap object yang dibuat memiliki field dan method-nya sendiri.

        // Membuat object pertama dari class Person
        Person person1 = new Person("Reca", 2);
        System.out.println("Nama: " + person1.name + ", Umur: " + person1.age);
        person1.sayHello("Reca");

        // Membuat object kedua dari class Person (nilainya independen)
        Person person2 = new Person("Budi", 21);
        System.out.println("Nama: " + person2.name + ", Umur: " + person2.age);
        person2.sayHello("Fiky");

        // Membuat object ketiga dengan deklarasi terpisah
        Person person3;
        person3 = new Person("Andi", 19);
        person3.sayHello("Andi");

        // Mengubah field milik object
        person3.name = "Siti";
        System.out.println("Nama setelah diubah: " + person3.name);
        person3.sayHello("Siti");
    }
}
