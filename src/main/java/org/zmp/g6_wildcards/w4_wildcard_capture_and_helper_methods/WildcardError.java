package org.zmp.g6_wildcards.w4_wildcard_capture_and_helper_methods;

import java.util.List;

public class WildcardError {
    void foo(List<?> i) {
        //  编译时产生 a capture error
//        i.set(0, i.get(0));
    }
}
