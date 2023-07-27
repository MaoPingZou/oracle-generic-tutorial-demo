package org.zmp.g5_type_inference;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {
    static <T> T pick(T a1, T a2) {
        return a2;
    }

    public static void main(String[] args) {
        // 根据这里的返回值，Java 编译器可以通过 Type Inference 的能力推断类型参数（type argument）
        Serializable s = pick("d", new ArrayList<String>());
        
        System.out.println(s);
    }
}
