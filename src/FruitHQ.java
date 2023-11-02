public class FruitHQ {
    public static void main(String[] args) {
        System.out.println("Welcome to the fruit factory!");
    FruitHQ myFactory = new FruitHQ();

    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class it's in

    public FruitHQ(){
        // strawberry: red, triangle, 200, yes, 20
        Fruit strawberry;
        strawberry = new Fruit ();
        strawberry.colour = "red";
        strawberry.shape = "triangle";
        strawberry.numSeeds = 200;
        strawberry.numBush = 20;
        strawberry.isRipe = true;

        Fruit mango;
        mango = new Fruit ();
        mango.colour = "yellowish-orange";
        mango.shape = "oval";
        mango.numSeeds = 1;
        mango.numBush = 100;
        mango.isRipe = false;


        mango.printInfo();
        System.out.println("Can you guess what kind of fruit I am?");


        // mango: yellow, ellipse, 1, yes, 2


    }



}