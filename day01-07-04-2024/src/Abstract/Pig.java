package Abstract;

public class Pig extends Mammal {
    public Pig(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Pig goes wee wee");
    }
}
