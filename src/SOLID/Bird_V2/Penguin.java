package SOLID.Bird_V2;

public class Penguin extends Bird{
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("Penguin wont fly");
        //or
        throw new UnsupportedOperationException("Not supported yet");

    }
    //issue
    //like penguin may bird can  different features but when they extend they have to impl that method

    //sol
    //instead of keeping all behaviors in one class convert combination behavior in to multiple abstract class
}
