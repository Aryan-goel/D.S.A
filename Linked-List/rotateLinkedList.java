
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null|| k==0){
            return head;
            
        }
        ListNode curr=head;
        int len=1;
        while(curr.next!=null){
            //this helps find the length of the linked List
            len++;
            curr=curr.next;
            
        }
        curr.next=head;
        k=k%len;
        k=len-k;
        while(k-->0){
            curr=curr.next;
        }
        //maek the node  head and break the next refrence
        head=curr.next;
        curr.next=null;
    return head;
    }
}
