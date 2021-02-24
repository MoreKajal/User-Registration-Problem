package userregistration.com;
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void validName(String validFirst, String validLast, String mobileNum, String rule1) {		
    	System.out.println("Boolean Result for First Name: "+Pattern.matches("^[A-Z]{1}[a-z]{2,}$", validFirst));
    	System.out.println("Boolean Result for Last Name :" + Pattern.matches("^[A-Z]{1}[a-z]{2,}$", validLast));
		//System.out.println("Boolean Result for Mobile Number: " + Pattern.matches("^[+][9][1][-][7-9]{1}[0-9]{9}$", mobileNum));
		System.out.println("Boolean Result for Mobile Number: " + Pattern.matches("^[9][1]\\s[7-9]{1}[0-9]{9}$", mobileNum));
		//System.out.println("Boolean Result for Email Id : " + Pattern.matches("^[a-zA-Z0-9.]+@[a-zA-z]$", email));
		System.out.println("Boolean Result for Password Rule1: " + Pattern.matches("^[a-zA-Z]{8,}$", rule1));
		
    }

    public static void main(String[] args) {
        System.out.println("***Welcome to User Registration Problem Solving***");
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name :\n ");
        String firstName = sc.next();
        System.out.println("Enter your Last Name :\n ");
        String lastName = sc.next();
        System.out.println("Enter your Mobile Number :\n ");
        String mobNo = sc.next();
        System.out.println("Enter your Password :\n ");
        String pass1 = sc.next();
        validName(firstName, lastName, mobNo, pass1);
    }
}


