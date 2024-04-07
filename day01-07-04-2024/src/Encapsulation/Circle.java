
/* Declare inside a folder need to have package.
 * If you have functions and want to import them from other folders, use import <package-name>.
 */
package Encapsulation;

public class Circle {
    /* This is how you declare a constant by using final and static */
    /* "final" keyword */
    public final static double PI = Math.PI;
    /*
     * There are these access identifier:
     * public anywhere and everywhere
     * default like public but less accessible
     * protected inside pacakge
     * private inside of the file
     */
    private double radius;

    public Circle() {
        /* Using "this" keyword, "this" means this Object, data of this Object */
        this.radius = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Circle circle) {
        this.radius = circle.getRadius();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return (radius * 2) * PI;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public String toString() {
        return "{" +
                " radius='" + getRadius() + "'" +
                "}";
    }

    public int compareTo(Object obj) {
        if(!(obj instanceof Circle)) {
            System.out.println("");
            return -1;
        }
        if(obj)

        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        /*
         * This is down-casting, where you "cast down" the Datatype/Object into its
         * lower Datatype/Object.
         * For this section, Object is down-casted to Circle.
         * Remember to down-cast to the correct datatype or else there will be errors.
         */
        Circle circle = (Circle) obj;
        if (getArea() != circle.getArea()) {
            return false;
        }
        return true;
    }
}
