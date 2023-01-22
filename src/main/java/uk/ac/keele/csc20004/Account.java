/* **********************
 * CSC-20004 2022/23    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * A simple interface for the simulation
 * of the functionalities of a typical
 * bank account
 * 
 * @author Marco Ortolani
 */
public interface Account {

    /**
     * Simulates putting money in the account
     * @param amount the money to be deposited
     */
    public void deposit(double amount);

    /**
     * Simulates withdrawing money from the account.
     * Note that it may not be possible to withdraw as much as requested
     * if the balance is not sufficient.
     * 
     * @param amount the amount to be withdrawn
     * @return the amount actually withdrawn 
     */
    public double withdraw(double amount);
    
    /** Get how much money is in the account
     * @return the amount of money currently stored
     */
    public double getBalance();
    
    /**
     * Simulates the monthly update for an account
     * (charge expenses, compute interests...)
     */
    public void monthlyUpdate();
}
