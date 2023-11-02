public class Fruit {

    // variable declarations
    public String colour;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public void printInfo(){
        System.out.println("The fruit's colour is " + colour);
        System.out.println("The fruit is shaped like a(n) " + shape);
        System.out.println("The fruit has " + numSeeds + " seed(s)!");
        System.out.println("There are " + numBush + " fruits in this bush!");
        if (isRipe == true) {
            System.out.println("The fruit is ripe.");
        }
        else {
            System.out.println("The fruit is not ripe. :(");
        }
    }


    public Fruit (){


    }
}
