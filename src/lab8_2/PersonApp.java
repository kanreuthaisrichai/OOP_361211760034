package lab8_2;

public class PersonApp {
    public static void main(String[] args) {
        //
        Person P1 = new Person("kanreuthai Srichai","1997");
        Person P2 = new Sheriff("Jan kanreuthai","1998","Thungsong");
        Person P3 = new Police("Downy","1997","Nakhorn");

        P1.introduce();
        P2.introduce();
        P3.introduce();
    }
}
