package StudentManagement;

import java.util.*;

public class StudentClass {
    private ArrayList<Student> studentClass;
    private int total;

    public StudentClass() {
        this.studentClass = new ArrayList<Student>();
        this.total = 0;
    }

    public ArrayList<Student> getStudentClass() {
        return this.studentClass;
    }

    public void setStudentClass(ArrayList<Student> studentClass) {
        this.studentClass = studentClass;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void displayStudent() {
        for (Student student : studentClass) {
            System.out.println(student.toString());
        }
    }

    public void addStudent(Student student) {
        this.studentClass.add(student);
        System.out.println("Added: " + student.toString());
        this.total += 1;
    }
}
