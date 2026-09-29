package singlyLinkedList_task1;

public class MainLinkedList {
    public static void main (String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        System.out.println("1. Insertion");
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        System.out.print("Hasil insertLast (10, 20, 30) : ");
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.insertFirst(5);
        System.out.print("Hasil insertFirst (5)          : ");
        list.display(); // Output: 5 -> 10 -> 20 -> 30 -> null

        System.out.println("\n2. Deletion");
        list.deleteFirst();
        System.out.print("Hasil deleteFirst               : ");
        list.display(); // Output: 10 -> 20 -> 30 -> null

        list.deleteLast();
        System.out.print("Hasil deleteLast                : ");
        list.display(); // Output: 10 -> 20 -> null

        System.out.println("\n3. Search");
        System.out.println("Apakah angka 20 ada? " + list.search(20)); // true
        System.out.println("Apakah angka 99 ada? " + list.search(99)); // false
    }
}

