package dev.nacho.common_elements;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CommonElementsTest {
    @Test
    void testGetCommonElements() {
        CommonElements commonElements = new CommonElements();
        Integer[] array1 = new Integer[] {7,4,2};
        Integer[] array2 = new Integer[] {3,4,2};
        Integer[] result = commonElements.getCommonElements(array1, array2);
        assertArrayEquals(new Integer[]{4,2}, result);

        

    }
}
