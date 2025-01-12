package SOLID.Bird_V4;

public class Eagle extends Bird implements Flyable{
    @Override
    public void makeSound() {

    }

    @Override
    public void flyable() {
        System.out.println("I am flying high");
    }
}
