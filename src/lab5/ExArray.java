package lab5;

public class ExArray {

    public static void main(String[] args) {
    int x [] = new  int[5];
        System.out.println(x[0]);
        x[3] =100;
        x[1] = x[0] + x[3];
        x[4]= x[1] *3;
        x[0]=x[3]+x[2];
        x[2]=x[0]-x[4];

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        //error
        //System.out.println(x[-1]);//indexOutBound


    }//main
}//class
