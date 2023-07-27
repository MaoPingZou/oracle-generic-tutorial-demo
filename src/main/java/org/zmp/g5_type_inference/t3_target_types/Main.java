package org.zmp.g5_type_inference.t3_target_types;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Collections 类中又一个 emptyList 方法
        // static <T> List<T> emptyList();

        List<String> listOne = Collections.emptyList();
        // 也可以写成
        List<String> listOne1 = Collections.<String>emptyList();

        // 在java 7之前的版本中，下面的语句会不能编译，会生成类似如下的报错信息：
        // List<Object> cannot be converted to List<String>
        processStringList(Collections.emptyList());
        // 必须声明成
        processStringList(Collections.<String>emptyList());

        // 但在java 8中，目标类型的概念已经拓展到了方法参数上，所以下面的语句能正常编译
        // The notion of what is a target type has been expanded to include method arguments
        processStringList(Collections.emptyList());
    }

    static void processStringList(List<String> stringList) {
        // process stringList
    }
}
