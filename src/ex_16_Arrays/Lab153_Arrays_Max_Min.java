package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        Arrays.sort(array);
        System.out.println(array[array.length-1]); //easy way to print using in-build function

        int max = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
