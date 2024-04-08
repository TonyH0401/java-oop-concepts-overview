package Generics;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Reusable */
        RandomooOne<String> RandomooOneString = new RandomooOne<String>("America Ya!");
        RandomooOneString.display();
        RandomooOne<Integer> RandomooOneInteger = new RandomooOne<Integer>(12);
        RandomooOneInteger.display();

        RandomooTwo<String, Integer> RandomooTwo = new RandomooTwo<String,Integer>("Herro", 1920);
        RandomooTwo.display();
    }
}
