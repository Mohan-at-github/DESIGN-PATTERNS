package SOLID.Bird_V5;

public class Penguin extends Bird implements Flyable{
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
    throw new UnsupportedOperationException("I cont fly now");
    }
}
