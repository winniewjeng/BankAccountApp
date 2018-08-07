//Define a new class BankDatabase. The BankDatabase contains the bank account 
//information for all accounts including saving accounts and checking accounts. 
//Use an ArrayList in which case its size can grow automatically as new bank accounts are added.  

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankDatabase {

    private BankAccount aNewAcct;
    private ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();

    //Constructor
    public BankDatabase() {
    }

    //This method creates a checking account
    void createCheckingAccount(String customerName, String ssn, double deposit) {

        //Parse the Customer's name into first and last
        String firstName = "", lastName = "";
        String[] arrOfNames = customerName.split(" ", 2);
        firstName = arrOfNames[0];
        lastName = arrOfNames[1];

        //Create a checking account
        aNewAcct = new CheckingAccount(firstName, lastName, ssn, deposit);
        acctList.add(aNewAcct);
//        System.out.println("The Current List size is: " + acctList.size());

    }

    //This method creates a saving account
    void createSavingAccount(String customerName, String ssn, double deposit) {
        //Parse the Customer's name into first and last
        String firstName = " ", lastName = " ";
        String[] arrOfNames = customerName.split(" ", 2);
        firstName = arrOfNames[0];
        lastName = arrOfNames[1];

        //Create a saving account
        aNewAcct = new SavingAccount(firstName, lastName, ssn, deposit);
        acctList.add(aNewAcct);
    }

    //I have problem returning the element of my ArrayList.
    //I swear this thing doesn't work
    @Override
    public String toString() {
        return "account list: " + acctList.toString();
        
    }
    //This method prints the bank account information in the database in ascending order of the account balances.
    void print() {
        System.out.println("The Current List size is: " + acctList.size());
        //Why are you printing address???? T_____T
        System.out.println(acctList.get(0));
        System.out.println(acctList.get(1));
        System.out.println(acctList.get(2));
    }

    //This methods applies interest to all bank accounts. The interest for each type of account is the same as project 5.
    void applyInterest() {
        aNewAcct.applyInterest();
    }

}
