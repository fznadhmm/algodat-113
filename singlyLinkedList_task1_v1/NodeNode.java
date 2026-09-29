package singlyLinkedList_task1_v1;

public class NodeNode {
    int data;
    NodeNode nextNodeNode = null;

    public NodeNode (int data){
        this.data = data;
        this.nextNodeNode = null;

    }
    
    void checkData(){
        System.out.println(data);
    }

    void setNextNode (NodeNode next){
        this.nextNodeNode = null;
    }
}
