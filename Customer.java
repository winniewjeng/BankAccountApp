
public class Customer {

    private String firstName;
    private String lastName;
    private String ssn;

    public Customer(String FN, String LN, String Ssn) {
        firstName = FN;
        lastName = LN;
        ssn = Ssn;
        if (checkSsn() == false) {
            System.out.println("Invalid SSN!");
        }
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    // The social security number is a String variable and must comply with this 
    //format: xxx-xx-xxxx where 'x' is a digit between 0-9. If a customer is 
    //supplied an invalid ssn, a message must be printed that the SSN of the customer is invalid
    public boolean checkSsn() {

        boolean valid = true;

        String check = ssn;

        if (check.charAt(3) != '-' || check.charAt(6) != '-') {
            valid = false;
        }
        String[] segment = check.split("\\-");

        int segment1 = Integer.parseInt(segment[0]);
        int segment2 = Integer.parseInt(segment[1]);
        int segment3 = Integer.parseInt(segment[2]);

        if (segment1 < 99 || segment1 > 999) {
            valid = false;
        }
        if (segment2 < 9 || segment2 > 99) {
            valid = false;
        }
        if (segment3 < 999 || segment3 > 9999) {
            valid = false;
        }

        return valid;
    }

}
