package Enums;

public class Pizza {
    private PizzaEnums status;

    public Pizza() {
        this.status = PizzaEnums.ORDERED;
    }

    public PizzaEnums getStatus() {
        return this.status;
    }

    public void setStatus(PizzaEnums status) {
        this.status = status;
    }

    public boolean isDelivered() {
        if (getStatus() == PizzaEnums.DELIVERED) {
            return true;
        }
        return false;
    }
}
