package SOLID.Bird_V2;

public abstract class Bird {
    String colour;
    String type;
    int noOfWings;
    String name;
    public abstract void makeSound();

    public abstract void fly();

    //Common method for all birds
     public void eat(){
         System.out.println("Bird eating food");
     }

}
