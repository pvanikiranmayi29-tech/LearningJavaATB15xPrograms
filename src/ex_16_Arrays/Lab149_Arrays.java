package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {
        int a = 10;

        int marks[] = {91,90,51,100,91,92,89};
        int[] marks1 = {91,90,51,100,91,92,89}; // both are same and valid syntax

        boolean[] is_married_people = {true, true, false};
        String[] names = {"Vani", "Kiran", "Mayi"};
        //String[] names1 = {"Vani", "Kiran", "Mayi", 34}; we cannot use different data types in one array

        float[] values = new float[3];
        values[0]=3.14f;
        values[1]=4.14f;
        values[2]=5.14f;

        for(String item:names)
        {
            System.out.println(item);
        }
    }
}
