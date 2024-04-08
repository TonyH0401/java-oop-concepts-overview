package Inheritance;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // Initialize Data:
            System.out.println("#######################################################");
            Circle cir1 = new Circle(20.3);
            System.out.println("Circle 1 Information: " + cir1.toString());
            Cylinder cyl1 = new Cylinder(new Circle(111.3), 12);
            System.out.println("Cylinder 1 Information: " + cyl1.toString());
            System.out.printf("Cylinder 1 Volume: %.2f\n", cyl1.getVolume());
            // I will demo A -> B and A -> C:
            System.out.println("#######################################################");
            Person per1 = new Person();
            System.out.println("Person 1 Information: " + per1.toString());
            Student std1 = new Student(new Person("Tony Stark", "Avenger Tower"), "Senior Bachelor Engineer");
            System.out.println("Student 1 Information: " + std1.toString());
            Staff stff1 = new Staff();
            System.out.println("Staff 1 Information: " + stff1.toString());
            // I will demo A -> B -> C
            System.out.println("#######################################################");
            Dog dog1 = new Dog("Howard");
            dog1.greets();
            System.out.println("Dog 1 Information: " + dog1.toString());
            System.out.println("#######################################################");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
