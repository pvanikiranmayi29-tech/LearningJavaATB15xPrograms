package tasks;

public class Task2_16Jan26 {
    public static void main(String[] args) {
        int[] array={12, 34, 10, 1, 100, 3, 4, 32};

        int max=array[0];

        int max2=array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("First Highest number is: "+max);

        for (int i = 0; i < array.length; i++) {
            if(array[i]>max2 && array[i]!=max)
            {
                max2=array[i];
            }
        }
        System.out.println("Second Highest number is: "+max2);
    }
}
