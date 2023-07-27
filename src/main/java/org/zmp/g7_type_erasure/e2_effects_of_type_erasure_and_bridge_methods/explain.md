问题：为什么 `Main` 类中的 `n.setData("Hello");` 语句会抛出 `ClassCastException` 异常？

解答：
在类型擦除之后，`Node` 和 `MyNode` 两个类的代码变成如下所示：

```java
public class Node {

    public Object data;

    public Node(Object data) {
        this.data = data;
    }

    public void setData(Object data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}
```

```java
public class MyNode extends Node {

    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
```

可以看到`Node`类在类型擦除之后，方法签名不匹配了：`Node.setData(T)` 方法变成了 `Node.setData(Object)`.
因此，`MyNode.setData(Integer)`方法不会覆盖 `Node.setData(Object)` 方法。

为了解决这个问题，并且在类型擦除后保留泛型类型的多态性，Java 编译器生成一个桥接方法，以确保子类型按预期工作。

对于 `MyNode` 类，编译器会为 `setData` 方法生成以下桥接方法：
```java
class MyNode extends Node {

    // 由编译器生成的桥接方法
    public void setData(Object data) {
        setData((Integer) data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    // ...
}
```
可以看到，桥接方法`MyNode.setData(object)`委托给了原始的`MyNode.setData(Integer)`方法。

结果就是，`n.setData("Hello");` 语句调用了 `MyNode.setData(object)` 方法。

因为字符串 `"Hello"` 不能转换成 `Integer`，导致了 `ClassCastException` 异常被抛出；











