package ex_24_Static;

public class Lab194_Static_SIB {
    public static void main(String[] args) {
        A a = new A();
        //the moment the class is initialized the static block will be automatically executed
    }

}

class A{
    //this is a static block
    //static initialization block - SIB
    static {
        System.out.println("Called only once when a class is loaded");
        System.out.println("You can write code, loading a excel, file, database, ...");
    }
    { //IIB - Instance Initialization Block
        System.out.println("IIB");
    }

    static int a = 10;

    static void m1()
    {
        System.out.println("Static Function");
    }
}