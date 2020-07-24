package tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {


    public static void main(String[] args) {
        Node node10 = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);
        Node node60 = new Node(60);
        Node node70 = new Node(70);

       node10.left = node20;
       node10.right = node30;
       node20.left = node40;
       node20.right=node50;
       node30.left = node60;
       node30.right = node70;

        System.out.println(maxwidth(node10));

    }

    static int maxwidth(Node node){
        int result = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty() ){
            int size =  queue.size();
            result = Math.max(result, size);
            for(int i=0; i<size; i++){
                Node current = queue.poll();
                if(current.left!= null){
                    queue.add(current.left);
                }
                if(current.right != null){
                    queue.add(current.right);
                }
            }
        }
        return  result;
    }
}
