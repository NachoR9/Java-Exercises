package dev.nacho.months_and_days;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MonthCalculatorTest {
    @Test
    void testGetMonth() {
         MonthCalculator monthcalculator = new MonthCalculator();
         Month result = monthcalculator.getMonth(2);
         assertEquals("February", result.getName());
         assertEquals(28, result.getDays());


    }
}
