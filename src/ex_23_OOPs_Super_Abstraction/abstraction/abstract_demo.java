package ex_23_OOPs_Super_Abstraction.abstraction;

public class abstract_demo {
        public static void main(String[] args) {
            //when we look at just the main method
            //we will not know that there is a incomplete loan with father
            //and son completed the loan
            //this is called hiding the essential methods - abstraction
            Son s1 = new Son();
            s1.loan10K();
            s1.loan50k();
        }
}

abstract class Father{
    //abstract is incomplete
    abstract void loan50k();

    //concrete - complete method
    void loan10K(){
        System.out.println("Given!");
    }
}

class Son extends Father{
    @Override
    void loan50k() {
        System.out.println("Given by Son");
    }
}
