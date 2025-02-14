package Problem3;

public class CreditCard {
    private Person owner;       
    private Money balance;      
    private Money creditLimit;  

    // Constructor to initialize the credit card with owner and credit limit
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;                            
        this.creditLimit = new Money(creditLimit);     
        this.balance = new Money(0);                   
    }

    // Method to get the current balance
    public Money getBalance() {
        return new Money(balance);   
    }

    // Method to get the credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit); 
    }

    // Method to get the owner's personal information
    public String getPersonals() {
        return owner.toString(); 
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        long newBalanceDollars = balance.getDollars() + amount.getDollars();
        long newBalanceCents = balance.getCents() + amount.getCents();
        
        // Handle any overflow of cents into dollars
        if (newBalanceCents >= 100) {
            newBalanceDollars += newBalanceCents / 100;
            newBalanceCents = newBalanceCents % 100;
        }

        // Check if the new balance exceeds the credit limit
        if (newBalanceDollars <= creditLimit.getDollars()) {
            balance = new Money(newBalanceDollars + newBalanceCents / 100.0);  
            System.out.println("Charge: " + amount); 
        } else {
            System.out.println("Exceeds credit limit"); 
        }
    }

    // Method to make a payment on the credit card
    public void payment(Money amount) {
        long newBalanceDollars = balance.getDollars() - amount.getDollars();
        long newBalanceCents = balance.getCents() - amount.getCents();

        // Handle any overflow of cents into dollars
        if (newBalanceCents < 0) {
            newBalanceDollars -= 1;
            newBalanceCents += 100;
        }

        balance = new Money(newBalanceDollars + newBalanceCents / 100.0); 
        System.out.println("Payment: " + amount); 
    }
}
