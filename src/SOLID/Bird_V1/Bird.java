package SOLID.Bird_V1;

public class Bird {
    String name;
    int age;
    String colour;
    String type;
    int noOfString;
    void makeSound(){

    }
    void fly(){
        if(type.equals("Pegion")){
            System.out.println("pegion flying");
        }
        else if(type.equals("Parrot")){
            System.out.println("Parrot flying");
        }
    }
    void eat(){

    }
    //Issues:
    //violating S and O principle
    //Bird class is handling all the method for all the birds which violates S
    // any new bird comes need to change the if condition which violates O

    //Sol:
    //make Bird class as abstract class
}
