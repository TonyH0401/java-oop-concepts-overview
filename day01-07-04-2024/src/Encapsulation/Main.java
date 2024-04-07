package Encapsulation;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Circle cir1 = new Circle(20.3);
            System.out.println("Circle 1 Information: " + cir1.toString());
            System.out.printf("Circle 1 Area: %.2f\n", cir1.getArea());
            System.out.printf("Circle 1 Perimeter: %.2f\n", cir1.getPerimeter());

            Circle cir2 = new Circle(16.5);
            System.out.println("Circle 2 Information: " + cir2.toString());
            System.out.printf("Circle 2 Area: %.2f\n", cir2.getArea());
            System.out.printf("Circle 2 Perimeter: %.2f\n", cir2.getPerimeter());

            System.out.println("Is Circle 1 equals Circle 2: " + cir1.equals(cir2));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
