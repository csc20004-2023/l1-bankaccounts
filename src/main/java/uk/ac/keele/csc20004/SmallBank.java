/* **********************
 * CSC-20004 2022/23    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * A concrete implementation of a (small) bank.
 * In my simulation, a small bank is characterised by the fact
 * that it only offers basic accounts to its clients.
 * 
 * @author Marco Ortolani
 */
public class SmallBank extends Bank {

    /**
     * A constructor of a derived class always calls some
     * constructor of the parent class; when the programmer
     * doesn't explicitly call any constructor of the superclass,
     * then the default one is called.
     * 
     * This method can be safely deleted as it will be automatically provided 
     * by Java.
     */
    public SmallBank() {
        // calls super();
    }
    
    public void addClient(double startingBalance) {
        Account a = new BasicAccount(startingBalance);
        super.addClient(a);
    }
}
