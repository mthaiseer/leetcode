package tree;

public class PrintLeftViewRecursive {

    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);

        node10.left = node20;
        node10.right = node30;
        node30.left = node40;
        node30.right = node50;

        printLeftView(node10,1 );

    }

    static int maxlevel = 0;
    private static void printLeftView(Node node, int level) {

        if( node == null) return;
        if(maxlevel < level){
            System.out.println(node.data +" ");
            maxlevel = level;
        }

        printLeftView(node.left, level+1);
        printLeftView(node.right, level+1);

    }


}
