package CicrularLinkedList;

public class CircularLinkedList {
     private node First;
     private node Last;


     public CircularLinkedList(){
         First = null;
         Last = null;
     }

     public void insertFirst(int data){
        node Node1 = new node();
        Node1.data = data;


        if(isEmpty()){
            Last = Node1;

        }

        Node1.next = First;// new node -> old first
        First = Node1;

     }
}
