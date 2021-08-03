public class animals {
    String specie;
    int age;
    String gender;


    public animals(String specie, int age, String gender) {
        this.specie = specie;
        this.age = age;
        this.gender = gender;

    }

    public void infoAnimal(){
        System.out.println("His specie is "+ specie);
        System.out.println("His age is "+ age + " years old");
        System.out.println("and his gender is "+ gender);
    }

    public void hunt(){
        System.out.println("hunting");
    }

    public void sleep(){
        System.out.println("sleeping");
    }
    public void eat(){
        System.out.println("eating");
    }

}
