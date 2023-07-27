package org.zmp.g9_questions_and_exercises.q3;

/**
 * 官方答案
 */
public class OffcialAnswer {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
