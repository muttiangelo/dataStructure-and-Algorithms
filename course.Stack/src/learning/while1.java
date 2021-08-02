package learning;

public class while1 {



    public static void main(String[] args) {
        int count = 0;

        int[] asifj = new int[1];

//        while(count !=5){
//            System.out.println("Count Value is "+ count);
//            count++;
//        }

//        count = 6;
//
//        do{
//            System.out.println("Count Value is "+ count);
//            count++;
//
//            if(count >100){
//                break;
//            }
//        }while(count !=6);



        //same thing but with for:

        for(int i = 0; i<6; i++){
            System.out.println("Count Value is "+ i);
        }

    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }else{
            return false;
        }

    }


}
