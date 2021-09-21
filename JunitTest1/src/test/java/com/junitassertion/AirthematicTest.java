package com.junitassertion;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AirthematicTest {
    private int fNumber;
    private int sNumber;
    private int expectedResult;
    private Airthematic airthematic;


    public  AirthematicTest(int fNumber, int sNumber, int expectedResult) {
        super();
        this.fNumber = fNumber;
        this.sNumber = sNumber;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize() {
        airthematic = new Airthematic();
    }
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{1,2,3},{11,22,33},{111,222,333},{10,9,19}});
    }
    @Test
    public void testAirthematicTest() {
        System.out.println("Sum of Numbers = : "+expectedResult);
        Assertions.assertEquals(expectedResult, airthematic.sum(fNumber, sNumber));
    }
}
