package org.zmp.g7_type_erasure.e2_effects_of_type_erasure_and_bridge_methods;

public class Main {
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn; // 一个 raw 类型，编译器会抛出一个未检查警告
        n.setData("Hello"); // 这会导致一个 ClassCastException 被抛出
        Integer x = mn.data;

        // 在类型擦除之后，上面的代码会变成：
        MyNode mn1 = new MyNode(5);
        // 注意：这个语句跟  Node n1 = (Node) mn; 是一样的。但是，编译器不会生成强制转换，因为它不是必需的。
        Node n1 = mn1; // 一个 raw 类型，编译器会抛出一个未检查警告
        n1.setData("Hello"); // 这会导致一个 ClassCastException 被抛出
        Integer x1 = (Integer) mn.data;
    }
}
