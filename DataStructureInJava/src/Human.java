public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;


    public Human(String name, int age, int heightInInches, String eyeColor) {
        super();
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I have " + heightInInches + " inches");
        System.out.println("and my eyes are " + eyeColor);
    }

    public void work(){
        System.out.println("Working...");
    }
    public void sleep(){
        System.out.println("sleeping...");
    }


}
