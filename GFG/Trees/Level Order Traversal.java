class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(node==null)
        return ans;
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(!q.isEmpty()){
            Node n = q.remove();
            ans.add(n.data);
            
            if(n.left!=null)
                q.add(n.left);
            if(n.right!=null)
            q.add(n.right);
        }
        return ans;
    }
}