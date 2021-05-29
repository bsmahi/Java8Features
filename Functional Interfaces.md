
# FunctionalInterface

``FunctionalInterface`` is an interface which contains a single abstract method(SAM) and may contain default methods(non-abstract) which has an implementation.
Eventhough an interface declares an abstract method overriding one of the public methods of ``java.lang.Object`` that also does *not* count toward the interface's abstract method count since any implementation of the interface will have an implementation from ``java.lang.Object`` or custom implementation from elsewhere.

> Instances of functional interfaces can be created with *lambda expression, method references, or constructor references.*

Complier will throw an error message in case annotation type doesn't meet the criteria of functionalinterface:

* @FunctionalInterface should be defined only for the type is an ``interface type`` and not an ``annotation type, enum, or class``
* An interface has only exactly one abstract method.

> Declaration of @FunctionalInterface annotation in class level is NOT mandatory, however, the complier will treat any interface whether it is meeting the criteria functionalinterface even annotation type declaration is present or not.

```java
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface FunctionalInterface {}
```
