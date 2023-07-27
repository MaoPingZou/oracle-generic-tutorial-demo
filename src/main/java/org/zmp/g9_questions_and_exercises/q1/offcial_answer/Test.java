package org.zmp.g9_questions_and_exercises.q1.offcial_answer;

import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countIf(ci, new Oddpredicate());
        System.out.println("Number of odd integers = " + count);
    }
}
