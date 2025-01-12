package SOLID.Bird_V6;


public class Eagle extends Bird implements Flyable {
   Flyable flyable=new HighFlyBehavior();
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
       flyable.fly();
    }
}
