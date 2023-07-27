package org.zmp.g6_wildcards.w0_upper_bounded_wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * To declare an upper-bounded wildcard, use the wildcard character ('?'),
 * followed by the extends keyword, followed by its upper bound.
 * <p>
 * 若要声明上限通配符，请使用通配符（'?'），后跟 extend 关键字，后跟其上限类型。
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

        // sumOfList 同样也可以用于 Double 类型的List上
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));
    }

    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
}
