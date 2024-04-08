package StaticVsNonStatic;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Non Static variable will be initialized every single time we create a new
         * instance. So, if there there are n times instance there will be n times non
         * static variable.
         */
        Student std1 = new Student("Harry");
        System.out.println(std1.toString());
        std1.incrementNonStatic();
        System.out.println(std1.getNonStaticNumber());
        Student std2 = new Student("Harold");
        System.out.println(std2.toString());
        std2.incrementNonStatic();
        System.out.println(std2.getNonStaticNumber());
        System.out.println("##############################################################");
        std1.incrementStatic();
        std1.incrementStatic();
        System.out.println(std1.getStaticNumber());
        Student std3 = new Student("Hammer");
        System.out.println(std3.getStaticNumber());
    }
}
