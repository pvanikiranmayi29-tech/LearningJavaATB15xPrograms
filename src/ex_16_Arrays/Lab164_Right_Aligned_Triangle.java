package ex_16_Arrays;

public class Lab164_Right_Aligned_Triangle {
    public static void main(String[] args) {
        int n=3;

        for (int i = 0; i < n; i++) {
            //0,1,2

            //in a 3x3 matrix
            //in this case n-i-1 in the first row it will go from 0,1
            //this loop will not go to 0row,2col
            for (int space = 0; space < n-i-1; space++) {
                System.out.print(" ");
            }
            //this for loop will go to the 0,2 and will print star
            //and in 1 row it will go from 1,1 and 1,2
            for (int star = 0; star <=i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
