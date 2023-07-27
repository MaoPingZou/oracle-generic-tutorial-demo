package org.zmp.g4_generics_inheritance_and_subtypes;

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
