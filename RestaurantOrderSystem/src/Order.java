public class Order {
    private String burger;
    private String fries;
    private int extras;
    private double price;

    public Order(){
        burger = "";
        fries = "";
        extras = 0;
        price = 0;
    }

    // getter methods
    public String getBurger(){
        return burger;
    }

    public String getFries(){
        return fries;
    }

    public int getExtras(){
        return extras;
    }

    // setter methods
    public void setBurger(String burgerSize){
        burger = burgerSize;
    }

    public void setFries(String friesSize){
        fries = friesSize;
    }

    public void setExtras(int numExtras){
        extras = numExtras;
    }

    // calculate the total price of the user's order based on choices
    public double calcPrice(){
        // prices for burger size
        if (burger.equals("single")) {
            price = 5.00;
        } else if (burger.equals("double")) {
            price = 6.00;
        } else {
            price = 0.00;
        }

        // prices for fries size
        if (fries.equals("small")) {
            price += 3.99;
        } else if (fries.equals("large")) {
            price += 4.99;
        } else {
            price += 0.00;
        }

        // calculating extras cost based on fixed price ($1) and quantity
        if (extras >= 1){
            price += extras;
        }

        return price;
    }
}