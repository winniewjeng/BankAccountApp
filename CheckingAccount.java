
public class CheckingAccount extends BankAccount {

    private double interest;
    private double balance;

    public CheckingAccount(String firstName, String lastName, String ssn, double initialDeposit) {
        super(firstName, lastName, ssn, initialDeposit);
    }

    @Override
    public void applyInterest() {
        super.applyInterest();
        balance = getBalance();

//        System.out.println("Inside the Checking's applyInterest");
        
        if (getBalance() > 10000) {
            interest = (balance - 10000) * 0.02;
            newBalance(interest);
        }

    }


}
