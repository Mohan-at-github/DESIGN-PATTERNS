package SOLID.Bird_V4;

public abstract class Bird {
    String name;
    String Colour;
    int noOfWings;
    String type;
    public void eat(){
        System.out.println("Bird is having food dont disturb");
    }
    public abstract void makeSound();

    //Issue:
    //fly method impl code is used everywhere so code duplication
    // Pigeon and Sparrow has the same Flying Behaviour
    // Eagle and vulture has the same Flying behaviour
    // Duplication in the code

    //sol:
    //create a separate class for flyhigh and flylow for fly behavior and use that objects
}
