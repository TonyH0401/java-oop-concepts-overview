package Abstract;

/* Abstract class is a class, but it can't initialized it constructor */
public abstract class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void sleep() {
        System.out.println("Zzz");
    }
}
