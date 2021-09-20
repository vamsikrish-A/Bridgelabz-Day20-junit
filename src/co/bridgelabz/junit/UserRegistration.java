package co.bridgelabz.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* @author : Vamsi Krishna A
*
* @purpose: junit test for user Registration
*
* @date: 20/09/2021 */
public class UserRegistration {
    //Method for validating first name in user registration.
    public void validFirstName() {
        //uSing Quantifiers for first name
        System.out.println("Valid Firstname ");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vams"));  //True , first name starts with cap and has minimum 3 characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Vamsi")); //false, has more characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","vams"));  //false, has no cap and more characters.
    }
    //Method for validating last name in user registration.
    public void validLastName() {
        //uSing Quantifiers for last name
        System.out.println("Valid Lastname ");
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Kris"));  //True , first name starts with cap and has minimum 3 characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","Krishna")); //false, has more characters.
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{3}+","krishna")); //false, has no cap and more characters.

    }
    //Method for validating Emails
    public void validEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email: ");
        String name = sc.nextLine();
        // Regular Expression to validate E-mail.
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";;

        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);

        //Creating Matcher object.
        Matcher matcher = pattern.matcher(name);

        //verifying give name is valid or not.
        if (matcher.matches())
            System.out.println("E-mail is valid.");
        else
            System.out.println("E-mail is Invalid.");
    }
    //Method for validating mobile Number formatting
    public void validMobileNumber(String str) {
        //function to check mobile number is valid or not.
        //(0/91): country code.
        //(7-9): starting digits between 7,8,9.
        //(0-9): last 9 digits.
        Pattern pattern = Pattern.compile("(91)?[7-9][0-9]{9}");
        Matcher matcher = pattern.matcher(str);

        //returns a boolean value.
        if (matcher.find() && matcher.group().equals(str))
            System.out.println("Valid Number.");
        else
            System.out.println("Invalid Number.");


    }
    public static void main(String[] args) {
        System.out.println("Welcome to JUnit Test Cases.");
        //Methods.
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmail();
        userRegistration.validMobileNumber("91 5996565468"); //invalid
        userRegistration.validMobileNumber("0 9965654682");  //invalid
        userRegistration.validMobileNumber("919584651655"); //valid
        userRegistration.validMobileNumber("25996565468");  //invalid


    }
}
