class VariableShadowingDemo {
    String name;
    String address;
    final String country = "Indonesia";

    VariableShadowingDemo(String name, String address) {
        // Variable Shadowing: parameter 'name' dan 'address' menutupi instance field 'name' dan 'address'
        // Akibatnya, nilai parameter diisi ke parameter itu sendiri, bukan ke instance field (this.name & this.address tetap null)
        name = name;
        address = address;
    }

    void sayHello(String paramName) {
        // Karena variabel 'paramName' tidak menutupi field 'name', field 'name' tetap bisa diakses (nilainya null)
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }

    void displayInfo() {
        System.out.println("Nama    : " + name);
        System.out.println("Alamat  : " + address);
        System.out.println("Negara  : " + country);
    }
}
