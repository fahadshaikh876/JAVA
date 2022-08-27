import java.util.*;
import java.text.SimpleDateFormat;

class DatesNotVaidException extends Exception {

    public String toString() {
        return "inavlid Date";
    }
}

class InvalidPassportNumberException extends Exception {
    public String toString() {
        return "Invalid Passport Number";
    }
}

class Passport {
    String Name, passportnumber;
    Date issuedate, expirydate;
    // Date issuedate = new Date();
    // Date expirydate = new Date();

    Passport(String Name, String passportnumber, String issuedate, String expirydate) throws Exception {
        this.Name = Name;
        this.passportnumber = passportnumber;

        this.issuedate = new SimpleDateFormat("dd/MM/yyyy").parse(issuedate);
        this.expirydate = new SimpleDateFormat("dd/MM/yyyy").parse(expirydate);

        for (int i = 0; i < passportnumber.length(); i++) {
            Boolean flag = Character.isDigit(passportnumber.charAt(i));
            if (i < 2 && !flag) {
            } else if (i > 1 && flag) {
            } else {
                throw new InvalidPassportNumberException();
                // break;
            }

        }

        if (this.issuedate.compareTo(this.expirydate) < 0) {
            // System.out.println("date is fine");
        } else {
            throw new DatesNotVaidException();
        }
        System.out.println("Passport is Valid");
    }
}

class Q2 {

    public static void main(String args[]) throws Exception {
        try {
            Passport passport = new Passport("Fahad", "AC1Q56", "21/11/1998", "21/11/1997");

        } catch (DatesNotVaidException e) {
            System.out.println(e);
        } catch (InvalidPassportNumberException e) {
            System.out.println(e);
        }

    }
}