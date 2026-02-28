package ex_26_Wrapper_Class;

public class Lab204_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a =10;
        Integer b = a;
        System.out.println(b); //b has attributes and methods
        //Boxing - Primitive data type is converted to wrapper - Automatic - done by JVM
        //similar to type casting - small to big

        Integer aa=43;
        int a1=aa; //Unboxing
        System.out.println(a1); //here aa lost the attributes and methods

        int i = Integer.parseInt("123"); //String is converted to int



    }
}
