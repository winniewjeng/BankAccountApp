/* 
 * Author: Winnie Jeng
 * Instructor: Amir Hallajpour
 * Assignment: 5
 * Created on August 1, 2018, 10:22 AM
 * Instruction: Write a program for a simple bank account
 */

import java.util.Random;

public class BankMain {

    public static void main(String args[]) {
        

        CheckingAccount acct1 = new CheckingAccount("Alin", "Parker", "123-45-6789", 1000.0f);       
        CheckingAccount acct2 = new CheckingAccount("Mary", "Jones", "987-65-4321", 500.0f);
        SavingAccount acct3 = new SavingAccount("John", "Smith", "1033-45-6789", 200.0f);

        acct1.deposit(22000.00f);
        acct2.deposit(12000.00f);
                
        acct1.withdraw(2000.00f);
        acct2.withdraw(1000.00f);
       
        acct1.applyInterest();
        acct2.applyInterest();

        acct1.checkBalance();
        acct2.checkBalance();

        acct1.withdraw(30000.00f);
        
    }
}
