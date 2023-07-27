package org.zmp.g3_bounded_type_parameters.b0_single_bounds;

/**
 * The isEven method invokes the intValue method defined in the Integer class through n.
 */
public class NaturalNumber<T extends Number> {
    private final T n;

    public NaturalNumber(T n) {
        this.n = n;
    }

    public boolean isEven() {
        // 可以使用 upper bound 定义的类型的方法
        return n.intValue() % 2 == 0;
    }

    // ...
}
