/* **********************
 * CSC-20004 2021/22    *
 * OOP review           *
 * **********************/ 
package uk.ac.keele.csc20004;

/**
 * This is an abstract implementation of a bank.
 * The idea is that any bank can let it clients open accounts
 * (basically: it's a container for accounts). The type of
 * account is not specified here, so the abstract bank cannot
 * be instantiated. We will need concrete implementations.
 * 
 * @author Marco Ortolani
 */
public abstract class Bank {
    protected static final int MAX_CLIENTS = 100;
    
    protected final Account[] clients = new Account[MAX_CLIENTS];
    protected int numClients = 0;
    
    /* No constructor! */
    /* We could have had a constructor like:
    protected Bank() {
        clients = new Account[MAX_CLIENTS];
        numClients = 0;
    }
    */
    
    /**
     * The method to open a new account for a client.
     * Note that in my implementation, there is a limit to
     * the maximum number of accounts the bank can hold.
     * 
     * @param acc the Account to be opened
     */
    protected final void addClient(Account acc) {
        if (numClients < Bank.MAX_CLIENTS) {
            clients[numClients++] = acc;
        }
    }
    
    /**
     * 
     * @param client the "id" of the client/account
     * @param amount the amount to be deposited
     */
    public void deposit(int client, double amount) {
        if (client < numClients) {
            clients[client].deposit(amount);
        }
    }
    
    /**
     * 
     */
    public void updateAccounts() {
        for (int i=0; i<numClients; i++) {
            clients[i].monthlyUpdate();
        }
    }
    
    public double calculateNetWorth() {
        double sum = 0.0;
        for(int i=0; i<numClients; i++) {
            sum += clients[i].getBalance();
        }
        
        return sum;
    }

}
