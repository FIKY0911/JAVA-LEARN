class MethodDemo {
    String name;
    int age;

    MethodDemo(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
    }

    // Method tanpa parameter, tanpa return value
    void sayHello() {
        System.out.println("Hello, nama saya " + name);
    }

    // Method dengan parameter, tanpa return value
    void introduce(String hobby) {
        System.out.println("Nama saya " + name + ", umur " + age + " tahun");
        System.out.println("Hobi saya: " + hobby);
    }

    // Method dengan parameter dan return value (String)
    String getGreeting() {
        return "Halo, perkenalkan nama saya " + name;
    }

    // Method dengan parameter dan return value (int)
    int hitungUmurTahunDepan() {
        return age + 1;
    }

    // Method overloading (method sama nama, parameter beda)
    int tambah(int a, int b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}