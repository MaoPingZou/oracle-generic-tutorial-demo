package org.zmp.g3_bounded_type_parameters.b1_multiple_bounds;

/**
 * a type parameter can have multiple bounds
 * 一个类型参数可以有多个边界
 * <p>
 * A type variable with multiple bounds is a subtype of all the types listed in the bound.
 * If one of the bounds is a class, it must be specified first.
 * 具有多个边界的类型变量是边界中列出的所有类型的子类型。
 * 如果其中一个边界是类，则必须首先指定它。
 */
public class MultipleBounds<T extends ClassA & InterfaceB & InterfaceC> {

}
