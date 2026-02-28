package ex_14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1="Hello";

        s1= s1.concat("World");
        System.out.println(s1); //o/p will be "HelloWorld"
    }
}
