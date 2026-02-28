package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; //this is how a 3x3 matrix 2d array is created

        for (int i = 0; i < matrix.length; i++)  //matrix.length will give number of rows - 3 will go from 0,1,2
        {
            for (int j = 0; j < matrix[i].length; j++)  //matrix[i].length will give num of col within row - 3 cols
            {
                System.out.print(matrix[i][j] + "|");

            }
            System.out.println(""); //if this is not added all the values will be printed in one rwo
        }
    }

}
