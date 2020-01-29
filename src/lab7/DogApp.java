package lab7;

public class DogApp {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Dang");
        dog1.setAge(3);
        dog1.setHairColor("Brown");

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());
        System.out.println(dog1.getHairColor());


        Dog dog2 = new Dog("Dum",10,"Black");
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
        System.out.println(dog2.getHairColor());

    }//main
}//class
