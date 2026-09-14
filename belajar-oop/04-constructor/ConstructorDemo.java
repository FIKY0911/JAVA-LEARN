class ConstructorDemo {
    String name;
    int age;
    String email;

    // Default constructor (tidak ada parameter)
    ConstructorDemo() {
        name = "Anonymous";
        age = 0;
        email = "no-email@example.com";
    }

    // Parameterized constructor
    ConstructorDemo(String paramName, int paramAge, String paramEmail) {
        name = paramName;
        age = paramAge;
        email = paramEmail;
    }

    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Email : " + email);
    }
}