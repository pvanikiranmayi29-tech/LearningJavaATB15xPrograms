package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.drive();
        //looking into this we dont know that interface breaks and engine exists
    }

}

class Car2 implements Brakes,Engine1{

    void drive()
    {
        startEngine();
        applyBreaks();
        testEngine();
        //testEngineStatic(); //static cannot be called directly
        Engine1.testEngineStatic(); //we can use it by using interface.staticmethod
        stopEngine();
    }
    //testEngine need not be override as it is complete
    @Override
    public void applyBreaks() {
        System.out.println("applyBreaks");
    }

    @Override
    public void startEngine() {
        System.out.println("startEngine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopEngine");
    }
}
//instead of using abstarct class - we can use interface
//interfaces are always incomplete in nature
interface Brakes{
    void applyBreaks();
    //so we cannot give complete functions
    /*void applyBreaks2()
    {

    }*/
}

interface Engine1{
    void startEngine();
    void stopEngine();

    //we can have complete functions in the interfaces
    //by using default or static keywords

    default void testEngine(){
        System.out.println("Concrete - Complete");
        System.out.println("Testing the Engine");
    }

    static void testEngineStatic(){
        System.out.println("Concrete - Complete");
        System.out.println("Testing the Engine - static");
    }
}