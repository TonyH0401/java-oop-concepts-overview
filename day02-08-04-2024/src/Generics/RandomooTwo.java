package Generics;

/* https://www.geeksforgeeks.org/generics-in-java/
 * https://codelearn.io/sharing/lam-quen-voi-generics-trong-java
 */

public class RandomooTwo<T, U> {
    private T object1;
    private U object2;

    public RandomooTwo(T object1, U object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getObject1() {
        return this.object1;
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public U getObject2() {
        return this.object2;
    }

    public void setObject2(U object2) {
        this.object2 = object2;
    }

    public void display() {
        System.out.println(object1.getClass().getName() + " = " + object1);
        System.out.println(object2.getClass().getName() + " = " + object2);
    }
}
