package ex_20_OOPs_Polymorphism.methodoverriding;

public class Lab189_MOverriding {
    public static void main(String[] args) {

        Pramod p1 = new Pramod();
        p1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Pramod(); //Dynamic Dispatch
        f2.home(); //this will be 3BHK as the object is using the Pramod for creating the object
    }
}

class Father
{
    void home()
    {
        System.out.println("2 BHK");
    }
}

class Pramod extends Father{
    //the symbol displayed near 29 line number is overriding
    //@override is optional but it is good coding practice
    @Override
    void home()
    {
        System.out.println("3 BHK");
    }
}