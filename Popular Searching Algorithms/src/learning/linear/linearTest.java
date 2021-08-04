package learning.linear;

public class linearTest {
    public static void main(String[] args){
        System.out.println(linearSearch1(new int[] {1,4,5,2,8,9,16}, 9));
    }

    public static int linearSearch1(int[] a, int x){

        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                return i;
            }

        }
        return -1;
    }
}
