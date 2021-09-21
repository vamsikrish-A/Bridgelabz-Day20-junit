package com.junitassertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitAssertionTest {
    @Test
    public void assertionTest() {
        //Variable declaration
        String string1 ="junit";
        String string2 = "junit";
        Object obj1 = new Object();
        Object obj2 = new Object();
        String string5 = null;
        int variable1=1;
        int variable2=2;
        int[] arithematicArray1 = {1, 2, 3 };
        int[] arithematicArray2 = {1, 2 ,3};

        //Assert statemants
        Assertions.assertEquals(string1, string2);
        Assertions.assertSame(string1, string2);
        Assertions.assertSame(obj1, obj2);
        Assertions.assertNotSame(obj1, obj2);
        Assertions.assertNotNull(string1);
        Assertions.assertNull(string2);
        Assertions.assertTrue(variable1<variable2);
        Assertions.assertArrayEquals(arithematicArray1, arithematicArray2);
    }
}
