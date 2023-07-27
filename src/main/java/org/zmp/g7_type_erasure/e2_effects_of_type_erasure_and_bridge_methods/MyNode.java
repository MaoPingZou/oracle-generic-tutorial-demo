package org.zmp.g7_type_erasure.e2_effects_of_type_erasure_and_bridge_methods;

public class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
