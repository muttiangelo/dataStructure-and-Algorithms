package algo.recursion.recursiveLinearSearch;

public class app {
    public static void main(String[] args) {
        System.out.println(recursiveLinearSearch(new int[] {1, 2, 3, 4, 5}, 5, 0));
    }

    public static int recursiveLinearSearch(int[] A, int x, int i) {
        int n = A.length;
                if (i > n) {
                    return -1;
                }
                else if (A[i] == x){
                    return i;
                }
                else
                    System.out.println("index at: " + i);
                    return recursiveLinearSearch(A, x , i+1);
                    }
                }




//        if( i > A.length - 1){//if this evaluates true, it means that x was not found in the array
//            return -1;
//        }
//        else if(A[i] == x){
//            return i;
//        }
//        else
//            return recursiveLinearSearch(A, i+1, x);
//            }
//        }






