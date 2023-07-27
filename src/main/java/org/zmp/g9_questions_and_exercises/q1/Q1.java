package org.zmp.g9_questions_and_exercises.q1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Write a generic method to count the number of elements in a collection
 * that have a specific property (for example, odd integers, prime numbers, palindromes).
 *
 * 写一个泛型方法，计算集合中具有特定属性的元素的数量。
 */
public class Q1 {

    private <T> Integer count(Collection<T> collection) {
        Integer count = 0;
        for (T t : collection) {
            if (t instanceof Integer) {
                System.out.println("对 Integer 做奇数个数统计");
                Integer t1 = (Integer) t;
                if (t1 % 2 != 0) {
                    count++;
                }
            } else {
                System.out.println("暂不支持其他类型");
            }
        }
        System.out.println("odd integer count:" + count);
        return count;
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.count(Arrays.asList(10, 8, 7, 6, 3, 1, 5));
        q1.count(List.of("e1", "e2"));
    }

}
