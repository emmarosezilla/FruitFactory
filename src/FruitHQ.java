public class FruitHQ {
    public static void main(String[] args) {
        System.out.println("\n Welcome to the fruit factory! \n");
    FruitHQ myFactory = new FruitHQ();

    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class it's in

    public FruitHQ(){
        Fruit strawberry;
        strawberry = new Fruit ("red", 200,
                "triangle", true);

        Fruit mango;
        mango = new Fruit ("yellowy orange, though it is sometimes green.", 1,
                "kidney", false);

        Fruit kiwi;
        kiwi = new Fruit ("brown on the outside, green on the inside,", 60,
                "sphere", true);

        strawberry.printInfo();
        System.out.println("Can you guess what kind of fruit I am? \n" );

        mango.printInfo();
        System.out.println("Can you guess what kind of fruit I am?\n" );

        kiwi.printInfo();
        System.out.println("Can you guess what kind of fruit I am?");


        // mango: yellow, ellipse, 1, yes, 2


    }



}