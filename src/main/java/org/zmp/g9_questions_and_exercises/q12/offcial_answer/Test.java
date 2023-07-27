package org.zmp.g9_questions_and_exercises.q12.offcial_answer;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
        UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

        // 官方代码中下面的 Algorithm 的第二个字母拼成了大写 L
        int i = Algorithm.findFirst(li, 0, li.size(), p);

        if (i != -1) {
            System.out.print(li.get(i) + " is relatively prime to ");
            for (Integer k : c)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}
