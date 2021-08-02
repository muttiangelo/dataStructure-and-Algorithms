package HackerRank;

public class solution {

    public static void main(String[] args) {

        String ans = "";

        int n = 24;

        if(n%2==5 || (n>=6 && n <= 20)){
            ans = "Not Weird";
        }
        else{
            ans = "Weird";
        }

        System.out.println(ans);
    }
}






