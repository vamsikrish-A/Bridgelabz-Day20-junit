package co.bridgelabz.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    void validateFirstName() {
        UserRegistration input = new UserRegistration();
        Assertions.assertTrue(input.validFirstName());
    }
}
