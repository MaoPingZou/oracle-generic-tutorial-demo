package org.zmp.g9_questions_and_exercises.q3;

import java.util.Arrays;

/**
 * Write a generic method to exchange the positions of two different elements in an array.
 */
public class Q3 {

    /**
     * 对比官方答案，我的这个方法不够抽象，不够通用。
     * 原因在于：逻辑写的太死，只能交互第一个元素和第二个元素，不能根据给定要交换的元素位置来交互元素。
     */
    public static <T> void exchange(T[] array) {
        System.out.println("before：" + Arrays.toString(array));

        T t1 = array[0];
        array[0] = array[1];
        array[1] = t1;

        System.out.println("after：" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Object[] objects = new Object[2];
        objects[0] = 1;
        objects[1] = 2;
        Q3.exchange(objects);
    }
}
