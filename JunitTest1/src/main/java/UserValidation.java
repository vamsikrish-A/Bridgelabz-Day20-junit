import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
* @author: VamsiKrishna A
*
* @purpose: Junit test for User registration*/
public class UserValidation {
    public boolean validFirstName(String name) {
        String regex = "[[A-z]{1}[a-z][0-9]]{8}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    } public boolean validLastName(String name) {
        String regex = "[[A-z]{1}[a-z][0-9]]{8}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }public boolean validEmail(String email) {
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validMobileNumber(String mobileNumber) {
        String regex = "(91)?[7-9][0-9]{9}" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }
    public boolean validPasswordR1(String passwordR1) {
        String regex = "[A-Za-z0-9+-_.@]{8}" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(passwordR1);
        return matcher.matches();
    }public boolean validPasswordR2(String passwordR2) {
        String regex = "[A-Z]+[a-z0-9+-_@]{7}" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(passwordR2);
        return matcher.matches();
    }
    public boolean validPasswordR3(String passwordR2) {
        String regex = "[A-Za-z+-_@]{7}[0-9]+" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(passwordR2);
        return matcher.matches();
    }
    public boolean validPasswordR4(String passwordR2) {
        String regex = "((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})" ;
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(passwordR2);
        return matcher.matches();
    }
    public boolean validEmailAddress(String emailAdress) {
        Pattern emailIds = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
        Matcher matcher = emailIds.matcher(emailAdress);
        return matcher.matches();
    }
}
