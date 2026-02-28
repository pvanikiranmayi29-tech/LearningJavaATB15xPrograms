package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name="Vani"; //this creates a object in String Constant Pool

        //Strings are immutable in nature
        name.toUpperCase(); //here we created a new String with VANI in SCP
        //but this is not assigned to a variable or re-assigned to name
        System.out.println(name);// so o/p will be Vani - camelcase as created

        name = name.toUpperCase();
        System.out.println(name); //now for this o/p will be VANI

        String s2 = new String("Vani"); //this is creating a string in Object Area and not in SCP
    }
}
