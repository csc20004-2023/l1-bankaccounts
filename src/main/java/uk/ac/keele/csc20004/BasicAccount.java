/* **********************
 * CSC-20004 2022/23    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * An implementation of a basic account. It is 
 * characterised by low monthly fees but no interests paid.
 * 
 * @author Marco Ortolani
 */
public class BasicAccount implements Account {
    private final double monthlyFee = 1.0;
    private double balance;
    
    public BasicAccount() {
        this(0);
    }

    public BasicAccount(double startingBalance) {
        balance = startingBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
        
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            amount = balance;
            balance = 0;
        }
        
        return amount;
    }
    
    public double getBalance() {
        return balance;
    }

    public void monthlyUpdate() {
        balance -= monthlyFee;
    }
}
