package adt;

public class Counter {
    String name =  null;
    int counterValue = 0;


    public Counter(String str) {
        this.name =str;
    }

    public void increment(){
    counterValue++;
    }

    public int getCurrentValue(){
        return counterValue;
    }

    public String ToString(){
        return name;
    }



}
