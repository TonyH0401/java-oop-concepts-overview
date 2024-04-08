package Enums;

public class Main {
    public static void main(String[] args) throws Exception {
        Pizza piz1 = new Pizza();
        piz1.setStatus(PizzaEnums.ORDERED);
        System.out.println(piz1.isDelivered());
        Pizza piz2 = new Pizza();
        piz2.setStatus(PizzaEnums.DELIVERED);
        System.out.println(piz2.isDelivered());
    }
}
