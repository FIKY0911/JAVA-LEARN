class Cat{
    String name;
}

class ColorCat extends Cat{
    String color;
}

public class Inheritence {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Whiskers";
        System.out.println("Cat's name: " + cat.name);

        ColorCat colorCat = new ColorCat();
        colorCat.color = "Black";
        System.out.println("ColorCat's color: " + colorCat.color);
    }
}
