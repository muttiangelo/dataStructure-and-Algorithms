package adt;

public class solution1 {
    static int[] reverseArray(int[] a) {
        int length = a.length;
        int[] newArray = new int[a.length];

        int newArrayIndice = 0;

        for(int i = a.length -1; i>=0; i--){
            newArray[newArrayIndice] = a[i];
            newArrayIndice++;
        }
        return newArray;

    }
}


