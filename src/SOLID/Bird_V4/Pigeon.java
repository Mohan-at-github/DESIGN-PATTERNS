package SOLID.Bird_V4;

public class Pigeon extends Bird implements Flyable, Dancable{

    @Override
    public void makeSound() {

    }

    @Override
    public void dancable() {

    }

    @Override
    public void flyable() {
        //code duplication or repeat
        System.out.println("Flying high");
    }
}
