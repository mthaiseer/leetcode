package tree;

public class Node {

    int data;
    public  Node left;
    public Node right;

    public Node(int data){
        this.data = data;
    }

    @Override
    public String toString() {
        return " "+data;
    }
}
