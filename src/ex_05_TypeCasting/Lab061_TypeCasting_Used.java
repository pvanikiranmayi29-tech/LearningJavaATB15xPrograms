package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

        //int total = course+GST; //narrowing - implicit // this is not allowed

        int total = course+(int) GST; //narrowing explicit //allowed
        System.out.println(total);
        //here o/p will be 118 - where we are loosing some amount the .45

        float total2 = course+GST; // widening implicit //allowed
        //and no loss of data .45
        System.out.println(total2);

        float total3 = (float) course+GST; //widening explicit // valid syntax but not required

    }
}
