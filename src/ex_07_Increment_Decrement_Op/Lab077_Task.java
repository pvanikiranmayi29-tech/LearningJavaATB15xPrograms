package ex_07_Increment_Decrement_Op;

public class Lab077_Task {
    public static void main(String[] args) {
        int a = 10;

        a = a++ + a++ + a++;
        System.out.println(a);

        //a = A+B+C
        //A = a++ - assign and increment - A=10, a=11
        //B = a++ - B=11, a=12
        //C=a++ - C=12, a=13
        //A+B+C = 10+11+12 = 33

        int a1 = 3;
        int b = a1++ * ++a1;
        System.out.println(b);

        //b=A*B
        //A = a++ - A=3, a=4
        //B = ++a - B=5,a=5
        //A*B = 3*5=15

        int a2 = 5;
        System.out.println(a2++ + a2--);

        //A+B
        //A=a++ - A=5 , a=6
        //B=a-- - B=6, a=5
        //A+B = 5+6=11
    }
}
