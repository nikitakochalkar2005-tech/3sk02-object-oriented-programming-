
// ============================================================================
// File Name: ChargeableDemo.java
// Topic: Interface Definition and Class Implementation in Java
// ============================================================================

// 1. INTERFACE: Contract / Capability define ki
// Yeh batata hai ki kya kaam hona chahiye (What to do), implementation class karegi.

interface Chargeable {
    void chargeBattery();
    
}


class SmartPhone implements Chargeable{

    public void chargeBattery(){
        System.out.println("SmartPhone: Charging via 65W Fast Charger");
    }
}

class TeslaCar implements Chargeable{
    public void chargeBattery(){
        System.out.println("TeslaCar: charging via Supercharger station:");
    }
}

class ChargeableDemo{
    public static void main(String args[]){
        // 🌟 INTERFACE REFERENCE VARIABLE (Universal Remote):
        // Type 'Chargeable' rakha par 'new' nahi lagaya (kyunki interface ka direct object nahi banta).
        // Yeh variable kisi bhi aisi class ke object ko point kar sakta hai jo Chargeable ko implement karti ho.
        Chargeable battery;
        // SmartPhone smartphone = new SmartPhone();
        // TeslaCar teslacar = new TeslaCar();
        // smartphone.chargeBattery();
        // teslacar.chargeBattery();
        battery = new SmartPhone();
         battery.chargeBattery();
        battery = new TeslaCar();
        battery.chargeBattery();

    }
}