package org.zmp.g6_wildcards.w4_wildcard_capture_and_helper_methods;

import java.util.List;

public class WildcardErrorBad {
    void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
        Number temp = l1.get(0);
        // expected a CAP#1 extends Number, got a CAP#2 extends Number;
//        l1.set(0, l2.get(0));

        // same bound, but different types expected a CAP#1 extends Number, got a Number
//        l2.set(0, temp);
    }
}
