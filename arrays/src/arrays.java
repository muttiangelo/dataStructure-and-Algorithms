//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class arrays {

    public static void main(String[]args){
        int[] myArray = new int[10];


//         for(int i = 0; i<10; i++){
//              myArray[i] = i*10;
//         }

        for(int i= 0;  i < 10; i++){
            myArray[i] = i*10;
            System.out.println("element "+ i + ", value = "+  myArray[i]);
        
        }




    }
}
