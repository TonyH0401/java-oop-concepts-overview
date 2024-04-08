package Encapsulation;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getLength(), rectangle.getWidth());
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "{" +
                " length='" + getLength() + "'" +
                ", width='" + getWidth() + "'" +
                "}";
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public int compareTo(Object obj) throws Exception, IllegalArgumentException {
        if (!(obj instanceof Rectangle)) {
            throw new IllegalArgumentException("Cannot Compare! Not Rectangle Object Class!");
        }
        Rectangle rectangle = (Rectangle) obj;
        if (getArea() < rectangle.getArea()) {
            return -1;
        } else if (getArea() > rectangle.getArea()) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        if (getArea() != rectangle.getArea()) {
            return false;
        }
        return true;
    }

}
