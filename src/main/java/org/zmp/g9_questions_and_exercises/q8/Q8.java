package org.zmp.g9_questions_and_exercises.q8;

import java.util.Arrays;
import java.util.List;

/**
 * Write a generic method to find the maximal element in the range [begin, end) of a list.
 * 写一个泛型方法找到一个list中范围在 begin 和 end 中最大的元素
 */
public class Q8 {

    private static <T> Integer max(List<T> list, int begin, int end) {
        Integer max = 0;
        List<T> ts = list.subList(begin, end);
        for (T t : ts) {
            if (t instanceof Integer) {
                Integer t1 = (Integer) t;
                if (t1 > max) {
                    max = t1;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(Arrays.asList(1, 2, 3, 4, 5), 2, 4) = " + max(Arrays.asList(1, 2, 3, 4, 5), 2, 4));
    }
    
}
