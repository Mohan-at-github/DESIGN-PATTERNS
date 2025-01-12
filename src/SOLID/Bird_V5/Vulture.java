package SOLID.Bird_V5;

public class Vulture extends Bird implements Flyable{
    HighFlyBehavior highFlyBehavior=new HighFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
    highFlyBehavior.highfly();
    }
}
