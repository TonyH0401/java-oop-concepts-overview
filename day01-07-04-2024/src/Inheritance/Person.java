package Inheritance;

public class Person {
    /*
     * Something you might want to know is that, String is immutable meaning it
     * can't be changed, that is why you gonna use StringBuilder or other methods to
     * change the value of the String.
     */
    private String name;
    private String address;

    public Person() {
        this.name = "John Smith";
        this.address = "Earth";
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", address='" + getAddress() + "'" + "}";
    }

}
