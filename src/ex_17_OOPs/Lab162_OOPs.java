package ex_17_OOPs;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Vani");
        Baby b3 = new Baby("Vani","M");

    }
}

class Baby{
    String name;

    Baby(){
        System.out.println("DC");
    }

    Baby(String givenName){
        System.out.println("Parameterized Constructor - Name");
    }

    //this is called constructor overloading
    //where we have same constructor in 3 different ways

    Baby(String givenName, String gender){
        System.out.println("Parameterized Constructor - Name, Gender");
    }
}