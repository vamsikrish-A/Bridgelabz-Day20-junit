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
    //Method for validating password rule1
    public void validPasswordR1() {
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@_A"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@krish")); //false, more characters.
        System.out.println(Pattern.matches("[A-Za-z0-9+-_.@]{8}","Vamsi@5")); //false, less char.
    }
    //Method for validating password Rule2
    public void validPasswordRule2() {
        System.out.println("Password rule2");
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_@]{7}","Vamsi@_A"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_.@]{7}","Vamsi@_krish")); //false, more characters.
        System.out.println(Pattern.matches("[A-Z]+[a-z0-9+-_.@]{7}","Vamsi@5")); //false, less char.
    }
    //Method for validating password Rule3.
    public void validPasswordRule3() {
        System.out.println("Password rule 3");
        System.out.println(Pattern.matches("[A-Za-z+-_@]{7}[0-9]+","Vamsi@_5"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z+-_.@]{7}[0-9]+","Vam@5555")); //true.
        System.out.println(Pattern.matches("[A-Za-z+-_.@]{7}[0-9]+","Vamsi@55")); //true.
    }
    //Method for validating password Rule4
    public void validPasswordRule4() {
        System.out.println("Password rule 4");
        System.out.println(Pattern.matches("((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})","Vamsi@55"));  //ture follows format.
        System.out.println(Pattern.matches("[A-Za-z0-9]{7}[@-_+!]","Vamsikri")); //false, more characters.
        System.out.println(Pattern.matches("[A-Za-z0-9]{7}[@-_+!]","Vamsi@55")); //false, less char.
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
        userRegistration.validPasswordR1();
        userRegistration.validPasswordRule2();
        userRegistration.validPasswordRule3();
        userRegistration.validPasswordRule4();

    }
}
