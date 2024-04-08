package StudentManagement;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // Declare Class:
            StudentClass classOne = new StudentClass();
            StudentClass classTwo = new StudentClass();
            // Declare Student:
            Student std1 = new Student("Tony Stark", 52);
            Student std2 = new Student("Howard Stark", 82);
            // Add Student to Class:
            classOne.addStudent(std1);
            classOne.addStudent(std2);
            classTwo.addStudent(std2);
            // Get Class Information:
            System.out.println("Total Student(s): " + classOne.getTotal());
            classOne.displayStudent();
            System.out.println("Total Student(s): " + classTwo.getTotal());
            classTwo.displayStudent();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
