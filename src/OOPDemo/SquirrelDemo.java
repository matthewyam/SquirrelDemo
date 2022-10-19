package OOPDemo;

import OOPDemo.Squirrel;

public class SquirrelDemo {
    public static void main(String[] args) {
        
        Squirrel alvin;
        Squirrel simon;
        Squirrel theodore;

        alvin = new Squirrel("Red", "Medium", 8, 100.0);
        simon = new Squirrel("Blue", "Tall", 10, 240.0);
        theodore = new Squirrel("Green", "Grande", 4, 80.0);

        alvin.climb();
        simon.findNut(3);
        theodore.eatNut();
        theodore.findNut(23);
        alvin.run();
        System.out.println("Theodore's nut count: " + theodore.getNutCount());

        simon.run();
        simon.kill();

        System.out.println("Simon's IQ: " + simon.iqDouble);
    }
    
}
