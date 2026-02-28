package ex_06_Terenary_Operator;

public class Task {
    public static void main(String[] args) {
        //Write a statement that returns
        //int marke=100;
        //"PASS" if marks>=40
        //"Fail" Otherwise

        int marks = 75;

        String result = (marks>=40) ? "Pass" : "Fail";

        System.out.println(result);

        //self ex for nested ternary

        String result1 = (marks>=40) ? (marks>70 ? "Passed with Distinction" : "Pass") : "Fail";
        System.out.println(result1);
    }
}
