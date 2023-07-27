package org.zmp.g9_questions_and_exercises.q1.offcial_answer;

import java.util.Collection;

public class Algorithm {

    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }

}
