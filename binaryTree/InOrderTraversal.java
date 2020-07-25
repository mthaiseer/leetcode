package binaryTree;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> cache = new ArrayList<>();
        inorderTraversal(root, cache);
        return cache;

    }

    void  inorderTraversal(TreeNode node, List<Integer> cache) {


        if(node == null){
            return;
        }
        inorderTraversal(node.left, cache);
        if(node != null){
            cache.add(node.val);
        }

        inorderTraversal(node.right, cache);



    }


}
