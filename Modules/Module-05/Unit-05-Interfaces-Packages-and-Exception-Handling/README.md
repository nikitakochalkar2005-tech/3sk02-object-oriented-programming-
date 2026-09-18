# Unit 05: Interfaces, Packages & Exception Handling

## 1. Concepts

### Interfaces
- An interface defines a contract with abstract methods.
- A class can implement one or more interfaces.
- It helps achieve multiple inheritance in Java.

### Packages
- Packages are used to group related classes.
- They improve code organization and avoid naming conflicts.
- Built-in and user-defined packages can be imported.

### Exception Handling
- Java uses exceptions to handle runtime errors.
- `try`, `catch`, and `finally` are used for error management.
- `throw` and `throws` are used to explicitly raise and declare exceptions.

## 2. Notes

### Summary
- Interfaces support abstraction and multiple inheritance.
- Packages improve modularity and maintainability.
- Exception handling ensures programs are robust and stable.

## 3. Examples

### Example Program
```java
class DemoException {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("This block always executes");
        }
    }
}
```

### Explanation
- The code attempts division by zero.
- `ArithmeticException` is caught.
- The `finally` block executes regardless of success or failure.

## 4. Exercises

### Practice Questions
1. Write a program using an interface.
2. Create a custom package and import it in another class.
3. Demonstrate `try-catch-finally` with a user input example.
4. Create a custom exception and handle it.

## 5. Quiz / Viva Questions
- What is the purpose of an interface?
- Why are packages important in Java?
- What is the difference between `throw` and `throws`?
- Why is `finally` useful in exception handling?

## 6. Learning Outcomes
- Understand interface-based design
- Organize Java code using packages
- Handle exceptions and custom errors effectively
- Build robust Java applications
