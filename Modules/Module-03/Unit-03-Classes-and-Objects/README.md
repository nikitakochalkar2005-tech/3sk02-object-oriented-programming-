# Unit 03: Classes and Objects

## 1. Concepts

### Classes and Objects
- A class is a blueprint for creating objects.
- An object is an instance of a class.
- Classes contain attributes and methods.

### Constructors
- Constructors are special methods used to initialize objects.
- Default constructors are provided by Java if none is defined.
- Parameterized constructors allow custom initialization.

### Static Members
- `static` variables and methods belong to the class rather than a single object.
- They are shared across all instances.

### Arrays
- Arrays store multiple values of the same type.
- 1D and 2D arrays are commonly used in Java programs.

## 2. Notes

### Summary
- Classes and objects are the foundation of OOP.
- Constructors initialize objects.
- `this` keyword helps access the current object.
- Static elements are shared across all objects.

## 3. Examples

### Example Program
```java
class Box {
    int length;
    int breadth;

    Box(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class DemoBox {
    public static void main(String[] args) {
        Box b = new Box(5, 4);
        System.out.println("Area = " + b.area());
    }
}
```

### Explanation
- `Box` is a class with data members and a method.
- The constructor initializes the object.
- `area()` computes the area using object data.

## 4. Exercises

### Practice Questions
1. Write a class to represent a rectangle.
2. Create a program using a parameterized constructor.
3. Demonstrate the use of static variables.
4. Write a Java program to find the sum of elements in a 1D array.

## 5. Quiz / Viva Questions
- What is the difference between a class and an object?
- Why are constructors needed?
- What is the purpose of the `this` keyword?
- How is a 2D array different from a 1D array?

## 6. Learning Outcomes
- Understand object creation and initialization
- Implement methods and constructors effectively
- Use static members correctly
- Work with arrays and input handling
