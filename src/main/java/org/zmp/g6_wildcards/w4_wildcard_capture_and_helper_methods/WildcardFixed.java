package org.zmp.g6_wildcards.w4_wildcard_capture_and_helper_methods;

import java.util.List;

public class WildcardFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    /**
     * Helper method created so that the wildcard can be captured
     * through type inference.
     */
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
}
