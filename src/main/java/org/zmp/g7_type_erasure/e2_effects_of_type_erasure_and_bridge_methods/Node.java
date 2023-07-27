package org.zmp.g7_type_erasure.e2_effects_of_type_erasure_and_bridge_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Node<T> {
    public T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }

}
