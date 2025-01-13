package SOLID.Bird_V7;

public class Eagle extends Bird implements Flybehavior{
    private Flybehavior flybehavior;
    Eagle(Flybehavior flybehavior){
        this.flybehavior=flybehavior;
    }
    @Override
    public void makeSound() {

    }

    @Override
    public void DoFly() {
    flybehavior.DoFly();
    }
}
