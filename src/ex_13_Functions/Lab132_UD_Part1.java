package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {

        //1.without parameter and without return type
        wop_wor_greet();

        //2. without parameter and with return type
        String msg = wop_wr_greet();

        //3. with parameter and without return type //most commonly used

        greet_with_details("Vani",65,100);

        //4.with parameter and with return type
        int sum=sum_of_two_numbers(3,4);
        System.out.println(sum);

    }

    static int sum_of_two_numbers(int i, int i1) {
        return i+i1;

    }

    static void greet_with_details(String Vani, int i, int i1) {
    }

    static String wop_wr_greet() {
        //as this is a String mentioned in method we need to have a return type
        return null;

    }

    static void wop_wor_greet() {
    }
}
