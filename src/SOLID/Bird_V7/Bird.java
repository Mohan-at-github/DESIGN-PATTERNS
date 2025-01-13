package SOLID.Bird_V7;

public abstract class Bird {
   String colour;
   int noOfWings;
   String type;
   String name;

   public void eat(){
       System.out.println("I am eating food");
   }
    public abstract void makeSound();
}
