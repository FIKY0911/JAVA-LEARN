package Single.Inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.display();

        ColorCat colorCat = new ColorCat();
        colorCat.color = "Black";
        colorCat.display();
    }
}
