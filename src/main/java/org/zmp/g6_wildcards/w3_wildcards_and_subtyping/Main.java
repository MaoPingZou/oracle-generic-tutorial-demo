package org.zmp.g6_wildcards.w3_wildcards_and_subtyping;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 因为类B是类A的子类，所以下面的代码是很合理的
        Integer integer = new Integer(10);
        Number number = integer;

        // 但是这种关系不存在在泛型类型中
        List<Integer> lb = new ArrayList<>();
        // 下面的语句会出现编译时错误（compile-time error）
//        List<Number> la = lb;


        // 虽然 Integer 是 Number 的子类型，但 List<Integer> 并不是 List<Number> 的子类型，事实上，这两种类型不相关。
        // 这两种类型的共同父类是 List<?>

        // 下面的写法是 OK 的. 因为 List<? extends Integer> 是 List<? extends Number> 的子类型
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = intList;

        
        /*
         *                                List<?>
         *                                  ↑
         *                      ↑                        ↑
         *             List<? extends Number>    List<? super Integer>
         *                      ↑                        ↑
         *             List<? extends Integer>   List<? super Number>
         *                      ↑                        ↑
         *                 List<Integer>            List<Number>
         *
         *
         *
         *                      List<? extends Number>
         *                               ↑
         *                          List<Number>
         *
         *
         *                      List<? extends Integer>
         *                               ↑
         *                          List<Integer>
         */



    }
}
