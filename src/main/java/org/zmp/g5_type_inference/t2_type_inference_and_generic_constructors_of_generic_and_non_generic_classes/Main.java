package org.zmp.g5_type_inference.t2_type_inference_and_generic_constructors_of_generic_and_non_generic_classes;

public class Main {
    public static void main(String[] args) {
        new MyClass<Integer>("");


        MyClass<Integer> myObject = new MyClass<>("");
        System.out.println(myObject);
    }
}
