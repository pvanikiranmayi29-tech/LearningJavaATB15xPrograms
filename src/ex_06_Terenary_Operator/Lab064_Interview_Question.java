package ex_06_Terenary_Operator;

public class Lab064_Interview_Question {
    public static void main(String[] args) {
        //interview question will be more on nested ternary
        //syntax - result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //nested ternary is where the expression2 is again a ternary operator again or another ternary sequence

        int amol_age = 21;

        String result = amol_age>18 ? (amol_age>25 ? "Yes you can go to GOA and drink" : "You can go to GOA but can't drink") : "You can't go to GOA" ;

        System.out.println(result);
    }
}
