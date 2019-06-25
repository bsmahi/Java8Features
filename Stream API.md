
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

