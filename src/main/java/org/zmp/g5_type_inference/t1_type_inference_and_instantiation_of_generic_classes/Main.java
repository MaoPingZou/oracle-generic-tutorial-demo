package org.zmp.g5_type_inference.t1_type_inference_and_instantiation_of_generic_classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> myMap = new HashMap<String, List<String>>();

        // the diamond
        // 钻石写法
        Map<String, List<String>> myMap1 = new HashMap<>();

        // 但需要注意的是，要在泛型类实例化期间利用类型推断，必须使用钻石写法
        // Note that to take advantage of type inference during generic class instantiation, you must use the diamond.
        Map<String, List<String>> myMap2 = new HashMap();  // 未检查的转换异常 unchecked conversion warning
    }
}
