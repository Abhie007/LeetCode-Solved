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
    public ListNode sortList(ListNode head) {
       return mergesort(head);
       
    }
    public ListNode mergesort(ListNode head){
        if(head == null || head.next == null) return head;
        // ListNode mid = findmid(head);
        ListNode left = head;
        ListNode mid = findmid(head);
        ListNode right = mid.next;
        mid.next = null;
        left = mergesort(left);
        right = mergesort(right);
        return merge(left, right);
      
    }
    public ListNode merge(ListNode h1, ListNode h2){
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(h1!=null && h2!=null){
        if(h1.val < h2.val){
            temp.next = h1;
            h1 = h1.next;
        } else {
            temp.next = h2;
            h2 = h2.next;
         }
            temp = temp.next;
        }
        while(h1!=null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2!=null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return ans.next;
    }
    public ListNode findmid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode p = null;
        while(fast!=null && fast.next!=null){
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return p;
    }
}