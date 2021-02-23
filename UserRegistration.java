package userregistration.com;
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void validFirstName(String validFirst) {
        //String firstName = "^[A-Z]{1}[a-z]{3,}$";
        //System.out.println("Boolean Result is :" + Pattern.compile(firstName).matches(firstName, firstName));
	System.out.println("Enter First Name: "+Pattern.matches("^[A-Z]{1}[a-z]{2,}$", validFirst));
    }

    public static void main(String[] args) {
        System.out.println("***Welcome to User Registration Problem Solving***");
        System.out.println("Enter your First Name :\n ");
        final Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        validFirstName(firstName);
    }
}


