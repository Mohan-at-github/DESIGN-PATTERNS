package SOLID.Bird_V3;

public abstract class Bird {
    String name;
    String type;
    int noOfWings;
    String colour;
    public void eat(){
        System.out.println("birds eating");
    }
    //Issue:
    //for k no of behaviors we will have 2^k abstract class which leads to class explosion

    //Solution:
    // for each behavior create the interface instead of abstract class
    //so each bird can impl which every behavior required
}
