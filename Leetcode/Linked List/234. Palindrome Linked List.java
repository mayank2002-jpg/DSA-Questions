/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 //TC - O(n)
 //SC - O(n)
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list1 = new ArrayList<>();

        //Convert linkedlist to arraylist
        ListNode current = head;
        while(current!=null){
            list1.add(current.val);
            current = current.next;
        }
        //Two Pointer Approach
        int low = 0, high = list1.size() - 1;
        while(low<high){
            if(!list1.get(low).equals(list1.get(high))){
                return false;
            }
                low++;
                high--;
        }
        return true;
    }
}