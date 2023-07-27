package org.zmp.g5_type_inference.t2_type_inference_and_generic_constructors_of_generic_and_non_generic_classes;

/**
 * Note that constructors can be generic (in other words, declare their own formal type parameters) in both generic and non-generic classes.
 * 请注意，构造函数在泛型类和非泛型类中都可以是泛型的（换句话说，声明它们自己的形式类型参数）。
 */
public class MyClass<X> {
    <T> MyClass(T t) {
        // ...
    }
}
