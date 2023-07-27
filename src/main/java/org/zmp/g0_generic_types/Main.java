package org.zmp.g0_generic_types;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");

        // diamond 写法
        OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String>  p4 = new OrderedPair<>("hello", "world");

        // =============================== Parameterized Types =====================================
        OrderedPair<String, GenericBox<Integer>> p = new OrderedPair<>("primes", new GenericBox<>());
    }
}
