//this soln is an IN PLACE SOLN
//and the soln by nick white in not inplace soln but is a inefficent approach

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        
    if(l1.val>l2.val){
        ListNode temp=l1;
        l1=l2;
        l2=temp;
        
    }
        ListNode res=l1;
        while(l1!=null &&l2!=null){
            ListNode temp=null;
            while(l1!=null &&l1.val<=l2.val){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;
            
            ListNode tmp=l1;
            l1=l2;
            l2=tmp;
        }
        return res;
    }
}
