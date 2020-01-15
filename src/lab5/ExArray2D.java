package lab5;

import java.util.Scanner;

public class ExArray2D {
    //Array 2D
    public static void main(String[] args) {
       int x[] [] = new int[2][3];//2*3 = 6
       x[0][0]= 10;
       // input data to Array 2D

        x = inputDataArray(x);
        //display data in array
        ShowDataArray(x);
    }//main

    public static void ShowDataArray(int[][]x) {
        System.out.println("Data in array:");
        int total =0;

        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]+"");
                total += x[i][j] ;

            }//i
             System.out.println();
        }//j
        //show total and average
        System.out.println("Total value:"+total);
        System.out.println("Average value:"+(total/6));

    }



    public static int[][] inputDataArray(int[][] x) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please ,enter integer to array below:");
        for (int i = 0; i <x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
               System.out.print("Input:");
               x[i][j] =sc.nextInt();
            }//i

        }//j
        return x;
    }





}//class
