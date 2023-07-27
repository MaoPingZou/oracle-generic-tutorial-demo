package org.zmp.g7_type_erasure.e3_non_reifiable_types;

import java.util.ArrayList;import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayBuilder {

    /**
     * this annotation asserts that the implementation of the method will not improperly handle the varargs formal parameter.
     * <p>
     * 注解 @SafeVarargs 断言该方法的实现不会不正确地处理 varargs 形式参数。
     */
    @SafeVarargs
    public static <T> void addToList(List<T> listArg, T... elements) {
        for (T x : elements) {
            listArg.add(x);
        }
    }

    /**
     * 尽管不太可取，也可以使用 @SuppressWarnings 注解，去压制警告
     * 但是这种方法不会在方法调用处压制警告
     */
    @SuppressWarnings({"unchecked", "varargs"})
    public static void faultyMethod(List<String>... l) {
        // Valid
        Object[] objectArray = l;
        objectArray[0] = Arrays.asList(42);
        // ClassCastException thrown here
        String s = l[0].get(0);
    }
}
