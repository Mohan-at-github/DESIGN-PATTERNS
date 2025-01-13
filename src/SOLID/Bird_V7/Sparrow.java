package SOLID.Bird_V7;

public class Sparrow extends Bird implements Flyable{
    private Flybehavior flybehavior;
    public Sparrow(Flybehavior flybehavior){
    this.flybehavior=flybehavior;
    }
    @Override
    public void makeSound() {

    }

    @Override
    public void flyable() {
        flybehavior.DoFly();
    }
}
