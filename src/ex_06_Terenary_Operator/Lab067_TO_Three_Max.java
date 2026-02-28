package ex_06_Terenary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {
        //using CLI input
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        //find max of three numbers using ternary operator

        int max = (n1 > n2) ? ((n1 > n3) ? n1 :n3) : ((n2 > n3) ? n2 : n3);
        System.out.println(max);
    }
}
