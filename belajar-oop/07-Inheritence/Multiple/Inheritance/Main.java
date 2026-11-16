package Multiple.Inheritance;

class Cat{
    String name;
}

class ColorCat extends Cat{
    String color;
}

class TipeCat extends Cat{
    String type;
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Whiskers";
        System.out.println("Cat's name: " + cat.name);

        ColorCat colorCat = new ColorCat();
        colorCat.color = "Black";
        System.out.println("ColorCat's color: " + colorCat.color);

        TipeCat tipeCat = new TipeCat();
        tipeCat.type = "Persian";
        System.out.println("TipeCat's type: " + tipeCat.type);
    }
}
