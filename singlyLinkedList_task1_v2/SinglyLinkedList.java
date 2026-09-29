package singlyLinkedList_task1_v2;

class SinglyLinkedList {

    // Inner Class untuk Node (berada di dalam SinglyLinkedList)
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Hanya menggunakan head
    Node head = null;

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Karena tidak ada tail, harus berjalan dari depan ke ujung
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) return; 
        
        // Jika hanya tersisa 1 elemen
        if (head.next == null) { 
            head = null;
            return;
        }
        
        // Mencari elemen sebelum yang terakhir
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null; 
    }

    public boolean search(int target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next; 
        }
        return false; 
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}