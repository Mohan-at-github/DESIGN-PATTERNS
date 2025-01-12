package SOLID.Bird_V6;


public class Vulture extends Bird implements Flyable {
   Flyable flyable=new HighFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
    flyable.fly();
    }
}
