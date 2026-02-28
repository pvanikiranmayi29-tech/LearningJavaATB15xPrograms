package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab191_Interface_Variables {

}

interface Pramod{
    final int a = 10;
    String notes = "JAVA";
    void display();
}
class Dutta implements Pramod{

    int aa = 10;

    //when a class implements a interface with incomplete methods
    //we need to override and complete the methods to implement the interface
    @Override
    public void display() {
        //System.out.println(super.a); //we will not be able to access the variables
        //they are final
        //super is used when the class is a parent
        //in case of interface we can use directly

        System.out.println(a);
        System.out.println(this.aa);
    }
}

class Sowmya implements Pramod
{

    @Override
    public void display() {
        System.out.println(notes);
    }
}