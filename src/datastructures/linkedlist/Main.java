package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(6);
        //myLinkedList.append(8);

        myLinkedList.printList();

        /*System.out.println("Removing the values");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());*/

        System.out.println("Prepend the node");
        myLinkedList.prepend(2);
        myLinkedList.prepend(1);
        myLinkedList.printList();

    }
}
