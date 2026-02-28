package ex_17_OOPs;

public class Lab159_OOps {
    public static void main(String[] args) {

        //we can call the other class in this class
        //when it is available in same package
        //without import

        //Person p1; //this is a object reference //this will point to null area

        //obj will be used only when we use new keyword
        Person p1 = new Person();
        p1.name = "Vani";

        Person p2 = new Person();
        p2.name = "Shravan";
        //p2.name = "Vani"; //in this case also p1 and p2 are different - two persons can have same name

        new Person(); //this is also object - but without any reference
        //that is nobody can call or use this object
    }
}
