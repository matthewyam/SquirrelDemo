package OOPDemo;

public class Squirrel{
    //instance variables
    String colourString;
    String sizeString;
    int nutCountInt;
    boolean aliveBoolean;
    double iqDouble;


    //contructor

    public Squirrel(String newColourString, String newSizeString, int newNutCount, double newiqDouble){
        this.aliveBoolean = true;
        this.colourString = newColourString;
        this.sizeString = newSizeString;
        this.nutCountInt = newNutCount;
        this.iqDouble = newiqDouble;
    }

    
    //instance method

    public void run(){
        System.out.println("run!!");
    }

    public void findNut(int numberNuts){
        nutCountInt = this.nutCountInt + numberNuts;
    }

    public int getNutCount(){
        return this.nutCountInt;
    }

    public void eatNut(){
        this.nutCountInt--;
    }

    public void climb(){
        System.out.println("Climb that tree!!");
    }

    public void kill(){
        this.aliveBoolean = false;
    }

}