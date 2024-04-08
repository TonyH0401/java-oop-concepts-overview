package Abstract;

/* You can implement multiple interfaces */
public class Whale extends Mammal implements Fish, Crawl {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Whale goes OOOOOOOOOOOO");
    }

    @Override
    public void run() {
        System.out.println("Whale swim");
    }

    @Override
    public void dive() {
        System.out.println("I dive very deep");
    }

}
