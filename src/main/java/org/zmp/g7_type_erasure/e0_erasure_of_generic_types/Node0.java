package org.zmp.g7_type_erasure.e0_erasure_of_generic_types;

/**
 * 编译后的代码为：
 * public class Node {
 *     private Object data;
 *     private Node next;
 *     public Node(Object data, Node next) {
 *         this.data = data;
 *         this.next = next;
 *     }
 *     public Object getData() { return data; }
 *     // ...
 * }
 */
public class Node0<T> {

    private T data;
    private Node0<T> next;

    public Node0(T data, Node0<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }
    // ...
}
