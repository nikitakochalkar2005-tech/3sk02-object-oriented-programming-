class StaticVariableOrInstanceVariable {
   // Static variable: iska ek hi shared copy hota hai.
   static String college = "IIT Bombay";

   // Instance variable: har object ka name alag ho sakta hai.
   String name;

   // Static method: object banaye bina call kiya ja sakta hai.
   static void showCollage() {
      System.out.println("college: " + college);
   }

   // Instance method: iske liye object ki zarurat hoti hai.
   void showName() {
      System.out.println("student: " + this.name);
      System.out.println("college: " + college);
   }

   // Program ki execution main method se start hoti hai.
    public static void main(String[] args) {
      // Static method ko directly class ke andar se call kar sakte hain.
      showCollage();

      // 'new' keyword se student ka object create hota hai.
      StaticVariableOrInstanceVariable student = new StaticVariableOrInstanceVariable();

      // Instance variable ko object ke through value di jaati hai.
      student.name = "nikita";

      // Instance method ko object ke through call kiya jaata hai.
      student.showName();

   }
}




// class Student {
//     static String college = "IIT Bombay"; // Static Variable (Shared)
//     String name;                         // Instance Variable (Per Object)

//     // 1. Static Method (Class Level)
//     static void showCollege() {
//         System.out.println("College: " + college);
//     }

//     // 2. Instance Method (Object Level)
//     void showName() {
//         System.out.println("Student: " + this.name);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Static: Direct Class Name se chalega (No 'new' required) [1, 2]
//         Student.showCollege(); 

//         // Instance: Pehle 'new' se object banega, tab chalega [3, 4]
//         Student s1 = new Student();
//         s1.name = "Nikita";
//         s1.showName(); 
//     }
// }