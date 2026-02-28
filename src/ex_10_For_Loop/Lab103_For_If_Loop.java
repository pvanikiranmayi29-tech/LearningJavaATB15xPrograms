package ex_10_For_Loop;

public class Lab103_For_If_Loop {
    public static void main(String[] args) {
        for (int tejas = 0; tejas < 18; tejas++) {
            if(tejas > 15)
            {
                System.out.println("Gift from papa, Iphone 99"); //this statement is executed two times for tejas=16 & 17
            }
            else
            {
                System.out.println("No Gift, you are a KID"); // this statement is executed 16 times from 0-15
            }
        }
    }
}
