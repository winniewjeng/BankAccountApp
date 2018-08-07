
public class SavingAccount extends BankAccount {

    private double interest;

    public SavingAccount(String firstName, String lastName, String ssn, double initialDeposit) {
        super(firstName, lastName, ssn, initialDeposit);
    }

    @Override
    public void applyInterest() {
        super.applyInterest();
        double balance = getBalance();
        
        System.out.println("what up");
        if (getBalance() > 10000) {
            interest = (balance - 10000) * 0.05;
            newBalance(interest);
        }
    }
}
