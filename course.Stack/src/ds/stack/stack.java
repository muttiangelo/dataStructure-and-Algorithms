package ds.stack;

public class stack {

    private int maxSize;
    private long[] stackArray;
    private int top;


    public stack(int size){
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j){
        top++;
        stackArray[top] = j;
    }

    public long pop(){
        int oldTop = top;
        top--;
        return stackArray[oldTop];
    }


}
