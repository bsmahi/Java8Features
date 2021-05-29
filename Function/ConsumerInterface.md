# Consumer Interface

``Consumer`` is a functional interface ``which accepts one argument and returns nothing``. Since it is functional interface, which contains ONLY a single abstract method and can have a many default methods. 

This is a functional interface whose functional method is ``accept(Object)``.

Abstract Method: ``accept(T t) or accept(Object)``

Default Method: ``andThen(Consumer<? super T> after)``

```java

@FunctionalInterface
public interface Consumer<T>

```
Below is the example which show case Consumer Function

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        // Consumer to display a String
        // Display it as using Method Reference
        Consumer<String> stringResult = System.out::println;

        // accept one argument and doesn't return anything.
        stringResult.accept("Consumer Functional Interface a Single Abstract Method Using accept(T t) method: Mahendra");

        List<String> names = Arrays.asList("Puneeth Sai", "Likitha", "Sravan", "Bunty", "HrushiKesh");

        Consumer<List<String>> modifyNames = name -> {
            for (int i = 0; i < name.size(); i++) {
                name.set(i, name.get(i).toUpperCase());// transforming String to upperCase
            }
        };
        System.out.println("Consumer Functional Interface a Single Abstract Method Using andthen() method: ");
        // Assignement Context and Method Invocation Context
        Consumer<List<String>> displayNames = result -> result.forEach(System.out::println);

        // andThen() method transform input list of elements to upperCase.
        // if names is null, it will throw an NullPointerException
        modifyNames.andThen(displayNames).accept(names);
    }
}
```
[Consumer Reference Link:](https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html)
