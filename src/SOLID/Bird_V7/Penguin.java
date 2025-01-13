package SOLID.Bird_V7;

public class Penguin extends Bird implements Flyable{
    private Flybehavior flybehavior;
    Penguin(Flybehavior flybehavior){
        this.flybehavior=flybehavior;
    }
    @Override
    public void makeSound() {

    }

    @Override
    public void flyable() {
    throw new UnsupportedOperationException("I cont fly");
    }
}
