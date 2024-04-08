
/* Declare inside a folder need to have package.
 * If you have functions and want to import them from other folders, use import <package-name>.
 */
package Inheritance;

public class Circle {
    /* This is how you declare a constant by using final and static */
    /*
     * "final" keyword based on this link
     * https://www.w3schools.com/java/ref_keyword_final.asp, it works by preventing
     * being changed and inherited, it is treated like a constant.
     */
    /*
     * "static" keyword based on this link
     * https://www.geeksforgeeks.org/static-keyword-java/ is instead of creating an
     * instance everytime being initiated, it is a class level variable, there is
     * only 1 instance no matter how many time it's initialized.
     */
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
        return "{" + " radius='" + getRadius() + "'" + "}";
    }

    /*
     * "throws" keyword is an indicator that the function will and may throw an
     * Exception, I remembered that you can place this outside/on the class level
     * but it seemingly that was wrong.
     * 
     * This is the list of "all" Exception:
     * https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/.
     * 
     * And seemingly, you can "throws" multiple Exceptions.
     */
    public int compareTo(Object obj) throws Exception, IllegalArgumentException {
        if (!(obj instanceof Circle)) {
            /*
             * "throw" keyword means you are actually making the action of throwing an
             * Exception out there, you are not indicating anymore, you are actively
             * throwing an Exception.
             */
            throw new IllegalArgumentException("Cannot Compare! Not Circle Object Class!");
        }
        Circle circle = (Circle) obj;
        if (getArea() < circle.getArea()) {
            return -1;
        } else if (getArea() > circle.getArea()) {
            return 1;
        }
        return 0;
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
