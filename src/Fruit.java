public class Fruit {

    // variable declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;

    public Fruit (String paramColor, int paramNumSeeds,
                  String paramShape, boolean paramisRipe) {
        color = paramColor;
        numSeeds = paramNumSeeds;
        shape = paramShape;
        numBush = (int)(Math.random()*100);
        isRipe = paramisRipe;

    }

    public void printInfo(){
        System.out.println("This fruit's colour is " + color);
        System.out.println("This fruit is shaped like a " + shape);
        System.out.println("This fruit has " + numSeeds + " seed(s)!");
        System.out.println("There are typically " + numBush + " fruits in a bush!");
        if (isRipe == true) {
            System.out.println("This particular fruit is ripe.");
        }
        else {
            System.out.println("This particular fruit is not ripe. :(");
        }
    }


}
