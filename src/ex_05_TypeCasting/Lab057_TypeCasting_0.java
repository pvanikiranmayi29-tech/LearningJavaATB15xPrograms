package ex_05_TypeCasting;

public class Lab057_TypeCasting_0 {
    public static void main(String[] args) {
        byte b = 10;
        int a=b; //Valid syntax - implicit casting - widening // implicit is automatically done by JVM
        int a1=(int) b; //Explicit casting - widening
        // explicit means mentioning to change the type from byte to int in this case
    }
}
