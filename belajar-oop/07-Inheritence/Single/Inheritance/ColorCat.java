package Single.Inheritance;

public class ColorCat extends Cat{
    String color;

    // overriding method

    /*
        Jika disini tidak ada disply(), maka akan mencari kedalam super classnya yaitu Cat, dan akan mengeksekusi method display() yang ada di class Cat
    */
    @Override
    void display(){
        System.out.println("\nColorCat");
        System.out.println("ColorCat's color: " + color);
    }
}
