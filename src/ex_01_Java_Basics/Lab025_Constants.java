package ex_01_Java_Basics;

public class Lab025_Constants {
    public static void main(String[] args) {
        int a = 10; //this is not a constant - the value can be changed later on

        a = 20;

        System.out.println(a);

        final float PI=3.14f;
        //PI=3.15533f; // once final keywork is added for any value - it is a constant and cannot be changed

        System.out.println(PI);
    }
}
