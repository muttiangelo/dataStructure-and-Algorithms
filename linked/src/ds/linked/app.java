package ds.linked;

public class app {


    public static void main(String[] ags){
        singlyLinkedList myList = new singlyLinkedList();
        myList.insertFirst(10);
        myList.insertFirst(80);
        myList.insertFirst(70);
        myList.insertFirst(50);
        myList.insertFirst(20);

        myList.displayList();
    }
}
