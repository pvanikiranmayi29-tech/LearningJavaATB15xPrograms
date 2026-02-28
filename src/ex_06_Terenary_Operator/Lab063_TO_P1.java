package ex_06_Terenary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {
        int number = -5;
        String result = number>0? "+ve" : "-ve";
        //this is like a simple if-else loop in a single line
        System.out.println(result);
    }
}
