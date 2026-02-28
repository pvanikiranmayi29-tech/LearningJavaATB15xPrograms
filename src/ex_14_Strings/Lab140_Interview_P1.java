package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1="Hello";
        String s4="Hello";
        String s10="Hello"; //for all three s1, s4, s10 - only one object is created in SCP and all values refer the same
        String s11="hello"; //for this new will be created

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("Hello"); //here in this case for each new s2,s3,s5 - new objects will be created in OA

        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);//all these conditions will give ans false

        System.out.println(s1==s4); //this is true - as they point to same value
        //here == will not check for value - it checks for location
        // to verify the value is same we need to use

        System.out.println(s1.equals(s2)); //this is true

        System.out.println(s11.equalsIgnoreCase(s2)); //hello and Hello are equal when we use equal ignore case

    }


}
