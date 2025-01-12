package SOLID.Bird_V6;

public class Sparrow extends Bird implements Flyable {
 Flyable flyable=new LowFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
     flyable.fly();
    }
}
