class ProceduralSecurityDemo {

   static  double globalAccountBalance = 1000.0;
  static  String globalCustomerName = "Nikita";
    static void deposit(double amount){
        globalAccountBalance += amount;
    }
    static void withdraw(double amount){
        globalAccountBalance -= amount;
    }
    public static void main(String args[]){
        deposit(500.0);
        System.out.println("valid deposit balance:"+globalAccountBalance);

    }
}
// 

//         // ⚠️ CRITICAL SECURITY VULNERABILITY / DATA CORRUPTION:
//         // Direct access is open! Any malicious or bugged code can 
//         // bypass deposit/withdraw functions and directly inject negative data.
//         globalAccountBalance = -99999.0; // Direct Memory Corruption!
        
//         System.out.println("❌ Corrupted Balance: $" + globalAccountBalance);
//     }
// }