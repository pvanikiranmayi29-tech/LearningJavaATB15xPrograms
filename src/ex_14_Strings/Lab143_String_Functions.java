package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String name = "Vani";

        System.out.println(name.length());
        System.out.println(name.charAt(3));

        System.out.println(name.concat("Pulugurtha"));

        System.out.println(name.contains("an"));

        System.out.println(name.equals("Vani"));

        System.out.println(name.equalsIgnoreCase("vani"));

        System.out.println(name.indexOf('n')); //o/p is 2

        String s1 = "madam";
        //Returns the first index within the string
        //first occurrence of the specified substring
        System.out.println(s1.indexOf("m")); //o/p - 0

        System.out.println(name.length());

        System.out.println(name.replace('n','N'));

        System.out.println(name.substring(0,3)); //o/p is "Van" starting from 0 to 3

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.endsWith("i")); //true

        String n3= "     Vani Shravan      ";

        System.out.println(n3.trim()); //all spaces are removed

        System.out.println(name.compareTo("Vani"));

        //-----------------------------------------

        StringBuilder stringBuilder=new StringBuilder("Vani");

        System.out.println(stringBuilder);

        stringBuilder.reverse(); //here no need to assign - it will auto assign
        System.out.println(stringBuilder); //o/p will be inaV

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        //String builder and String buffer is having a default function of reverse
        //string buffer is thread safe
        //String builder is not thread safe
        //these are mutable in nature unlike Strings


    }
}
