/* **********************
 * CSC-20004 2021/22    *
 * OOP review           *
 * **********************/
import uk.ac.keele.csc20004.Bank;
import uk.ac.keele.csc20004.SmallBank;
import uk.ac.keele.csc20004.BigBank;

/**
 * A simulation of use of our two types of banks and accounts
 * 
 * @author Marco Ortolani
 */
public class BankSimulation {

    public static void main(String[] args) {
        Bank banks[] = new Bank[2];

        SmallBank bank0 = new SmallBank();
        BigBank bank1 = new BigBank();

        banks[0] = bank0;
        banks[1] = bank1;

        // add 2 clients to bank1
        bank0.addClient(1000);
        bank0.addClient(4000);

        // add 2 clients to bank2
        bank1.addStandardClient(500);
        bank1.addPremiumClient(4000.00);

        // deposit 500 dollars for client 0 of bank1
        bank1.deposit(0, 500.00);

        // compute monthly interests
        for (int b = 0; b < banks.length; b++) {
            for (int i = 0; i < 12; i++) {
                banks[b].updateAccounts();
            }
        }

        for (int b = 0; b < banks.length; b++) {
            System.out.println("Bank" + b + ": "+ banks[b].calculateNetWorth());
        }        
    }

}
