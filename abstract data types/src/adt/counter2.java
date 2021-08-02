package adt;

public class counter2 {

    public static void main(String args[]) {
        Counter myCounter = new Counter("My Counter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());


    }


}
