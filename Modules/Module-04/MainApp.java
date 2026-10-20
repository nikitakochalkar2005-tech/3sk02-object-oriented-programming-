class Parent{
    int number = 10;
}

class Child extends Parent{
    int number = 20;
    void show(){
        System.out.println("child number ="+number);
        System.out.println("parent number ="+super.number);
    }
}

class MainApp{
    public static void main(String args[]){
        Child  child = new Child();
        child.show();
    }
}