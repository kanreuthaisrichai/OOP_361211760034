package lab4;

import java.util.Scanner;

public class Method_Exercise {
    public static void main(String[] args) {
        System.out.println("Hello from Main().");
        int summation = A(10,20);
        System.out.println("the summation of x and y :"+summation);
        int summation1 = B(50,20);
        System.out.println("the summation of x and y :"+summation1);
        int summation2 = C(10,10);
        System.out.println("the summation of x and y :"+summation2);
        int summation3 = D(85,5);
        System.out.println("the summation of x and y :"+summation3);
    }//main
    public static int A(int x, int y) {
        System.out.println("Hello form A().");
        int sum = x + y ;
        return sum;
    }//A
    public static int B(int x, int y) {
        System.out.println("Hello form B().");
        int sum = x - y ;
        return sum;
    }//B
    public static int C(int x, int y) {
        System.out.println("Hello form C().");
        int sum = x * y ;
        return sum;
    }//C
    public static int D(int x, int y) {
        System.out.println("Hello form D().");
        int sum = x / y ;
        return sum;
    }//D
}//class
