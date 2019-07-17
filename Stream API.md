
# Stream API

Stream API was introduced in Java 8. It provided a *declartive programming* approach to iterate and perform operations over a collection. Until Java 7, *for* and *for each* were the only options available, which was an *imperative programming* approach. Let me introduce you to the Stream API and how it provides an abstraction over the common operations performed over a collection.

*Def: A Stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.*

*While using **Imperative Programming**, the developer uses the language constructs to write both **what to do and how to do**. Whereas while using **Declarative Programming**, developer has to focus only on defining **what to do** and the language or the framework takes care of the **how to do** part. Hence in Declarative Programming, the code is concise and less error-prone.*

The features of Java Stream are:

  * A Stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
  * Streams don't change the original data structure, then only provide the result as per the pipelined methods.
  * Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can     be pipelined. Terminal operations mark the end of the stream and return the result.

The operations that are generally performed over a collection can be categorized into the following. Below mentioned operations in the examples for introducing the *Stream* API.

* Transforming
* Filtering
* Searching
* Reordering
* Summarizing
* Grouping

```Java

public class Student {
    
    private final String name;
    private final int age;
    private final Gender gender;
    
    public Student(String name, int age, Gender gender) {
      this.name = name;
      this.age = age;
      this.gender = gender;
    }
    
    public String getName() {
       return name;
    }
    
    public int getAge() {
       return age;
    }
    
    public Gender getGender() {
       return gender;
    }
     
}

public enum Gender {
   MALE, FEMALE, OTHER
}
```
Before diving deep into the examples of operations performed over a collection using Stream API, let's use an example to understand the Stream API itself.

```java
 List<Student> student = ...
 
 //building a stream
 List<String> studentsBelow20 = student.stream()
                                       .filter(student -> student.getAge() < 20) // pipelining a computation
                                       .map(Student :: getName) //pipelining another computation
                                       .collect(Collectors.toList()); // terminating a stream.
                                       
```

In above example, multiple operations are chained together to form something like a processing pipeline. This is called a ***stream pipeline*** and contains the three parts: 

*1. **Stream Builder***:  
      
   In the above code snippet, we have a collection of Student represented by students. The ```stream()```method, that was        added on the ```Collection``` interface in Java 8, is called upon ```student``` to build the stream. Common sources for        stream apart from Collection are arrays (```Arrays.stream()```) and generator functions(```Stream.iterate()```) and            ```Stream.generate()```).
      
*2. **Intermediate Operation(s)***:
  
   Once a stream object is created, you can apply zero, one or more than one operations on the stream by chaining the            operations, like in a builder pattern. All the methods that you see in above code example, ```filter``` and ```map```,
   are methods on the ```Stream``` interface and they return the instance of ```Stream``` itself to enable chaining. As the      operations return ```Stream``` itself, they are called intermediate operations.
   
*3. **Terminal Operation*** :
     
   Once all the computations are applied, you finish the pipeline by applying a mandatory terminal operator. The terminal 
   operators are also methods on the ```Stream``` interface and return a resultant type that is not a Stream. In the above
   code example ```collect(Collectors.toList())``` returns an instance of ```List```. The resultant type may or may not be a      Collection based on which terminal operation is used. It can be a primitive value or an instance of an object that is not
   a Collection.
   
   ## Transforming ##
   
   Transforming means converting the type of value that is stored in each element of a collection. Let's say we want to derive
   a collection of names of student from the student collection. In such a case we have to use a transformation operation to      transform the person to name.
   
   
   In the below code snippet, we use the ```map``` intermediate operator to transform ```Student``` to a ```String``` holding 
   the name of the student. ```Student:: getName``` is [method reference] .             (https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html) and is equivalent to ```person ->     person.getName()```    and is an instance of a [Function] (https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html).
   
  ```java
    
    List<String> namesOfStudent = student.stream()
                                  .map(Student::getName)
                                  .collect(Collectors.toList());
  
  ```
  ## Filtering ##
  
  As the word suggests, filtering operations allow objects to flow through itself only if the object fulfills the conditions     laid upon by a Predicate. The filter operator is composed with the ```Predicate``` before it is applied to the Stream.
  Filtering can also be thought of as selecting few elements based on count. Stream API provides ```skip()``` and ```limit()``` operators   for this purpose.
  
  
  In the first example below, the student -> student.getAge() < 20 Predicate is used to build a collection containing only       student below age of 20. 
  In the second example below, 10 students are selected after skipping first 2.
  
  ```java
     // filtering using Predicate
   List<Student> listOfStudentBelow20 = student.stream() 
       .filter(student -> student.getAge() < 20)  
       .collect(Collectors.toList());
       
   // count based filtering    
   List<Student> smallerListOfStudent = student.stream()
       .skip(2)
       .limit(10)
       .collect(Collectors.toList());
       
  ```
  
  ## Searching ##
  
  
  ## Reordering ##
  
  
  ## Summarizing ##
  
  
  ## Grouping ##
  
