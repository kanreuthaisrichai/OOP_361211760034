package lab6;

public class exString {
    public static void main(String[] args) {
        String msg = "Hello, Saiyai !!!";

        int len =msg.length();//length()
        System.out.println(len);

        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.charAt(5));


        String msg2 = "RUTS";
        String msgCon = msg + msg2 ;
        System.out.println(msgCon);
        String msgCon2 = msg.concat(msg2);
        System.out.println(msgCon2);

        String m1 = "Saiyai RUTS" ;
        String m2 = "Saiyai" ;
        if (m1==m2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        System.out.println(m1==m2?"Yes":"No");

        //2.equais()
        System.out.println(m1.equals(m2)?"Yes":"No");
        if (m1.equals(m2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        int x = m1.compareTo(m2);
        System.out.println(x);


    }
}
