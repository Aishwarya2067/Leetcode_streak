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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l= new ListNode (0);
        l.val= l.val + l1.val + l2.val;
        int carry= l.val/10;
        l.val= l.val%10;
        if(l1.next!=null&&l2.next!=null){
            l1.next.val+=carry;
            l.next = addTwoNumbers(l1.next, l2.next);
        }
        else if(l1.next!=null){
             l1.next.val+=carry;
           l.next= addTwoNumbers(l1.next, new ListNode(0));
        } 
         else if(l2.next!=null){
             l2.next.val+=carry;
             l.next= addTwoNumbers(new ListNode(0),l2.next);
         }
           
        else if(carry!=0)
        l.next = new ListNode(carry);
        return l;

    }
}