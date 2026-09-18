# Unit 02: Introduction to Java & Programming Constructs

## 1. Concepts

### Java Virtual Machine (JVM)
- JVM executes Java bytecode.
- It provides platform independence.
- Java source code is compiled into bytecode and then run by JVM.

### Java Features
- Simple and secure
- Platform independent
- Object-oriented
- Robust and portable

### Variables and Data Types
- Primitive types include int, float, char, boolean, etc.
- Variables must be declared before use.
- Type conversion may be implicit or explicit.

### Operators and Control Flow
- Operators include arithmetic, relational, logical, and assignment operators.
- Control statements include if, switch, for, while, and do-while.

## 2. Notes

### Summary
- Java is a platform-independent language because of JVM.
- Control flow is essential for decision-making and repetition.
- Understanding types and operators is necessary for writing correct programs.

## 3. Examples

### Example Program
```java
public class DemoOperators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int sum = a + b;
        System.out.println("Sum = " + sum);

        if (sum > 10) {
            System.out.println("Sum is greater than 10");
        }
    }
}
```

### Explanation
- `a` and `b` are integer variables.
- `+` adds the numbers.
- `if` statement checks the condition and prints output.

## 4. Exercises

### Practice Questions
1. Explain JVM architecture in brief.
2. Write a Java program using `if-else`.
3. Perform type conversion between int and float.
4. Write a program to print the largest of three numbers.

## 5. Quiz / Viva Questions
- What is the role of JVM?
- Why is Java platform independent?
- What is the difference between implicit and explicit type conversion?
- When do we use `switch` instead of `if`?

## 6. Learning Outcomes
- Understand the JVM execution model
- Use Java primitive data types correctly
- Write flow control logic in Java
- Apply operators and expressions safely
