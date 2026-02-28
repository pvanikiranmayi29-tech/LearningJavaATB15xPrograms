package ex_04_Operators;

public class Lab038_Unary_Operators {
    public static void main(String[] args) {
        //unary operator
        //appliced to only one operand
        //+ need not to be given specifically - it is by default taken as + for jvm and intellij
        //- we need to specify
        int a = +10;
        int a1 = -110;

        int result = a+a1;
        System.out.println(result);

        int b=-1;

        b=b+1;

        System.out.println(b);
    }
}
