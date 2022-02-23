

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode fast= head;
        ListNode slow= head;
        
        // to find the middle of the linked list
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow= slow.next;
        }
        
        //to reverse the right side of the linked list
        slow.next=reverse(slow.next);
        
        slow=slow.next;
        
    // to compare the values
        while(slow!=null){
            if(head.val!=slow.val){
                return false;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    // to reverse the linked list
    private ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode next= null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    
}
