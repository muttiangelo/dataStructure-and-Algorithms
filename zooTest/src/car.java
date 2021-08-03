public class car {
    int hp;

    public car(int hp){
        car myCar = new car(hp);
        myCar.hp = 120;
    }

    public static void main(String args[]){
        car myCar2 = new car(124);
    }
}

