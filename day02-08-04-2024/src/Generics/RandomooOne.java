package Generics;

/* https://www.geeksforgeeks.org/generics-in-java/
 * https://codelearn.io/sharing/lam-quen-voi-generics-trong-java
 */

public class RandomooOne<T> {
    private T object;

    public RandomooOne(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void display() {
        System.out.println(object.getClass().getName() + " = " + object);
    }
}
