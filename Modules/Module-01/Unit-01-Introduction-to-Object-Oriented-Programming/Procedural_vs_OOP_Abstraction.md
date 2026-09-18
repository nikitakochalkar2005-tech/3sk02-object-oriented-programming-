# What is a Programming Paradigm?

Programming paradigm ek **sochne ka tarika** ya model hai. Yeh decide karta hai ki program mein code, data aur memory ko kaise organize kiya jayega.

## Procedural Programming ka Basic Idea

Procedural programming mein **code data par kaam karta hai**.

Process = Code acts on Data

Simple words mein:

- Code active hota hai.
- Data alag hota hai.
- Functions data ko read ya change karte hain.

## Design Approach: Top-Down Design

Is approach mein:

1. Puri problem ko ek large problem maana jata hai.
2. Us problem ko chhote-chhote functions mein divide kiya jata hai.
3. Har function ek particular task karta hai.

## Procedural Programming ki Problems

### 1. Global Data Exposure

Data ko global declare kiya jata hai, isliye koi bhi function use access ya change kar sakta hai. Isse data security kam ho jati hai.

### 2. Unintended Side Effects

Agar ek function global data ko change kar de, to doosre functions ka output bhi unexpectedly change ho sakta hai. Isse bugs aate hain.

### 3. Unorganized Code

Bahut zyada `GOTO` statements, jumps aur overlapping function calls se code uljha hua ho jata hai. Aise code ko samajhna aur debug karna difficult hota hai.

### 4. Low Reusability

Data aur functions alag-alag hote hain. Is wajah se code tightly connected rehta hai aur usse doosre programs mein reuse karna difficult hota hai.

## Easy Real-World Analogy

Procedural programming ek **open kitchen** jaisi hai:

- Saare ingredients table par openly rakhe hain.
- Koi bhi cook kisi bhi ingredient ko use ya change kar sakta hai.
- Agar ek cook ingredients ka arrangement badal de, to doosre cooks ko problem ho sakti hai.

Isi tarah procedural programming mein global data ko koi bhi function change kar sakta hai.

## Yaad Rakhne ka Shortcut

**Procedural Programming = Separate Data + Functions + More Global Access = More Bugs**

## 3. Object-Oriented Programming (Data-Centric Model)

### Core Philosophy: Data Controls Access to Code

OOP mein **data primary element** hota hai. Data aur us par kaam karne wale methods ek object ke andar hote hain.


	ext{Object} = {Data} + {Methods}


Simple words mein:

- Data object ke andar protected hota hai.
- Methods data ko access ya change karte hain.
- Bahar ka code data ko directly change nahi kar sakta.

### Design Approach: Bottom-Up Design

Is approach mein:

1. Pehle real-world entities identify ki jaati hain.
2. Har entity ka class blueprint banaya jata hai.
3. Objects create kiye jaate hain.
4. Objects ko connect karke complete system banaya jata hai.

### Key Characteristics

- **Encapsulation:** Data aur methods ko ek class mein bind karna.
- **Data Hiding:** Data ko direct access se protect karna.
- **Reusability:** Existing classes aur methods ko dobara use karna.
- **Modularity:** Bade system ko small, independent objects mein divide karna.
- **Polymorphism:** Same method ka different objects ke liye different behavior.

### Easy Real-World Analogy

OOP ek **restaurant kitchen with controlled access** jaisi hai:

- Ingredients kitchen ke andar safely stored hain.
- Sirf authorized chef hi unhe use ya change kar sakta hai.
- Customer directly ingredients ko change nahi kar sakta.

Isi tarah OOP mein data object ke andar protected hota hai aur methods controlled access provide karte hain.

## Yaad Rakhne ka Shortcut

**OOP = Data + Methods + Protection + Reusability**
