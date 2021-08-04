package algo.linearsearch;

public class app {

        public static void main(String[] args){
            System.out.println(linearSearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
            }

            public static int linearSearch(int[] a, int x){
            int answer = -1;
            for(int i = 0; i < a.length; i++){
                if(a[i] == x){
                    return i;
                }

            }
                return -1;
            }


        }



