package SOLID.Bird_V6;

public abstract class Bird {
    String name;
    String Colour;
    int noOfWings;
    String type;
    public void eat(){
        System.out.println("Bird is having food dont disturb");
    }
    public abstract void makeSound();
}
