import calculator.EntryData;

public class Main {
    public static void main(String[] args) {
        EntryData firstCalculation = new EntryData();
        firstCalculation.price = 100.00;
        firstCalculation.tax = 1.5;
        firstCalculation.quantity = 5;
        firstCalculation.total = 0;

        firstCalculation.getTotal();
        firstCalculation.printCalculations();

    }
}