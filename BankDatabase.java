//For this project, you shall define a new class BankDatabase. The BankDatabase 
//contains the bank account information for all accounts including saving accounts 
//and checking accounts.  The customer names are passed as “firstname lastname”.
//Your application must split the string into two separate strings for first name a
//nd last name (Hint: use the split() method).  If you decide to use an array to 
//store the bank accounts, you can assume there will be maximum of 100 bank accounts 
//in the Bank Database.  Alternatively, you can consider using an ArrayList in which 
//case its size can grow automatically as new bank accounts are added.  BankDatabase 
//class implements the following methods:


public class BankDatabase{
    
    //Constructor
    public BankDatabase() {}
    
    //This method creates a checking account
    void creatCheckingAccount(String customerName, String ssn, float deposit) {
    }
    
    //This method creates a saving account
    void creatSavingAccount(String customerName, String ssn, float deposit) {
    }
    
    //This method prints the bank account information in the database in ascending order of the account balances.
    void print() {}
    
    //This methods applies interest to all bank accounts. The interest for each type of account is the same as project 5.
    void applyIntrest() {}

 
    
    

    
    
}
