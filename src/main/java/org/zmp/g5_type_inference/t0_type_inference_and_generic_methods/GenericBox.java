package org.zmp.g5_type_inference.t0_type_inference_and_generic_methods;

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */
public class GenericBox<T> {
    /**
     * T stands for "Type"
     */
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
