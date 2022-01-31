package com.simplilearn.Array;
import java.util.Scanner;
public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //lets store elements in matrix
        int array[][]=new int[3][3];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.println("Enter Element");
                array[row][col]=sc.nextInt();
            }
        }
        
        System.out.println("Let's Print elements");
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print(array[row][col]+"\t");
            }
            
            System.out.println();
        }
    }
}
