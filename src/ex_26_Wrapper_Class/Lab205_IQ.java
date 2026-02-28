package ex_26_Wrapper_Class;

public class Lab205_IQ {
    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;

        System.out.println(a==b); //this is true(cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println(c==d); //this will be false(non-cached)
        //integer is not cached when the value of byte is more than the expected
        //java caches integer values from -128 to 127

        System.out.println(c.equals(d));

        /*Integer num = null;
        int value = num; //NullPointerException
        System.out.println(value); //this is not possible*/
    }
}
