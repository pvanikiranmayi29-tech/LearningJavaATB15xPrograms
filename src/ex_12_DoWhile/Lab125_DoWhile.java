package ex_12_DoWhile;

public class Lab125_DoWhile {
    public static void main(String[] args) {
        int a=1;
        do {
            System.out.println("Start the program");
            a++;
        }
        while (a<10); //till a=1 to 9 - the o/p is printed
    }
    //While and doWhile difference is doWhile is executed at-least once - even when the condition is not met
    //as for doWhile the condition is executed after the loop
}
