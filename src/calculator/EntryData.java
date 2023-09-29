package calculator;

public class EntryData {
    public double price;
    public double tax;
    public int quantity;
    public double total;
    public String message;

    public double getTotal() {
        return total = price * quantity * tax;
    }

    public void printCalculations() {
        System.out.println("I want to buy " + quantity + " shirt!");
        System.out.println("Total cost with tax is: " + total);
    }
}
