package SOLID.Bird_V7;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Flybehavior flybehavior=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the flying Behavior in which you want to fly");
        String input=sc.next();
        if(input.equalsIgnoreCase("Low")){
            flybehavior=new LowFlyBehavior();
        } else if (input.equalsIgnoreCase("High")) {
            flybehavior =new HighFlyBehavior();
        }
        else {
            System.out.println("enter the valid fly Behavior");
        }
//        Sparrow sparrow=new Sparrow(flybehavior);
//        sparrow.flyable();

        Eagle eagle=new Eagle(flybehavior);
        eagle.DoFly();
        eagle.eat();
    }
}
