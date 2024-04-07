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

}
