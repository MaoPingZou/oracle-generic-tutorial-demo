package org.zmp.g9_questions_and_exercises.q12.offcial_answer;

import java.util.Collection;

public class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
    private Collection<Integer> c;

    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    @Override
    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algorithm.gcd(x, i) != 1)
                return false;

        return c.size() > 0;
    }
}
