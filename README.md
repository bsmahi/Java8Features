# Java8Features
Java 8 Features with an Examples

Java 8 is a major feature release of Java programming language development. Its initial version
was released on 18th March 2014, With the Java 8 release, Java provided supports [Functional Programming](https://en.wikipedia.org/wiki/Functional_programming), new Javascript Engine, new APIs for date time manipulation, new streaming API and upgrades to Java programming, JVM, Tools and Engine.

Java 8 provides following features of 

* Lambda Expressions (λ)
* Method References
* Functional Interfaces
* Stream API
* Default Methods
* Base64 Encode Decode
* Static Methods in Interface
* Optional Class
* Collectors Class
* ForEach() method
* Parallel Array Sorting
* Nashorn Javascript Engine
* Type and Repeat Annotations
* IO Enhancements
* Concurrency Enhancements
* JDBC Enhancements

# Lambda(λ) Expessions 
 
Lambda expression (λ) is a new and important feature of Java8, it provides a clear and concise way to represent **one method interface using an expression**. It is very **useful in collection library**. It helps to **iterate, filter and extract data** from collection.

The Lambda expression is used to provide the implementation of **an interface which has functional interface**. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation.

**Java lambda expression is treated as a function, so compiler does not create .class file.**

## Functional Interface
An interface which has ONLY **one abstract method or Single Abstract Method (SAM)** is called Functional Interface. Java provides an annotation *@FunctionalInterface*, which is used to declare an interface as functional interface.

Lambda expression provides implementation of *Functional Interface* and it is less coding.

```Java
{ argument-list } -> { body }
```


