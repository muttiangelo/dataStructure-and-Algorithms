package estudaPorra;

public class For1 {
    public static void main(String[] args) {
        System.out.println("The interest rate is " + calculateInterest(100000, 2.0));

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static double calculateInterest(double amount, double InterestRate) {
        return (amount * (InterestRate / 100));


    }

    public int[] reverseArray(int[] a){
        int length = a.length;
        int[] newArray = new int[a.length];

        int newArrayIndex = 0;

        for(int i = a.length -1; i >=0; i--){
            newArray[newArrayIndex] = a[i];
            newArrayIndex++;
        }
        return newArray;
    }
}
