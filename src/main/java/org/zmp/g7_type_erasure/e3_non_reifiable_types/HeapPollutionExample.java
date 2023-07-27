package org.zmp.g7_type_erasure.e3_non_reifiable_types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapPollutionExample {
    public static void main(String[] args) {
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();

        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");

        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        // 提示：Unchecked generics array creation for varargs parameter
        // 方法上添加 @SafeVarargs 就不会有编译提示了
        ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

        // 提示：Unchecked generics array creation for varargs parameter
        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
    }
}
