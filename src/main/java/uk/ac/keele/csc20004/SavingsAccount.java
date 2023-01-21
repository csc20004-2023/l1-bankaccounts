/* **********************
 * CSC-20004 2021/22    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * An implementation of a savings account. It is 
 * characterised by some interest paid monthly, 
 * but higher monthly fees as compared to the basic account.
 * 
 * @author Marco Ortolani
 */
public class SavingsAccount implements Account {
    
    private final double interestRate;
    private double balance;
    private final double monthlyFee = 5.0;
    
    public SavingsAccount(double startingBalance) {
        interestRate = 0.08;
        balance = startingBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    private void addInterest() {
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
        balance = balance * (1.0 + interestRate);
        balance -= monthlyFee;
    }
}
