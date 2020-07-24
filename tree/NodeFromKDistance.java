package tree;

public class NodeFromKDistance {

    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node70 = new Node(70);
        Node node80 = new Node(80);

        node10.left = node20;
        node10.right = node30;

        node20.left= node40;
        node20.right = node50;

        node30.right = node70;
        node70.right = node80;


        printKDistance(node10, 2);

    }

    static void printKDistance(Node node, int k){

        if(node == null) return;

        if(k == 0){
            System.out.println(node.data);
        }

        printKDistance(node.left, k-1);
        printKDistance(node.right, k-1);


    }



}
