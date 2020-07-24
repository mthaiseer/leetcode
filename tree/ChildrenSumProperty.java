package tree;

/**
 * Sum of child node should be equals to parent node
 */
public class ChildrenSumProperty {

    public static void main(String[] args) {
        Node node20 = new Node(20);
        Node node8 = new Node(8);
        Node node12 = new Node(12);
        Node node2 = new Node(2);
        Node node10 = new Node(10);

        node20.left = node8;
        node20.right = node12;

        node12.left = node2;
        node12.right = node10;

        System.out.println(isSumProperty(node20));

    }

    static boolean isSumProperty(Node node){
        if(node == null){
            return true;
        }

        if(node.left == null && node.right == null){
            return true;
        }

        int sum = 0;
        if(node.left!= null){
            sum+=node.left.data;
        }

        if(node.right!= null){
            sum+=node.right.data;
        }

        return node.data == sum && isSumProperty(node.left)&& isSumProperty(node.right);
    }
}
