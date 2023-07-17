# Exception Handling

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of this exercise is to practise:
- Creating custom exceptions
- Handling exceptions

For the exercises below, we've provided the starter project above.

## :pushpin: Exceptions

### <ins>Question 1</ins>

Is the following code legal?

```java
try {

} finally {

}
```

* Yes, it's legal — and very useful A try statement does not have to have a catch block if it has a finally block. If the code in the try statement has multiple exit points and no associated catch clauses, the code in the finally block is executed no matter how the try block is exited. Thus it makes sense to provide a finally block whenever there is code that must always be executed. This include resource recovery code, such as the code to close I/O streams.

### <ins>Question 2</ins>

What exception types can be caught by the following handler?
```java
catch (Exception e) {
    
}
```

What is wrong with using this type of exception handler?
* This handler catches exceptions of type Exception; therefore, it catches any exception. This can be a poor implementation because you are losing valuable information about the type of exception being thrown and making your code less efficient. As a result, your program may be forced to determine the type of exception before it can decide on the best recovery strategy.


### <ins>Question 3</ins>

Is there anything wrong with the following exception handler as written? Will this code compile?

```java
try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}
```

* This first handler catches exceptions of type Exception; therefore, it catches any exception, including ArithmeticException. The second handler could never be reached. This code will not compile.


### <ins>Question 4</ins>

```java
int[] A; 
A[0] = 0;
```

The above code produces (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] a checked exception
- [ x ] a compile error - The array is not initialised and will not compile
- [ ] no exception

---

The JVM starts running your program, but the JVM can't find the Java platform classes. 
(The Java platform classes reside in classes.zip or rt.jar.)

What happens (choose 1):

- [ x ] an error
- [ ] a checked exception
- [ ] a checked exception
- [ ] a compile error
- [ ] no exception

---
A program is reading a stream and reaches the end of stream marker.

What happens (choose 1):

- [ ] an error
- [ ] a checked exception
- [ ] a checked exception
- [ ] a compile error
- [ x ] no exception - When you read a stream, you expect there to be an end of stream marker. You should use exceptions to cathc behaviour in your program.

---

Before closing the stream and after reaching the end of stream marker, a program tries to read the stream again.

What happens (choose 1):

- [ ] an error
- [ x ] a checked exception
- [ ] a checked exception
- [ ] a compile error
- [ ] no exception

## :pushpin: Custom Exceptions

Create a class called `FileExtension`, with a `check` method that takes a `fileName` as a `String`.

The `check` method should:
- return `1` when the file extension is `.java`
- return `0` when the file extension is not `.java`
- throw a custom exception (that you'll create) when the file name is `null` or an empty string.

Then, in the `App::main` method, write code that creates a map as follows:
- it takes a list of file names
- checks each file's extension and maps the returned value to the filename
- maps `-1` when an exception occurs

**<ins>Example</ins>**

For the following list of file names: `List.of("App.java", "App.txt", null, "App.md")`, the program should create 
a map with the following entries

```txt
{"App.java", 1},
{"App.txt", 0},
{null, -1},
{"App.md", 0}
```

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/