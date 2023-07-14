class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        Stack <Integer> s = new Stack<>();
        int size = q.size();
        while(size!=0){
            int element = q.remove();
            s.push(element);
            size--;
        }
        while(!s.empty()){
            int element = s.peek();
            s.pop();
            q.add(element);
        }
        return q;
    }
}