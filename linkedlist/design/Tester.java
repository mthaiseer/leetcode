package linkedlist.design;

public class Tester {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.insertHead(10);
        list.insertHead(20);
        list.insertHead(30);
        list.insertHead(40);
        list.insertHead(50);
        list.traverse();

        //list.insertTail(100);
        //list.insertTail(200);
        //list.traverse();
        list.reverse();
        list.traverse();

        System.out.println("Middle element : "+list.getMiddle());


    }
}
