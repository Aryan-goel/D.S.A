class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head.next;
        }
        ListNode start= new ListNode();
        start.next=head;
        ListNode fast=start;
        ListNode slow=start;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
         if(fast.next==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            
        }
        slow.next=slow.next.next;
        return head;
    }
}
