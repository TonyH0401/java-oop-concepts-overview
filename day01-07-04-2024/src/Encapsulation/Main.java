package Encapsulation;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // Initialize Data:
            System.out.println("#######################################################");
            Circle cir1 = new Circle(20.3);
            System.out.println("Circle 1 Information: " + cir1.toString());
            Circle cir2 = new Circle(16.5);
            System.out.println("Circle 2 Information: " + cir2.toString());
            Rectangle rec1 = new Rectangle(10.2, 5.3);
            System.out.println("Rectangle 1 Information: " + rec1.toString());
            // Getting the Area and Perimeter:
            System.out.println("#######################################################");
            System.out.printf("Circle 1 Area: %.2f\n", cir1.getArea());
            System.out.printf("Circle 1 Perimeter: %.2f\n", cir1.getPerimeter());
            System.out.printf("Circle 2 Area: %.2f\n", cir2.getArea());
            System.out.printf("Circle 2 Perimeter: %.2f\n", cir2.getPerimeter());
            System.out.printf("Rectangle 1 Area: %.2f\n", rec1.getArea());
            System.out.printf("Rectangle 1 Perimeter: %.2f\n", rec1.getPerimeter());
            //
            System.out.println("#######################################################");
            System.out.println("Is Circle 1 equals Circle 2: " + cir1.equals(cir2));
            System.out.println("Compare Circle 1 to Circle 2: " + cir1.compareTo(cir2));
            System.out.println("Compare Circle 1 to Rectangle 1: " + cir1.compareTo(rec1));
            System.out.println("#######################################################");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
