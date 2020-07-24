package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewIterative {


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

        printLeftView(node10 );

    }

    private static void printLeftView(Node node){

        if( node == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            for(int i=0; i< queueSize; i++){

                Node currentNode = queue.poll();
                if(i ==0){
                    System.out.println(currentNode.data + " ");
                }

                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }

                if(currentNode.right!= null){
                    queue.add((currentNode.right));
                }

            }
        }




    }

}
