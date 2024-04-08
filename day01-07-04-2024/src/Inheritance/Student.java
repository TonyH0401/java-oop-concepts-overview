package Inheritance;

public class Student extends Person {
    private String program;

    public Student() {
        super();
        this.program = "Earth Program";
    }

    public Student(Person person, String program) {
        super(person.getName(), person.getAddress());
        this.program = program;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", address='" + getAddress() + "'" + ", program='" + getProgram()
                + "'}";
    }

}
