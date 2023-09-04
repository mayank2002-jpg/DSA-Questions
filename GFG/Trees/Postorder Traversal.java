
//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    
    void postOrders(Node root, ArrayList<Integer>list){
         if(root==null)
       return;
       
       postOrders(root.left,list);
        postOrders(root.right,list);
       list.add(root.data);
    }
    
    ArrayList<Integer> postOrder(Node root)
    {
      ArrayList<Integer> list = new ArrayList<>();
      postOrders(root,list);
      return list;
    }
}