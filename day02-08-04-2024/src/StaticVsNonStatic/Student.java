package StaticVsNonStatic;

public class Student {
    private int nonStaticNumber = 0;
    /* Add "static keyword" */
    private static int staticNumber = 0;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNonStaticNumber() {
        return this.nonStaticNumber;
    }

    public void setNonStaticNumber(int nonStaticNumber) {
        this.nonStaticNumber = nonStaticNumber;
    }

    public int getStaticNumber() {
        /*
         * "static" is class level so you need to put it this way.
         * Although, "this.staticNumber" will also work.
         */
        return Student.staticNumber;
    }

    public void setStaticNumber(int staticNumber) {
        Student.staticNumber = staticNumber;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + "}";
    }

    public void incrementNonStatic() {
        nonStaticNumber += 1;
    }

    public void incrementStatic() {
        staticNumber += 1;
    }
}
