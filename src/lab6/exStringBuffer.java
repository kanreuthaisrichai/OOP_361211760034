package lab6;

import java.util.StringTokenizer;

public class exStringBuffer {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println(strBuf);

        strBuf.append("Saiyai");
        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.delete(0,6);
        System.out.println(strBuf);

        // StringTokenizer

        String s = " guide leads Chinese tourists at the Ananta Samakhom Throne Hall in Bangkok.\n" +
                "The government will make road signs in Chinese to reduce accidents. ";
        StringTokenizer tokenizer = new StringTokenizer(s);
        int countWord = tokenizer.countTokens();
        System.out.println("Word count from message:"+countWord);

        //word cutting
        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }


    }//main
}//class
