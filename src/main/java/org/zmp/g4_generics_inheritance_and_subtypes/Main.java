package org.zmp.g4_generics_inheritance_and_subtypes;

public class Main {
    public static void main(String[] args) {
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        // OK
        someObject = someInteger;


        // OK
        someMethod(new Integer(1));
        someMethod(new Double(2));


    }

    public static void boxTest(GenericBox<Number> n) {
        // do something...
    }

    public static void someMethod(Number n) {
        // do something...
    }

    
}
