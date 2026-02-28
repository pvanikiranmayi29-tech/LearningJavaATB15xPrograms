package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name="Vani";
        String last_name="Pulugurtha";

        int a = 10;
        int b = 10;

        //here the + is treated as arithimatic operator and gives ans as 20
        System.out.println(a+b);

        //here the + is used for concatenation and it combines both the string values and print together "VaniPulugurtha"
        System.out.println(first_name+last_name);

        //interview question
        //the execution of this statement will be from left to right
        //so since the first plus is concat it will concat the numbers also
        //so o/p will be "VaniPulugurtha1010"
        System.out.println(first_name+last_name+a+b);

        //in this case first plus is arithimetic operation
        //so o/p will be 20VaniPulugurtha
        System.out.println(a+b+first_name+last_name);

        //another type
        //the operations will be performed according to BODMAS
        //BODMAS - Bracket, order(power/root), Div, mul, add, sub
        //since bracket is executed first - first a is added to b and then rest operation is made
        //so o/p is VaniPulugurtha20
        System.out.println(first_name+last_name+(a+b));
    }
}
