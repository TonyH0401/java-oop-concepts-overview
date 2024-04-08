package Inheritance;

/* "extends" is the Inheritance, where you "extends" from another Class.
 * 
 * Here is some form of extends:
 * A -> B -> C
 * A -> B, A -> C
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        /*
         * "super" keyword means the superclass ones, so super() is the superclass
         * constructor and "super." is the methods of the superclass.
         * 
         * https://www.geeksforgeeks.org/super-keyword/
         */
        super();
        this.height = 0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(Circle circle, double height) {
        super(circle);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /*
     * As you can see, there is no getRadius() but because we extends from Circle we
     * inherit its getRadius().
     * 
     * @Override is override, we need to override the toString() or else it'll use
     * Circle toString().
     * 
     * Overloading is having the same method but different parameters and outputs.
     */
    @Override
    public String toString() {
        return "{" + " radius='" + getRadius() + "'" + ", height='" + getHeight() + "'" + "}";
    }

    public double getVolume() {
        return getArea() * height;
    }
}
