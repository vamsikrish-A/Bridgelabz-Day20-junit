import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/*test cases for all validations*/
class UserValidationTest {
    //valid firstname test case for true values
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validFirstName("Vamsi555");
        Assertions.assertTrue( result);

    }
    //valid firstname test cases for false values
    @Test
    public void givenFirstName_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validFirstName("Vamsi");
        Assertions.assertFalse( result);

    }
    //valid lastname test case for false values
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validLastName("Krishna5");
        Assertions.assertTrue( result);

    }
    //valid lastname test case for false values
    @Test
    public void givenLastName_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validLastName("Vamsi");
        Assertions.assertFalse( result);

    }@Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validEmail("example.samplemail@gmail.com");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validEmail("example?sampleemail@gm.com");
        Assertions.assertFalse( result);

    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validMobileNumber("919881434568");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validMobileNumber("9178984544884");
        Assertions.assertFalse( result);

    }
    @Test
    public void givenPasswordR1_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR1("Vams5@_A");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenPasswordR1_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR1("password34");
        Assertions.assertFalse( result);

    }
    @Test
    public void givenPasswordR2_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR2("Vams5@_A");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenPasswordR2_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR2("password34");
        Assertions.assertFalse( result);

    }
    @Test
    public void givenPasswordR3_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR3("Vams@A_5");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenPasswordR3_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR3("password34");
        Assertions.assertFalse( result);

    }@Test
    public void givenPasswordR4_WhenProper_ShouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR4("Vamskrish@5");
        Assertions.assertTrue( result);

    }
    @Test
    public void givenPasswordR4_WhenProper_ShouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validPasswordR4("password34");
        Assertions.assertFalse( result);

    }




}