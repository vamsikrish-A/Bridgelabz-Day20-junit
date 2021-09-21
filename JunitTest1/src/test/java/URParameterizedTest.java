import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class URParameterizedTest {
    private String email;
    private boolean expectedResult;
    private UserValidation userValidation;

    public URParameterizedTest(String email, boolean expectedResult) {
        super();
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        userValidation = new UserValidation();
    }
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc@1.com",true},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false}});
    }
    @Test
    public void testURParameterizedTest() {
        System.out.println("Email validation :"+expectedResult);
        Assertions.assertEquals(expectedResult, userValidation.validEmailAddress(email));
    }
}
