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
    public int getDecimalValue(ListNode head) {
    ListNode curr = head;
        int ans = 0 ;
        // int mul = 1;
        while(curr!=null){   
             // mul = mul*2;
            
            ans = ans*2 + curr.val;            
           
            curr = curr.next;
        }
        return ans;   
    }
}