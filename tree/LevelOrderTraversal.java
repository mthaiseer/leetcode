package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

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

        levelOrder(node10);

    }


    static void levelOrder(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

    }
}
