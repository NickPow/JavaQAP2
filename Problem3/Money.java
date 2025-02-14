package Problem3;

public class Money {
    private long dollars; 
    private long cents;   

    // Constructor that takes a double amount
    public Money(double amount) {
        this.dollars = (long) amount;  
        this.cents = Math.round((amount - dollars) * 100); 
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Getter for dollars
    public long getDollars() {
        return dollars;  
    }

    // Getter for cents
    public long getCents() {
        return cents;  
    }

    // Method to convert Money object to string
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

    // Method to add two Money objects
    public Money add(Money other) {
        long totalCents = this.cents + other.cents;
        long totalDollars = this.dollars + other.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);  
    }

    // Method to subtract another Money from this Money
    public Money subtract(Money other) {
        long totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
        long totalDollars = totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);  
    }
}
