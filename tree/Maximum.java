package tree;

public class Maximum {

    public static void main(String[] args) {
        Node node20 = new Node(20);
        Node node80 = new Node(80);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(100);


        node20.left = node30;
        node20.right = node80;

        node30.left= node40;
        node30.right = node50;

        System.out.println(max(node20));

    }

    private static int max(Node node){
        if(node  == null ){
            return -1;
        }
        return Math.max(node.data, Math.max(max(node.left), max(node.right)));
    }
}
