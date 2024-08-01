package dev.nacho.common_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public Integer[] getCommonElements(Integer[] array1, Integer[] array2) {
        List<Integer> list1 = Arrays.asList(array1);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));
        list2.retainAll(list1);
        return list2.toArray(new Integer[0]);
    }
    
}
