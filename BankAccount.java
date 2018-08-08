import java.util.Random;

//Make the following updates to the BankAccount super class:
//
//1) Make the BankAccount super class an abstract class and make applyInterest an abstract method.
//2)  The BankAccount super class shall implement the Comparable Interface. 
//    You shall implement the compareTo method to provide the means to sort the 
//    bank accounts in the ascending order of the account balance.


public class BankAccount implements Comparable<BankAccount>{

    private Customer theCustomer;
    private String acctNumber;
    private double balance;
    private double[] compareAcctBalance = new double[10];
    
//    public BankAccount(Customer theCustomer, double initialDeposit) {
//        this.theCustomer = theCustomer;
//        acctNumber = AcctNumGenerator();
//        balance = initialDeposit;
//        System.out.println("Successfully created account for " + theCustomer + " " + acctNumber);
//        System.out.println(theCustomer + ", Balance " + balance);
//    }
    
    public BankAccount(String firstName, String lastName, String ssn, double initialDeposit) {
        
//        System.out.println(firstName + " lalalallala");
        this.theCustomer = new Customer(firstName, lastName, ssn);
//        System.out.println("theCustomer" + this.theCustomer);
        acctNumber = AcctNumGenerator();  
        balance = initialDeposit;
        System.out.println("Successfully created account for " + theCustomer + " " + acctNumber);
        System.out.println(theCustomer + ", Balance " + balance);
    }
    
    public String AcctNumGenerator() {

        String acctNum = "";
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            int n = rand.nextInt(99);
            if (n < 10) {
                n += 10;
            }
            acctNum += Integer.toString(n);
        }

        return " Account Number " + acctNum;
    }

    public void deposit(double money) {
        balance += money;
        System.out.println(theCustomer  + " deposited $" + money + ". Current balance: $" + balance + ".");
    }

    public void withdraw(double money) {
        if (balance - money < 0) {
            System.out.println("Unable to withdraw $" + money + " for " + theCustomer + " due to insufficient funds.");
        } else {
            balance -= money;
            System.out.println(theCustomer + " withdrew $" + money + ". Current balance: $" + balance + ".");
        }
    }

    public double getBalance() {
        return balance;
    }
    public String getBalanceStr() {
        return String.valueOf(balance);
    } 

    public void applyInterest() {
    }

    public double newBalance(double interest) {
        balance += interest;
        return balance;
    }

    public void checkBalance() {
        System.out.println(this.theCustomer + ", Balance $" + balance);
    }

    //How do I compare/sort the balance of my account ArrayList is ascending order?
    @Override
    public int compareTo(BankAccount acct) {
        

        
//        if (this.balance == acct.balance) {
//            return 0;
//        }
//        else if (this.balance > acct.balance) {
//            return 1;
//        }
//        else {
//            return -1;
//        }
return 9999;
    }
    
    @Override
    public String toString() {
        return theCustomer + ", " + acctNumber + ", Balance " + balance;
    }
}
