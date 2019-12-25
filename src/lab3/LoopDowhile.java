package lab3;

import java.util.Scanner;

public class LoopDowhile {
    public static void main(String[] args) {
        //do-while -> ทำงานเช่นเดียวกับ while แต่จะทำคำสั่งในลูปก่อนb 1ครั้งเสมอจึงทดสอบเงื่อนไข
        //ดังนั้นจะหมาายความว่า ไม่ว่าเงื่อนไขเปงจิงรึเท็จ
        //do{
        //คำสั่งเงื่อนไขเป็นจริง;
        //}while(เงื่อนไข);
        Scanner sc =new Scanner(System.in);
        int x= 1 ;
        do {
            System.out.print("enter an number:");
            x= sc.nextInt();
        }while (x !=0);
        System.out.println("Good bye.");
    }
}
