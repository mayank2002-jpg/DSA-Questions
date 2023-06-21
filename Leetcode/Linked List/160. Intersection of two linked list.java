/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

public int length(ListNode head){
    int count = 0;
    while(head!=null){
        head = head.next;
        count++;
    }
    return count;
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lA = length(headA);
    int lB = length(headB);

    ListNode cA = null;
    ListNode cB = null;
    int Diff = 0;

    if(lA>lB){
        cA = headA;
        cB = headB;
        Diff = lA-lB;
    }
    else{
        cA = headB;
        cB = headA;
        Diff = lB-lA;
    } 
//Starting point boost = Diff
while(Diff!=0){
    cA = cA.next;
    Diff--;
}
while(cA!=null && cB!=null){
    if(cA==cB){
        return cA;
    }
    cA = cA.next;
    cB = cB.next;
}
return null;
    }
}