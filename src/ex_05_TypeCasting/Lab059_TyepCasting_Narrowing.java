package ex_05_TypeCasting;

public class Lab059_TyepCasting_Narrowing {
    public static void main(String[] args) {
        int val=300;

        //byte b = val; //implicit narrowing
        //when narrowing implicit will not work and not allowed
        //00000000 00000000 00000001 00101100
        byte b2 = (byte) val; //explicit narrowing - this is allowed
        //here user says that - there will be overflow and i am fine
        System.out.println(b2);
        //interview question
        //here mostly we will ans like 128 - as byte max value is 128
        //but here JVM will convert the bits and then will take the max number bits
        //00101100
        //0×128 + 0×64 + 1×32 + 0×16 + 1×8 + 1×4 + 0×2 + 0×1
        // = 32 + 8 + 4
        // = 44
    }
}
