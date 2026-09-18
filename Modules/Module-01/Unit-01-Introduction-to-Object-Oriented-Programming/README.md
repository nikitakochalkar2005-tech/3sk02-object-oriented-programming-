# Unit 01: Introduction to Object Oriented Programming

## 1. Concepts

### Introduction to OOP
- OOP is a programming paradigm that organizes software around objects and classes.
- It helps manage complexity by breaking a system into smaller, reusable parts.
- Real-world entities can be represented as objects with data and behavior.

### Need of OOP
- Handles large software systems more effectively.
- Improves code reusability and maintainability.
- Supports modular design and easier debugging.

### Principles of Object-Oriented Languages
- Abstraction: hiding unnecessary details and exposing only essential features
- Encapsulation: binding data and methods together
- Inheritance: reusing properties of parent classes
- Polymorphism: one interface, multiple behaviors

### Procedural Language vs OOP
- Procedural programming focuses on functions and step-by-step logic.
- OOP focuses on objects, classes, and interactions between them.

## 2. Notes

### Summary
- OOP improves scalability and maintainability.
- It models real-life entities efficiently.
- Classes and objects are the foundation of Java programming.

## 3. Examples

### Example Program
```java
class Student {
    String name;

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class DemoStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.display();
    }
}
```

### Explanation
- `Student` is a class.
- `s1` is an object of the class.
- `display()` shows how methods work with object data.

## 4. Exercises

### Practice Questions
1. Define OOP in your own words.
2. List the four main principles of OOP.
3. Compare procedural and object-oriented programming.
4. Give examples of real-world objects that can be modeled in Java.

## 5. Quiz / Viva Questions
- What is the main idea of OOP?
- Why is encapsulation important?
- What is the difference between a class and an object?
- How does inheritance help in code reuse?

## 6. Learning Outcomes
- Understand the purpose of OOP
- Apply OOP concepts in Java
- Compare OOP with procedural programming
- Analyze how objects model real-world systems
