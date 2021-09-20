package com.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void getLiquidType() {
        Demo d = new Demo("Orange juice", 85.5);

        assertEquals("Orange juice",d.getLiquidType());
    } @Test
    void getPercentageFull() {
        Demo d = new Demo("Orange juice", 85.5);
        assertEquals(85.5,d.getPercentageFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        Demo d = new Demo("Orange juice", 85.5);
        d.setLiquidType("water");
        assertEquals("water",d.getLiquidType());
    }

    @Test
    void setPercentageFull() {
        Demo d = new Demo("Orange juice", 85.5);
        d.setPercentageFull(90);
        assertEquals(90,d.getPercentageFull(), 0.001);
    }
}