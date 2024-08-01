package dev.nacho.amstrong;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberAmstrongTest {
    @Test
    void testNumberisAmstrong() {
        NumberAmstrong number = new NumberAmstrong(371);
        boolean result = number.numberisAmstrong();
        assertTrue(result);
    }

    @Test
    void testNumberisNotAmstrong() {
        NumberAmstrong number = new NumberAmstrong(173);
        boolean result = number.numberisAmstrong();
        assertFalse(result);


    }
}
