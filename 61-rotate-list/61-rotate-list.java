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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode curr = head;
        int n = 0;
        while(curr!=null){
            n++;
            curr = curr.next;
        }
        k = k%n;
        // ListNode cur = head;
        // while(cur.next!=null){
        //     n++;
        //     cur = cur.next;
        // }
        ListNode temp = head;
        for(int i=1; i< n-k; i++ ){
            temp = temp.next;
        }
        if (k==0) return head;
        ListNode ptr = temp.next;
        temp.next = null;
        
        ListNode t2 = ptr;
        while(t2!=null && t2.next!=null){
            t2 = t2.next;
        }
        t2.next = head;
        
        return ptr;
    }    
}