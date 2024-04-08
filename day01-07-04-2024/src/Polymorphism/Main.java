package Polymorphism;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("#######################################################");
            /*
             * Usually, you declare the same Datatype as the Object and then you print out
             * the data within them.
             */
            Mammal mam1 = new Mammal();
            mam1.greets();
            Dog dog1 = new Dog();
            dog1.greets();
            Cat cat1 = new Cat();
            cat1.greets();
            System.out.println("#######################################################");
            /*
             * But, Polymorphism allows you to have different Datatype and Object but the
             * data within the Object changes when you print them.
             * 
             * With Polymorphsim, it doesn't matter what the datatype is, what matter is the
             * Object that it is initialized to.
             * 
             * Polymorphism works with overloading and overriding.
             * 
             * Polymorphism works with up-casting and down-casting. For up-casting and
             * down-casting to work, the Objects need to have some sort of relationship with
             * each others like inheritance.
             * 
             * "Mammal mam2 = new Mammal();" this is called up-casting.
             * "Circle circle = (Circle) circle;" this is called down-casting, you need to
             * down-casting to the correct Object or else there will be errors.
             */
            Mammal mam2 = new Mammal();
            mam2.greets();
            Mammal dog2 = new Dog();
            dog2.greets();
            Mammal cat2 = new Cat();
            cat2.greets();
            System.out.println("#######################################################");
            /*
             * You can even put them inside a function and based on their Object it will
             * print the correspond data.
             */
            Mammal mam3 = new Mammal();
            print(mam3);
            Mammal dog3 = new Dog();
            print(dog3);
            Mammal cat3 = new Cat();
            print(cat3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void print(Object obj) throws Exception, IllegalArgumentException {
        if (obj instanceof Mammal) {
            Mammal animal = (Mammal) obj;
            animal.greets();
        } else {
            throw new IllegalArgumentException("Wrong Object Type");
        }
    }
}
