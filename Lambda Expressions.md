# Lambda(λ) Expressions 
 
Lambda expression (λ) is a new and important feature of Java8, it provides a clear and concise way to represent **one method interface using an expression**. It is very **useful in collection library**. It helps to **iterate, filter and extract data** from collection.

The Lambda expression is used to provide the implementation of **an interface which has functional interface**. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation.

**Java lambda expression is treated as a function, so compiler does not create .class file.**

## Functional Interface
An interface which has ONLY **one abstract method or Single Abstract Method (SAM)** is called Functional Interface.
Java provides an annotation *@FunctionalInterface*, which is used to declare an interface as functional interface.
**@Functional Interface** annotation is introduced in Java8 to mark an interface as functional. It ensures at **compile-time it has only single abstract method, otherwise it will throw compilation error**.

Lambda expression provides implementation of *Functional Interface* and it is less coding.

```Java
{ argument-list } -> { body }
```
It consists of three components 
* argument-list : It can be empty or non-empty as well
* (->) : It is used to link arguments-list and body of expression
* Body : It contains expressions and statements for Lambda Expressions

```Java
package com.demo.practice.Java8Features;

/*
  * Lambda Expression - provides a clear and concise way to represent one method interface using an expression, 
    useful in collection library.
  * It helps to iterate, filter and extract data from collection.
  * (arguments-list) -> { body }
  * Lambda expression provides implementation of functional interface. An interface which has only one abstract method is         called functional interface.
  * Java provides an annotation @FunctionalInterface, which is used to declare an interface as functional interface.
*/
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Drawable{
    void draw();
}

interface Sayable{
    String say(String name);
}

interface Addable{
    int add(int a, int b);
}

public class LambdaExpressionFeature {

    public static void main(String[] args) {
        int width=10;

        //With Lambda

        Drawable drawable = () -> {
            System.out.println("Drawing "+ width);
        };
        drawable.draw();

        //with a single parameter
        Sayable s1 = (name)->{
            return "Hello "+name;
        };
        System.out.println(s1.say("Puneeth Sai"));

        //with a multiple parameters
        Addable a1 = (a,b)->(a+b);
        System.out.println(a1.add(900, 900));

        //Multiple parameters with data type in lambda expressions
        Addable a2 = (int a, int b) ->{
            return (a+b);
        };
        System.out.println(a2.add(1800, 1800));
        
        //forEach concept in Java8
        List<String> list = new ArrayList<>();
        list.add("Sravan");
        list.add("Swarna");
        list.add("Likitha");
        list.add("Puneeth Sai");

        //traversing through iterator
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s2 = iterator.next();
            System.out.println("Before Java8 Iterator Value::"+s2);

        }
        System.out.println("\n");
        list.forEach( (n) -> System.out.println("With Java8 Iterator Value::"+n) );

    }
}
```




