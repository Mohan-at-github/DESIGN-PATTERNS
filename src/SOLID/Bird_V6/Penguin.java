package SOLID.Bird_V6;

import SOLID.Bird_V5.Bird;
import SOLID.Bird_V5.Flyable;

public class Penguin extends Bird implements Flyable {
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
    throw new UnsupportedOperationException("I cont fly now");
    }
}
