import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		LinkedListNode curr = head;
        LinkedListNode prev = null;
		LinkedListNode nextPtr = null;

		while(curr!=null){
			nextPtr = curr.next;
			curr.next = prev;
			prev = curr;
			curr =nextPtr;
		}
		 head = prev;
		return head;
    }
}