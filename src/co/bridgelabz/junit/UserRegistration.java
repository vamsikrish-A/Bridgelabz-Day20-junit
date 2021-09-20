package co.bridgelabz.junit;

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
    public static void main(String[] args) {
        System.out.println("Welcome to JUnit Test Cases.");
        //Methods.
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();

    }
}
