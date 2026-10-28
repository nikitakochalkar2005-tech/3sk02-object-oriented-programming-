
class Vehicle{
    void start(){
    System.out.println("car is start with a keyless push button !:");
    }
}

class  Car extends Vehicle{
   void start(){
     System.out.println("car is start:");
    }
    void startSunroof(){
        System.out.println("sunroof is opening");

    }
}

class CastingPractice{
    public static void main(String args[]){
    Car car = new Car();
    Vehicle car1 = new Car();
    car.start();
    car.startSunroof();
    car1.start();
    }
   
}