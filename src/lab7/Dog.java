package lab7;

public class Dog {
    //Attributes
    private String name;
    private int age;
    private String hairColor;

    public Dog(){}
    public Dog (String name ,int age,String hairColor){
       this .name = name;
       this.age = age;
       this.hairColor = hairColor;
    }


    //Behavior
    public void barking(){
     System.out.println("Dog barking");
    }
    public void sleeping(){
        System.out.println("Dog sleeping");
    }
    public void eating(){
        System.out.println("Dog eating");
    }

    //getter and setter methods
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name ;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age= age ;
    }

    public String getHairColor(){
        return this.hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor ;
    }
}//class

