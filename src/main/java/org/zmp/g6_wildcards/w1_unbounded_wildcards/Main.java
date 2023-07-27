package org.zmp.g6_wildcards.w1_unbounded_wildcards;

import java.util.Arrays;
import java.util.List;

/**
 * The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>.
 * 无限通配符类型是使用通配符（?）指定的，例如 List<?>。
 */
public class Main {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        // 既能打印 Integer 类型的 List，也能打印 String 类型的 List
        printListWithUnboundedWildcards(li);
        printListWithUnboundedWildcards(ls);


        /*
         * ------------------------------------------------------------------------
         *
         *               ⚠️注意 List<Object> 与 List<?> 的不同⚠️
         *
         * 可以插入一个 Object 或任何 Object 的子类型，到 List<Object> 中。
         * You can insert an Object, or any subtype of Object, into a List<Object>.
         * 但是，只能往 List<?> 中插入 null 。
         * But you can only insert null into a List<?>.
         *
         * ------------------------------------------------------------------------
         */

    }

    /**
     * 这个方法比 printList 更通用
     */
    public static void printListWithUnboundedWildcards(List<?> list) {
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
    }

    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

}
