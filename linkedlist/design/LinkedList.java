package linkedlist.design;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        }
    }

    public void insertTail(int data) {
        Node node = new Node(data);
        tail.next = node;
        tail = node;
    }

    public void insertHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public void traverse() {
        traverse(head);
    }

    public int getMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void reverse() {
        reverse(head);
    }

    private void reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
    }

    private void traverse(Node node) {
        if (node == null) {
            System.out.println();
            return;
        }
        System.out.print(" " + node.data);
        traverse(node.next);
    }
}
