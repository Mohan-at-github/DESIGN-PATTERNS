package SOLID.Bird_V4;

public class Sparrow extends Bird implements Flyable,Dancable{
    @Override
    public void makeSound() {

    }

    @Override
    public void dancable() {

    }

    @Override
    //code duplication or repeat
    public void flyable() {
        System.out.println("Flying high");
    }
}
