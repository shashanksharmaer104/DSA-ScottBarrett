package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);

        myLinkedList.append(3);
        myLinkedList.append(5);
        myLinkedList.append(6);

        myLinkedList.printList();

        /*System.out.println("Removing the values");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());*/

        /*System.out.println("Prepend the node");
        myLinkedList.prepend(2);
        myLinkedList.prepend(1);
        myLinkedList.printList();*/

        /*System.out.println("Removing first value");
        System.out.println("Removed item: " + myLinkedList.removeFirst().value);
        myLinkedList.printList();
        myLinkedList.getLength();*/

        /*System.out.println("Print value using index");
        System.out.println("Value: " + myLinkedList.get(3).value);*/

        System.out.println("Set a value in the list");
        myLinkedList.set(2, 4);
        myLinkedList.set(3, 5);
        myLinkedList.set(-3, 10);

        myLinkedList.printList();

    }
}
