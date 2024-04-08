package Inheritance;

public class Staff extends Person {
    private String school;

    public Staff() {
        super();
        this.school = "Earth School";
    }

    public Staff(Person person, String school) {
        super(person.getName(), person.getAddress());
        this.school = school;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", address='" + getAddress() + "'" + ", school='" + getSchool()
                + "'}";
    }

}
