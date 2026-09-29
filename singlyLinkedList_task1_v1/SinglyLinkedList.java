package singlyLinkedList_task1_v1;

public class SinglyLinkedList {
    NodeNode head = null;
    NodeNode tail = null;

    public void insertLast(int data){
        NodeNode newNode = new NodeNode(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.nextNodeNode = newNode;
            tail = newNode;
        }
    }

    public void insertFirst(int data){
        NodeNode newNode = new NodeNode(data);
        if (head==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.nextNodeNode = head;
            head = newNode;
        }
    }

    public void deleteFirst(){
        if (head == null) return;

        if (head == tail){
            head = null;
            tail = null;
        }else {
            head = head.nextNodeNode;
        }
    }

    public void deleteLast(){
        if (head == null) return; 

        if (head == tail) { 
            head = null;
            tail = null;
            return;
        }
        
    NodeNode current = head;
        while (current.nextNodeNode != tail) {
            current = current.nextNodeNode;
        }
        current.nextNodeNode = null; 
        tail = current;  
    }

    public boolean search(int target) {
        NodeNode current = head;
        while (current != null) {
            if (current.data == target) {
                return true; // Data ditemukan
            }
            current = current.nextNodeNode; // Pindah ke node berikutnya
        }
        return false; // Data tidak ditemukan
    }

    //Traversal, menelusuri dan mencetak seluruh data
    public void display() {
        NodeNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.nextNodeNode;
        }
        System.out.println("null");
    }
    
    
}
