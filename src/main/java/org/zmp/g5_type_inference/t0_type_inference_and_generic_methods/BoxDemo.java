package org.zmp.g5_type_inference.t0_type_inference_and_generic_methods;

public class BoxDemo {

    public static void main(String[] args) {
        java.util.ArrayList<GenericBox<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
        // 由于Java 编译器拥有类型推断的能力，这里在调用范性方法时不用特别指定类型
        BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
        // 所以可以这样写
        BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
        BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
        BoxDemo.outputBoxes(listOfIntegerBoxes);
    }

    public static <U> void addBox(U u, java.util.List<GenericBox<U>> boxes) {
        GenericBox<U> box = new GenericBox<>();
        box.set(u);
        boxes.add(box);
    }

    public static <U> void outputBoxes(java.util.List<GenericBox<U>> boxes) {
        int counter = 0;
        for (GenericBox<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("GenericBox #" + counter + " contains [" + boxContents.toString() + "]");
            counter++;
        }
    }


}
