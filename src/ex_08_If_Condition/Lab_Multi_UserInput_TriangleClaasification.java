package ex_08_If_Condition;

import java.util.Scanner;

/*Write a program that classifies a triangle based on its side lengths. Given
three input values representing the lengths of the sides, determine if the triangle is
equilateral(all sides are equal), Isosceles (exactly two sides are equal), or
scaleno(no sides are equal)*/

public class Lab_Multi_UserInput_TriangleClaasification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Side1");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Side2");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Side3");
        int side3 = scanner.nextInt();

        if(side1 == side2 && side1 ==side3)
        {
            System.out.println("equilateral triangle");
        }
        else if(side1 == side2 || side2==side3 ||side3==side1)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("scaleno triangle");
        }
    }
}
