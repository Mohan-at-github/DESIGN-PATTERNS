package SOLID.Bird_V4;

public class Vulture extends Bird implements Flyable{
    @Override
    public void makeSound() {

    }

    @Override
    public void flyable() {
        System.out.println("I am flying High");
    }
}
