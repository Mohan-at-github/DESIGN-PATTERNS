package SOLID.Bird_V7;

import SOLID.Bird_V6.Flyable;

public class HighFlyBehavior implements Flybehavior {
    @Override
    public void DoFly() {
        System.out.println("I am flying High");
    }

}
