package ex_04_Operators;

public class Lab044_BODMAS {
    public static void main(String[] args) {
        //BODMAS - Bracket, order(power/root), Div, mul, add, sub
        //but mul and div has same precedence
        //when both appear together (without brackets), most programming lang evaluates them from left to right
        System.out.println((9*3/9+1)*3);

        //BODMAS
        // first bracket 9*3/9+1
        //9*3 =27
        //27/9=3
        //3+1=4
        //4*3=12

        System.out.println(((2*3)/(2+1))*3);
        //2*3=6
        //2+1=3
        //6/3=2
        //2*3=6

        System.out.println((2*3/(2+1))*3);
        //2+1=3
        //2*3=6
        //6/3=2
        //2*3=6
    }
}
