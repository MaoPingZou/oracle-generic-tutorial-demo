package org.zmp.g9_questions_and_exercises.q9;

/**
 * Will the following class compile? If not, why?
 * 以下代码将编译通过吗？如果不能，为什么？
 * </p>
 * public class Singleton<T> {
 *     public static T getInstance() {
 *         if (instance == null)
 *             instance = new Singleton<T>();
 *         return instance;
 *     }
 *     private static T instance = null;
 * }
 */
public class Q9 {

    /*
     * 不能。原因：
     * 1、不能实例化一个范型类；
     * 2、类中不能声明类型参数的静态字段
     */

}
