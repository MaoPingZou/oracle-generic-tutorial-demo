package org.zmp.g6_wildcards.w2_lower_bounded_wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * A lower bounded wildcard is expressed using the wildcard character ('?'),
 * following by the super keyword, followed by its lower bound: <? super A>.
 * <p>
 * 下界通配符使用通配符（'?'）表示，后跟 super 关键字，后跟其下限：<? super A>。
 */
public class Main {

    public static void main(String[] args) {
        // 只要是integer 或者其超类都可以使用
        List<Integer> integerList = new ArrayList<>();
        addNumbers(integerList);

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);

        List<Object> objectList = new ArrayList<>();
        addNumbers(objectList);

        List<Comparable<Integer>> stringList = new ArrayList<>();
        addNumbers(stringList);
    }

    /**
     * 通过 ? super X 声明了下限为 Integer
     */
    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
