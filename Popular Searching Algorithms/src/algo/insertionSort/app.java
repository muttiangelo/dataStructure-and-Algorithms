package algo.insertionSort;

public class app {

    public static void main(String[] args){
        System.out.println(insertionSort(new int[] {8, 3, 7, 2, 7, 19, 1}));
    }

    public static int[] insertionSort(int[] a){
        for(int i = 1; i < a.length; i++){
            int element = a[i];
            int j = i-1; // index position of the last value in the sorted area

            while( j >= 0 && a[i] > element){
             a[j] = a[j +1];
             j--;
            }
            element = a[j+1];
        }
        return a;
    }

}
