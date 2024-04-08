package Abstract;

public class Main {
    public static void main(String[] args) throws Exception {
        Mammal pig = new Pig("Horren");
        System.out.println(pig.getName());
        pig.sound();
        pig.sleep();
        /*
         * Here I use Datatype Whale instead of Mammal because Whale implemenet
         * interface and the 2 functions run() and dive() are part of the interface,
         * they are not part of the Mammal Class - Mammal Class doesn't have these
         * functions.
         */
        Whale whale = new Whale("Lemon");
        System.out.println(whale.getName());
        whale.sound();
        whale.sleep();
        whale.run();
        whale.dive();
    }
}
