package ex_06_Terenary_Operator;

public class Lab065_To_Interview_Max_Two_To {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int max = (x > y) ? x : y;
        int min = (x > y) ? y : x;
        System.out.println(max);
        System.out.println(min);
    }
}
