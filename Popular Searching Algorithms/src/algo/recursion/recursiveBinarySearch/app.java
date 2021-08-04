package algo.recursion.recursiveBinarySearch;

public class app {
    public static void main(String[] args){
        System.out.println(recursiveBinarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, 0, 9, 6));

    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x){
        System.out.println("[" + p + "..." + r + "]");

        if(p>r){
            return -1;
        }
        else {
            int q = (r + p) / 2;

            if(a[q] == x){
                return q;
            }
            else if(a[q] > x){
                return recursiveBinarySearch(a, p,q-1, x);
            }
            else{
                return recursiveBinarySearch(a, q+1, r, x);
            }
        }
    }
}
