/* **********************
 * CSC-20004 2021/22    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * A concrete implementation of a (big) bank.
 * In my simulation, a big bank is characterised by the fact
 * that it offers basic accounts to "standard" clients, and
 * savings accounts to its "premium" clients.
 * 
 * @author Marco Ortolani
 */
public class BigBank extends Bank {

    public BigBank() {
        // calls super();
    }
    
    public void addStandardClient(double startingBalance) {
        Account a = new BasicAccount(startingBalance);

        super.addClient(a);
    }

    public void addPremiumClient(double startingBalance) {
        Account a = new SavingsAccount(startingBalance);
        
        // note that we don't need to implement a specific addClient()
        // method: the one from the superclass will suffice, and
        // the parameters match as a SavingsAccount is an Account
        super.addClient(a);
    }
}
