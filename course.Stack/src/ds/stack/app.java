package ds.stack;

public class app {

    public static void main(String[] args){
        node nodeA = new node();
        nodeA.data = 4;

        node nodeB = new node();
        nodeB.data = 8;

        node nodeC = new node();
        nodeC.data = 7;

        node nodeD = new node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(nodeLength(nodeA));
        System.out.println(nodeLength(nodeB));
    }

    public  static int nodeLength(node aNode) {
        int length = 0;
        node currentNode = aNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;

        }
        return length;

        }


   
}
