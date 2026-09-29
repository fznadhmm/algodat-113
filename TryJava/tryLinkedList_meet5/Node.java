package tryLinkedList_meet5;

public class Node {

    int data;
    Node nextNode = null;

    public Node (int data){
        this.data = data;
        this.nextNode = null;

    }
    
    void checkData(){
        System.out.println(data);
    }

    void setNextNode (Node next){
        nextNode = null;
    }
}
