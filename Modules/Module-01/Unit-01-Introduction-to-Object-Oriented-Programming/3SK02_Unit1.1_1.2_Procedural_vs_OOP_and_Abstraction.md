## PART 2: Sub-Unit 1.2

# Pillar 1: Data Abstraction & Representation

## 1. Data Abstraction

**Meaning:** Unnecessary implementation details hide karke user ko sirf essential features dikhana.

**Core idea:** Abstraction = **WHAT, not HOW**

**Example:** ATM user ko card, PIN aur amount ka option dikhata hai; server connection aur database process hidden rehta hai.

```java
abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle {
	void start() {
		System.out.println("Car starts");
	}
}
```

- `Vehicle` batata hai **kya** karna hai.
- `Car` batati hai **kaise** karna hai.
- Java mein abstraction: abstract classes aur interfaces.

| Concept | Focus |
|---|---|
| Abstraction | Implementation details hide karna |
| Encapsulation | Data aur methods ko protect karna |

**Benefits:** Less complexity, better security, easy maintenance, and flexible design.

---

## PART 3: 4-Step Process - Class Blueprint Modeling

**Class blueprint = Object banane ka design plan.**

1. **Entities:** Important nouns ko classes ke roop mein identify karo. Example: `Customer`, `BankAccount`.
2. **Attributes:** Entity ki properties ko variables banao. Example: `accountNumber`, `balance`.
3. **Behaviors:** Entity ke actions ko methods banao. Example: `deposit()`, `withdraw()`.
4. **Relationships:** Classes ke connections define karke blueprint complete karo. Example: `Customer` has `BankAccount`.

```java
class BankAccount {
	private String accountNumber;
	private double balance;

	void deposit(double amount) {
		balance += amount;
	}

	double checkBalance() {
		return balance;
	}
}
```

**Memory trick:** E-A-B-R = **Entities -> Attributes -> Behaviors -> Relationships**

**Exam point:** Class blueprint modeling real-world problem ko entities, attributes, behaviors, and relationships wali classes mein convert karta hai.

---

## PART 4: 3-Step Method - Extracting Essential Behaviors (Methods)

```text
Requirement -> Action Word -> Method Name -> Input/Output
```

1. **Action:** Requirement mein verbs find karo. `deposit`, `withdraw`, `check balance`.
2. **Name:** Action ko `lowerCamelCase` method banao. `check balance` -> `checkBalance()`.
3. **Input/Output:** Parameters aur return type define karo.

```java
void deposit(double amount) {
	balance += amount;
}

double checkBalance() {
	return balance;
}
```

**Memory trick:** A-N-I = **Action -> Name -> Input/Output**

**Exam point:** Methods requirements ke action words se extract hote hain, phir unke names, parameters, aur return types define kiye jaate hain.

---

## PART 5: Key Benefits of Clean Behavior Extraction

Clean methods ka result:

- **Clarity:** Purpose clear hota hai.
- **Cohesion:** Har method focused task karta hai.
- **Low Coupling:** Unnecessary dependencies kam hoti hain.
- **Reusability:** Methods dobara use ho sakte hain.
- **Maintainability:** Changes aur debugging easy hoti hai.
- **Testability:** Methods independently test ho sakte hain.

**Formula:** Clear Requirement -> Clear Method -> Clean Design

---

## PART 6: Global Academic & Industry Standards Alignment

| Standard | Main Alignment |
|---|---|
| **ACM/IEEE CS2023** | OOP design, abstraction, and modularity |
| **IEEE SWEBOK V4** | Software design, construction, and maintainability |
| **IEEE SWECOM** | Requirements, detailed design, coding, and refactoring |
| **IEA GAPC** | Engineering knowledge, problem analysis, and solution design |

**Professional outcome:** Requirements ko classes aur methods mein convert karna clear, reusable, maintainable, and industry-ready software design support karta hai.
