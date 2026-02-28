package ex_23_OOPs_Super_Abstraction.superkeyword;

public class Lab182_super {
}

class Vehicle
{
    public int maxSpeed = 180;

    Vehicle()
    {
        System.out.println("Default Constructor");
    }
    Vehicle(int a)
    {
        System.out.println("Pram Constructor");
    }
    Vehicle(int a, int b)
    {
        System.out.println("Pram Constructor");
    }
    //Method Overloading
    void message()
    {
        System.out.println("No Return, No Arguments");
    }
    void message(int a)
    {
        System.out.println("PC - argument");
    }
    void drive()
    {
        System.out.println("Vehicle Parent");
    }
    void noTest()
    {
        System.out.println("Empty");
    }
}

class Car extends Vehicle{
    private int maxSpeed = 180;

    Car()
    {
        super(100);
    }
    Car(int a){
        System.out.println("PC - Car");
    }
    void test()
    {

    }
    @Override
    void drive(){
        super.drive();
        this.test();
    }
}