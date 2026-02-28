package ex_06_Terenary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        int num = 15;
        String result = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
