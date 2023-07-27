package org.zmp.g7_type_erasure.e1_erasure_of_generic_methods;

public class Main {
    /**
     * 计算 anArray 中 elem 元素出现的次数
     * </p>
     * 因为此处的泛型是无边界的，所以java 编译器会将其用Object替换，代码如下：
     * </p>
     * public static int count(Object[] anArray, Object elem) {
     *     int cnt = 0;
     *     for (Object e : anArray)
     *         if (e.equals(elem))
     *             ++cnt;
     *         return cnt;
     * }
     */
    public static <T> int count(T[] anArray, T elem) {
        int cnt = 0;
        for (T e : anArray)
            if (e.equals(elem)) ++cnt;
        return cnt;
    }

    /*
     * 假设定义了以下类：
     * class Shape {  ...  }
     * class Circle extends Shape {  ...  }
     * class Rectangle extends Shape {  ...  }
     *
     * 可以编写一个泛型方法来绘制不同的形状：
     * public static <T extends Shape> void draw(T shape) { ... }
     *
     * Java 编译器用 Shape 替换：
     * public static void draw(Shape shape) { ... }
     */

}
