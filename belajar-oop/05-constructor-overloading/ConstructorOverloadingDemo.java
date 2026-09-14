class ConstructorOverloadingDemo {
    String name;
    int age;
    String address;

    // Constructor 1: hanya name
    ConstructorOverloadingDemo(String paramName) {
        name = paramName;
        age = 0;
        address = "Tidak diketahui";
    }

    // Constructor 2: name dan age
    ConstructorOverloadingDemo(String paramName, int paramAge) {
        name = paramName;
        age = paramAge;
        address = "Tidak diketahui";
    }

    // Constructor 3: name, age, dan address
    ConstructorOverloadingDemo(String paramName, int paramAge, String paramAddress) {
        name = paramName;
        age = paramAge;
        address = paramAddress;
    }

    // Constructor 4: tanpa parameter (default)
    ConstructorOverloadingDemo() {
        this("Unknown"); // memanggil Constructor 1
    }

    void displayInfo() {
        System.out.println("Nama    : " + name);
        System.out.println("Umur    : " + age);
        System.out.println("Alamat  : " + address);
    }
}