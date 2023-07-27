package org.zmp.g9_questions_and_exercises.q1.offcial_answer;

public class Oddpredicate implements UnaryPredicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i % 2 != 0;
    }
}
