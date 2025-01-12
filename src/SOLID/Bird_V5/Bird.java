package SOLID.Bird_V5;

public abstract class Bird {
    String name;
    String Colour;
    int noOfWings;
    String type;
    public void eat(){
        System.out.println("Bird is having food dont disturb");
    }
    public abstract void makeSound();

    //Issue
    // To change the flyBehaviour we have to change a lot of places

    //Sol
    //use Dependence Injection
}
