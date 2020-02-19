package lab8;

public class PersonApp {
    public static void main(String[] args) {
        Student std1 = new Student("361211760034",
                "Kanreuthai Srichai",
                "STD001",
                "Information Technology");
        Person p1 =new Person("361211760033",
                "Kanreuthai Srichai");

        System.out.println(std1.getName());
        System.out.println(p1.getName());

        System.out.println(std1.toString());
        System.out.println(p1.toString());



    }
}
