package userregistration.com;
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void validName(String validFirst, String validLast) {		
    	System.out.println("Boolean Result for First Name: "+Pattern.matches("^[A-Z]{1}[a-z]{2,}$", validFirst));
    	System.out.println("Boolean Result for Last Name :" + Pattern.matches("^[A-Z]{1}[a-z]{2,}$", validLast));
    }

    public static void main(String[] args) {
        System.out.println("***Welcome to User Registration Problem Solving***");
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name :\n ");
        String firstName = sc.next();
        System.out.println("Enter your Last Name :\n ");
        String lastName = sc.next();
        validName(firstName, lastName);
    }
}


