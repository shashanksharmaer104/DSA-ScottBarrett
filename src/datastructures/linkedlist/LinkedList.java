package datastructures.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    // Inner class - Node
    class Node {
        int value;
        Node next; // pointer. By default is null

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node nextNode = new Node(value); // create new node
        head = nextNode;
        tail = nextNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value); // create new node
        if(length == 0) { // if list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

}
