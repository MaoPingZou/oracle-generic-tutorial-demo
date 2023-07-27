package org.zmp.g9_questions_and_exercises.q2;

/**
 * Will the following class compile? If not, why?
 * </p>
 * public final class Algorithm {
 *     public static <T> T max(T x, T y) {
 *         return x > y ? x : y;
 *     }
 * }
 */
public class Q2 {
    /*
     * 不能编译。
     * 原因：不能将比较符号 > 用到 类型参数的比较中
     */
}
