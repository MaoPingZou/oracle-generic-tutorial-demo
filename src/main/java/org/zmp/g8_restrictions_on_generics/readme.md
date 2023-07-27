## 概述 Overview

为了有效地使用Java泛型，必须考虑以下限制：
- 不能使用基元类型实例化泛型类型
- 无法创建类型参数(Type Parameters)的实例
- 无法声明类型为类型参数(Type Parameters)的静态字段
- 不能将强制转换或实例与参数化类型(Parameterized Types)一起使用
- 无法创建参数化类型(Parameterized Types)的数组
- 无法创建、捕获或抛出参数化类型(Parameterized Types)的对象
- 不能重载每个重载的形式参数类型擦除为相同原始类型的方法

## 不能使用基元类型实例化泛型类型
```java
class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // ...
}
```
在创建`Pair`对象时，不能使用基元类型，会导致编译错误。
```java
    Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
```
只能给类型参数使用非基元类型，如下：
```java
    // 这里 Java 编译器会对 8，a，进行自动装箱处理
    Pair<Integer, Character> p = new Pair<>(8, 'a');
```

## 无法创建类型参数(Type Parameters)的实例
以下代码将会报错。
```java
public static <E> void append(List<E> list) {
    E elem = new E();  // compile-time error
    list.add(elem);
}
```
但是，可以通过反射来创建类型参数的对象
```java
public static <E> void append(List<E> list, Class<E> cls) throws Exception {
    E elem = cls.newInstance();   // OK
    list.add(elem);
}
```
然后就可以像下面一个调用上面的方法：
```java
List<String> ls = new ArrayList<>();
append(ls, String.class);
```

## 无法声明类型为类型参数(Type Parameters)的静态字段

类的静态字段是共享给所有类的非静态对象的类级别变量。因此，不允许使用参数类型的静态字段。
```java
public class MobileDevice<T> {
    private static T os;

    // ...
}
```
如果上述类中的静态字段声明是允许的，那么下面的代码就会造成误解：
```java
MobileDevice<Smartphone> phone = new MobileDevice<>();
MobileDevice<Pager> pager = new MobileDevice<>();
MobileDevice<TabletPC> pc = new MobileDevice<>();
```
如果静态字段`os`是共享给 phone, pager, pc 的，那`os`的实际类型是什么呢？
它不能同时是 Smartphone，Pager，TabletPC，因此，不能创建参数类型的静态字段。

## 不能将强制转换或实例与参数化类型(Parameterized Types)一起使用
因为在编译时，Java 编译器会将泛型代码中的所有类型参数都擦除掉，所以，无法验证在运行时正在使用泛型类型的哪个参数化类型：
```java
public static <E> void rtti(List<E> list) {
    // 在编译时会报错：java: java.util.List<E> cannot be safely cast to java.util.ArrayList<java.lang.Integer>
    if (list instanceof ArrayList<Integer>) {  // compile-time error
        // ...
    }
}
```
下面的代码是允许的：
```java 
public static <E> void rtti(List<E> list) {
    if (list instanceof ArrayList<E>) {  // OK;
        // ...
    }
}
```

## 不能创建参数化类型(Parameterized Types)的数组
不能创建参数化类型的数组。例如，以下代码不能编译通过：
```java
List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error
```

## 无法创建、捕获或抛出参数化类型(Parameterized Types)的对象
泛型类不能直接或间接扩展 Throwable 类。例如，以下类将不会通过编译：
```java
// 间接继承 Throwable 
class MathException<T> extends Exception { /* ... */ }    // compile-time error

// 直接继承 Throwable
class QueueFullException<T> extends Throwable { /* ... */ // compile-time error
```
一个方法不能捕获catch类型参数的实例：
```java
public static <T extends Exception, J> void execute(List<J> jobs) {
    try {
        for (J job : jobs)
            // ...
    } catch (T e) {   // compile-time error
        // ...
    }
}
```
但是，可以在 throws 语句中使用类型参数，如下：
```java
class Parser<T extends Exception> {
    public void parse(File file) throws T {     // OK
        // ...
    }
}

```

## 不能重载每个重载的形式参数类型擦除为相同原始类型的方法
一个类不能有两个在类型擦除之后方法签名相同的重载方法，如：
```java
public class Example {
    public void print(Set<String> strSet) { }
    public void print(Set<Integer> intSet) { }
}

```
这样的重载并将生成编译时错误。



























































