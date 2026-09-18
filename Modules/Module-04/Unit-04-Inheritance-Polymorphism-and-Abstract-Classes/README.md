# Unit 04: Inheritance, Polymorphism & Abstract Classes

## 1. Concepts

### Inheritance
- Inheritance helps a class reuse code from a parent class.
- The child class inherits properties and methods of the parent.
- It supports code reuse and extensibility.

### Method Overriding
- A subclass provides a specific implementation of a method already defined in the parent class.
- It enables polymorphic behavior.

### `super` and `final`
- `super` is used to access parent class members.
- `final` restricts method overriding or class inheritance.

### Abstract Classes
- Abstract classes may contain abstract methods.
- They cannot be instantiated directly.
- Subclasses provide implementations for abstract methods.

## 2. Notes

### Summary
- Inheritance supports code reuse.
- Polymorphism allows the same method call to behave differently.
- Abstract classes define common behavior while leaving implementation details to subclasses.

## 3. Examples

### Example Program
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class DemoAnimal {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

### Explanation
- `Animal` is abstract.
- `Dog` implements the abstract method `sound()`.
- The object is assigned to the parent type, demonstrating polymorphism.

## 4. Exercises

### Practice Questions
1. Write a program using inheritance with a parent and child class.
2. Show method overriding in Java.
3. Explain the use of `super` in constructor chaining.
4. Create an abstract class with at least one abstract method.

## 5. Quiz / Viva Questions
- What is inheritance?
- How is polymorphism different from method overloading?
- Why are abstract classes useful?
- What is the purpose of the `final` keyword?

## 6. Learning Outcomes
- Design reusable class hierarchies
- Implement method overriding and dynamic dispatch
- Apply abstract classes in OOP design
- Understand runtime polymorphism in Java
