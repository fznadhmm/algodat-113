package ALGODAT.tryLinkedList_meet5;

public class LinkedList {
    Node head = null;
    Node tail = null;

    void insertNode(Node newNode){
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.nextNode = newNode;
            tail = newNode;
        }
    }

    public Node getHead(){
        return head;
    }
}
