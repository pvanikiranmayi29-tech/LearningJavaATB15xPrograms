package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab186_Better_Abstract_Class {
    public static void main(String[] args) {
        Alto car = new Alto();
        car.drive();
        //seeing the drive method
        //others cant say that there is class car
        //which has incomplete functions and are fixed in the alto class
    }
}

class Alto extends Car1{

    void drive()
    {
        startCar();
        System.out.println("We are driving a Car");
        stopCar();
    }

    @Override
    void startCar() {
        System.out.println("Start the Car - Alto");
    }

    @Override
    void stopCar() {
        System.out.println("Stop the Car");
    }
}

abstract class Car1{
    abstract void startCar();
    abstract void stopCar();
}