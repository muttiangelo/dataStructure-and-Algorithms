package binarySearchVideo;

public class app {
    public static void main(String[] args){
        System.out.println(binarySearch(new int[] {1, 2, 3, 4, 5, 8, 9, 10, 20 , 30}, 9));
    }

    public static int binarySearch(int[] a, int x){
        int i = 0;
        int r = a.length - 1;

        while(i <= r) {
            int m = (i + r)/2;

            if (a[m] < x) {
                i = m + 1;
            } else if (a[m] > x) {
                r = m - 1;
            } else
                return m;
        }
        return -1;
    }
}
