package lab2;

import java.util.Scanner;

public class basicJava2 {

    public static void main(String[] args) {
       //input
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your name:");
//        String  name = sc.nextLine();
//        System.out.println("your name is "+name);
//
//        System.out.print("Enter your email:");
//        String  email= sc.nextLine();
//        System.out.println("your email is "+email);
//
//        System.out.print("Enter your age:");
//        String  age= sc.nextLine();
//        System.out.println("your age is "+age);

        //input integer and  floating
        System.out.print("Enter an number:");
        int num =sc.nextInt();
        System.out.println("your entered number: "+num);

        System.out.print("Enter a real number:");
        double d =sc.nextDouble();
        System.out.println(d);
    }
}//class
