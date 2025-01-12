package SOLID.Bird_V5;

import java.util.List;

public class Sparrow extends Bird implements Flyable{
    LowFlyBehavior lowFlyBehavior=new LowFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
    lowFlyBehavior.lowfly();
    }
}
