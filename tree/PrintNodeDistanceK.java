package tree;

public class PrintNodeDistanceK {


    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node60 = new Node(60);

        node10.left = node20;
        node10.right = node30;

        node20.left = node40;
        node20.right = node50;

        node40.left = node60;

        nodeAtK(node10, 2);

    }

    static void nodeAtK(Node node, int k){
        if(node  == null){
            return;
        }

        if(k ==0 ){
            System.out.println(node);
        }

        nodeAtK(node.left, k-1);
        nodeAtK(node.right, k-1);
    }
}
