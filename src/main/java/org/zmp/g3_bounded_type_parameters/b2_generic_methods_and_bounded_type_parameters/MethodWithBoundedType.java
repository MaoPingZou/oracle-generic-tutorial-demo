package org.zmp.g3_bounded_type_parameters.b2_generic_methods_and_bounded_type_parameters;

public class MethodWithBoundedType {
    /**
     * 错误示例
     */
    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            // compiler error 编译错误
            // because cannot use the > operator to compare objects. 因为 > 操作符不能用于比较对象
//            if (e > elem)
//                ++count;
            System.out.println(e);
        return count;
    }


    /**
     * 正确示例
     */
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
