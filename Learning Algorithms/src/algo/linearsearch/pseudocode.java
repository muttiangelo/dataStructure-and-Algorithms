package algo.linearsearch;

public class pseudocode {

    int[] array1 = new int[10];




    public static int linearSearch(int[] a, int x){
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args){

    }
}
