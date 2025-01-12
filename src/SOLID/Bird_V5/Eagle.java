package SOLID.Bird_V5;

public class Eagle extends Bird implements Flyable{
    HighFlyBehavior highFlyBehavior=new HighFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
       highFlyBehavior.highfly();
    }
}
