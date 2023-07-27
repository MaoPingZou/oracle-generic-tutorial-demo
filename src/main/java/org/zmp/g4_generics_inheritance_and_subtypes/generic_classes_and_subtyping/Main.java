package org.zmp.g4_generics_inheritance_and_subtypes.generic_classes_and_subtyping;

public class Main {
    public static void main(String[] args) {
        // OK
        // 以下对 PayloadList 的参数化（parameterization） 都是 List<String> 的子类型
        // PayloadList<String, String>
        // PayloadList<String, Integer>
        // PayloadList<String, Exception>
    }

    /*
     *            [ Collection<String> ]
     *                      ↑
     *               [ List<String> ]
     *                      ↑
     *            [ ArrayList<String> ]
     */
}
