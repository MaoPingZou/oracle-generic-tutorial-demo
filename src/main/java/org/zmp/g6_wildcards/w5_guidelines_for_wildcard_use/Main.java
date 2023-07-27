package org.zmp.g6_wildcards.w5_guidelines_for_wildcard_use;

import java.util.ArrayList;
import java.util.List;

/**
 * 文档地址：https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html
 * <p>
 * Wildcard Guidelines:
 * - An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
 * - An "out" variable is defined with a lower bounded wildcard, using the super keyword.
 * - In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
 * - In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.
 * <p>
 * 简言之，就是上限通配符适用于 读取数据 的场景，而下限通配符适用于 写入数据 的场景。
 */
public class Main {
    public static void main(String[] args) {
        List<? extends Number> nums = new ArrayList<Integer>();
        // Compile error! Can't add anything but null
        // 因为是用来上限通配符，这里会不知道到底添加了类型，有可能会添加不是 Number 类的类，就会造成类型不安全
//        nums.add(new Integer(5));
        // Fine, can read Number or subclass from List
        Number n = nums.get(0);


        List<? super Number> nums2 = new ArrayList<Object>();
        // Fine, can add Number or superclass objects
        nums2.add(new Integer(5));
        // Compile error! Can't assume type safety when reading
        // 因为使用了下限通配符，这里读取时不知道到底添加了什么类型，有可能会添加的不是 Number 类的父类，就会造成类型不安全
//        Number n2 = nums2.get(0);
    }

}
