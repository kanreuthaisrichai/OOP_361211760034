package lab3;

import java.util.Scanner;

public class Control3 {
    public static void main(String[] args) {
        //if -else -> เป็นคำสั่งที่มีการทดสอบหลายเงื่อนไข เงื่อนไขใดเป็นจริงจะทำอย่างมีคำสั่งนั้นคำสั่งเดียว
        //ในกรณีมีเงื่อนไขทั้งหมดเป็นเท็จ if -else-if
        //


        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you?:");
        int age = sc.nextInt();
        //test condition
         if (age<20) {
             System.out.println("you are young.");
         }else  if (age<=60) {
             System.out.println("you are teenager.");
         }else {
             System.out.println("you are old.");
         }





        








    }
}
