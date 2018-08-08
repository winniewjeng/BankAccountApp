//Define a new class BankDatabase. The BankDatabase contains the bank account 
//information for all accounts including saving accounts and checking accounts. 
//Use an ArrayList in which case its size can grow automatically as new bank accounts are added.  

import java.util.ArrayList;

public class BankDatabase {

    private BankAccount newAcct;
    //Initialize an empty array to store customer data
    private ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();
    //Initialize an empty array to store sorted customer data
    private ArrayList<BankAccount> sortList = new ArrayList<BankAccount>();

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
        newAcct = new CheckingAccount(firstName, lastName, ssn, deposit);
        //Expand the ArrayList
        acctList.add(newAcct);

    }

    //This method creates a saving account
    void createSavingAccount(String customerName, String ssn, double deposit) {
        //Parse the Customer's name into first and last
        String firstName = " ", lastName = " ";
        String[] arrOfNames = customerName.split(" ", 2);
        firstName = arrOfNames[0];
        lastName = arrOfNames[1];

        //Create a saving account
        newAcct = new SavingAccount(firstName, lastName, ssn, deposit);
        //Expand the ArrayList
        acctList.add(newAcct);
    }

    //This method prints the bank account information in the database in ascending order of the account balances.
    void print() {

        for (int i = 0; i < acctList.size(); i++) {

            System.out.println(acctList.get(i));
            

        }
        
        
        double smaller = acctList.get(0).getBalance();
        System.out.println("smaller " + smaller);
        for (int i = 1; i < acctList.size(); i++) {
            
//            if (acctList.get(i).getBalance() > acctList.get(i).getBalance())
//            {
//
//            }

        }

        
//        if (acctList.get(i).getBalance() > acctList.get(i + 1).getBalance()) {
//
//        }

    }

    //Have not yet implemented
    //This methods applies interest to all bank accounts. The interest for each type of account is the same as project 5.
    void applyInterest() {

        newAcct.applyInterest();
    }

//    private static ArrayList<String> getAuthors(String authors) {
//    ArrayList books = new ArrayList<String>();
//      String[] splitStr = authors.split("\\*");
//      for (int i=0;i<splitStr.length;i++) {
//        books.add(splitStr[i]);
//       }
//    return books;
//}
}
