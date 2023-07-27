```java
public static <T extends Comparable<T>>
    int findFirstGreaterThan(T[] at, T elem) {
    // ...
}
```
以上代码在类型擦除后会变成如下代码：

```java
public static int findFirstGreaterThan(Comparable[] at, Comparable elem) {
    // ...
}
```