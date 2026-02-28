package ex_06_Terenary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        //The conditional operator, commonly konwn as Tenerany
        //syntax result = condition ? exp1 : exp2
        //condition - this is a boolean exp that is evaluated
        //exp1 - this exp is executed in case of condition true
        //exp2 - this exp is executed in case of condition false
        int age = 19;

        String canGotoGoa = age > 18 ? "Yes" : "No";

        System.out.println(canGotoGoa); //o/p will be yes
    }
}
