package ex_01_Java_Basics;

public class Lab022_NumericS_Data_Types {
    public static void main(String[] args) {
        byte b=10;
        short s=10;
        int i=10;
        char c='A';
        char c1='@';
        char c2='_';

        //int phone=9876543210; //this is not allowed as range exceeded

        //long phone=987654321;
        // this is also not allowed as we need to append l at the last of the number for a long value

        long phone = 9876543210l;

        long phone_1= 9876543210L;

        float f = 3.14f;
        float f1 = 3.14F;

        double d = 3.12345678987;

        //only long and float need to append with l and f
        //this is java language rule for the data types
    }
}
