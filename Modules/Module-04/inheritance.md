# inheritance

- inheritance ke concept mai parent class or child class hote child class ye parent class ki properties use kar sakata hai or khud child class ke pass khudki unique properties hoti hai 
- example: jaise maire pass maire parents ke kuch properties or maire undar bhi kuch unique talent hai jo maire parents ke pass nahi sirf o maire pass hai it means mai child class (child class) hu or maire parents ye parent class (super class) hai 
- parent class ko extract karane ke liye child class mai extends keywords use karate hai 
- Fundamental Rule: Inheritance hamesha "IS-A" (Is-A-Kind-Of) relationship ko model karta hai
- kiyu use karate hai inheritance man lo ek class hai  Animal name ki jis mai har animal ki kuch common properties hogi to o ek class mai likhe jayege us class ko parent class bolege or baki kuch properties hogi animal jo parent class nahi likh sakate kiyu har ek animal ki kuch specific properties jaise fish water mai sirf sas leti hai to properties child class mai likhege . 
- code Reusability aur Extensibility ke liye. common features ko parent class mein daala jata hai taaki har child class ko same code bar-bar na likhana pade.
-  Dog dog = new Dog(); vs Animal dog = new Dog();

1️⃣ Dog dog = new Dog(); (Subclass Reference)

Compiler Perspective: Compiler ise Dog class ke tarah dekhta hai.

Access Level: Isme Subclass (Dog) aur Superclass (Animal) dono ke properties aur methods access ho sakte hain.

Example:

```
Dog dog = new Dog();
dog.eat();  // 🟢 Valid (Parent 'Animal' class se aaya)
dog.bark(); // 🟢 Valid (Child 'Dog' class ka apna method)
```

2️⃣ Animal dog = new Dog(); (Superclass Reference / Polymorphism)

Compiler Perspective: Compiler ise sirf Animal class ke lens se dekhta hai (bhale hi memory mein object Dog ka ho).

Access Level: Isme sirf Superclass (Animal) mein declared properties aur methods call ho sakte hain.

Example:

```
Animal dog = new Dog();
dog.eat();  // 🟢 Valid (Animal class mein declared hai)
dog.bark(); // ❌ Compile-Time Error ('bark()' Animal class mein nahi hai)
```

# SUPER KEYWORD
- Super keyword kab use karana hai ? us ke liye ye niche wali condition use karana hai 
- - jab hame parent class mai parameter wala constructor diya ho tab hame super(parameter) keyword likhana hai o bhi child constructor ke bad pahili line par 
Yeh rahe aapke abhi tak ke padhe hue saare concepts ke **Master Study Notes**. Inhe aap bilkul structured tareeke se apne paas save/copy kar sakte hain:

---

# 📘 Master Study Notes: Java Inheritance & Constructors

---

## 🔹 Topic 1: Inheritance & `extends` Keyword

### 1. Definition & Meaning
Inheritance ka matlab hai ek class (**Child**) dwara doosri class (**Parent**) ki fields aur methods को inherit (re-use) karna.

### 2. Basic Syntax & Terminology
```java
class ParentClass {
    // Fields & Methods
}

class ChildClass extends ParentClass {
    // Inherited + Unique Members
}
```
* **Superclass / Parent Class / Base Class:** Jis class se properties li jati hain.
* **Subclass / Child Class / Derived Class:** Jo class properties ko adopt karti hai.

### 3. Golden Rules of `extends`
1. **Code Reusability:** Child class ko Parent ke non-private fields aur methods dobara likhne ki zaroorat nahi hoti.
2. **Single Inheritance Limit:** Java mein ek class ek waqt par sirf **ek hi Parent class** ko `extends` kar sakti hai (`class Child extends Parent1, Parent2` **invalid** hai).
3. **What is NOT Inherited:**
   * **`private`** members child class mein directly access nahi hote.
   * **Constructors** inherit nahi hote (lekin `super()` ke zariye call hote hain).

---

## 🔹 Topic 2: Constructor Execution Chain

### 1. Order of Execution
Jab bhi Child Class ka object banta hai (`new Child()`), Java background mein **pehle Parent Class ka constructor chalata hai, aur uske baad Child Class ka constructor chalata hai**.

### 2. Kyun?
Child class Parent par depend karti hai. Jab tak Parent setup (initialize) nahi hoga, tab tak Child class uski properties safely use nahi kar sakti.

---

## 🔹 Topic 3: `super()` Keyword & Parameterized Constructor Chaining

### 1. `super()` Keyword Rules
* **Line 1 Constraint:** `super()` ya `super(args)` hamesha Child Constructor ki **pehli line (Statement 1)** par hi hona chahiye.
* **Implicit Call:** Agar aap Child Constructor mein `super()` nahi likhte, toh Java compiler piche se **`super();` (default no-arg call)** apne aap laga deta hai.

### 2. Parameterized Constructor Call (`super(val)`)
* **Problem:** Agar Parent class mein khali (default) constructor nahi hai aur **sirf parameterized constructor** hai (jaise `Vehicle(String brand)`), toh Java ka automatic `super();` fail ho jata hai.
* **Solution:** Child Class ko apne constructor ke andar **explicitly `super(val)`** likhkar Parent ke constructor ko data pass karna **compulsory (zaroori)** ho jata hai.

### 3. Data Flow Architecture
```text
1. main() method          : new Bike("Yamaha")  --> Main ne Child ko value di
2. Child Constructor      : Bike(String myBrand) --> Child ne value receive ki
3. super(myBrand) call    : Vehicle(String brand) --> Child ne Parent ko forward ki
```

### 4. `super()` Ko `main()` Function Mein Kyun Nahi Likhte?
* **Static Context Restriction:** `main()` function `static` hota hai, jabki `super` sirf non-static (instance) context mein chalta hai.
* **Encapsulation & Responsibility:** Parent class ko setup karne ki zimmedari Child Class ke constructor ki hoti hai, `main()` function ki nahi.

---

## 🔹 Topic 4: Code Mein Constructor Kab Banana Hai? (5 Conditions Checklist)

Code likhte waqt neeche di gayi 5 me se koi bhi condition milne par constructor banaya jata hai:

| # | Condition / Trigger | Purpose | Example |
|---|---|---|---|
| **1** | **Initialization** | Object bante hi variables ko initial values dena taaki extra lines na likhni padein. | `Student s1 = new Student("Rahul", 20);` |
| **2** | **Mandatory Data Integrity** | Koi bhi user/developer bina required data ke khali object na bana sake. | `BankAccount acc = new BankAccount("ACC101");` |
| **3** | **Automatic Setup Code** | Object bante hi DB Connection, File Opening ya Welcome Log chalana. | `DatabaseConnection db = new DatabaseConnection();` |
| **4** | **Inheritance Requirement** | Jab Parent Class ke paas sirf parameterized constructor ho. | `Bike(String b) { super(b); }` |
| **5** | **Constructor Overloading** | Object banane ke ek se zyada tarike (ways) dena. | `Box()`, `Box(len)`, `Box(w, h, d)` |

---

## 🔹 Topic 5: Special Parent-Child Constructor Rule Summary

* **Condition A (Parent ke paas Default/Khali Constructor hai):**
  * Child class mein constructor likhna **OPTIONAL** hai. Java automatic `super();` chala kar kaam kar leta hai.
* **Condition B (Parent ke paas SIRF Parameterized Constructor hai):**
  * Child class mein constructor banakar **`super(value);`** pass karna **COMPULSORY** hai.

---

## 💻 Comprehensive Reference Code

```java
// 1. Parent Class
class Vehicle {
    String brand;

    // Parent Parameterized Constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Step 1: Parent Vehicle Initialized with Brand: " + this.brand);
    }
}

// 2. Child Class
class Bike extends Vehicle {
    boolean hasKickStart;

    // Child Parameterized Constructor
    Bike(String bikeBrand, boolean hasKickStart) {
        super(bikeBrand); // 👈 Mandatory Parameterized Super Call
        this.hasKickStart = hasKickStart;
        System.out.println("Step 2: Child Bike Initialized! KickStart: " + this.hasKickStart);
    }

    void ride() {
        System.out.println("Riding " + brand + " bike...");
    }
}

// 3. Main Class
public class VehicleRunnerApp {
    public static void main(String[] args) {
        Bike myBike = new Bike("Yamaha", true);
        myBike.ride();
    }
}
```

---

🎯 In notes ko ache se padhiye aur revise kijiye. Jab aap ready hon, toh batayein — kya hum Inheritance ke agle major step **Method Overriding (`@Override`)** par chalenge? 🚀