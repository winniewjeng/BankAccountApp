//======= expected output =============
//
//Succesfully created account for Alin Parker Account Number 5435736518
//
//Succesfully created account for Mary Jones Account Number 3612979581
//
//Succesfully created account for John Smith Account Number 6998050883
//
//John Smith, accn #: 6998050883, Balance $12000.0
//
//Mary Jones, accn #: 3612979581, Balance $15000.0
//
//Alin Parker, accn #: 5435736518, Balance $20000.0
//
//John Smith, accn #: 6998050883, Balance $12600.0
//
//Mary Jones, accn #: 3612979581, Balance $15750.0
//
//Alin Parker, accn #: 5435736518, Balance $20200.0

public class BankApp {

public static void main(String[] args) {

    BankDatabase acctDatabase = new BankDatabase();

    acctDatabase.createCheckingAccount("Charles Davis", "123-45-6789", 20000.0f);

    acctDatabase.createSavingAccount("Trevor Maltbie", "987-65-4321", 15000.0f);

    acctDatabase.createSavingAccount("Matt Dougs", "123-45-6789", 12000.0f);

    //Not yet implemented compareTo in ascending acct balance
    acctDatabase.print();
    
    //How to applyInterest to all the acccounts?
    acctDatabase.applyInterest();

    acctDatabase.print();
    
}

}
