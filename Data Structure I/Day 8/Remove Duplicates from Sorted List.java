class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        if(head==null){
            return null;
        }
        while(curr.next!=null){
            if(curr.val == curr.next.val){
                if(curr==head){
                    head=head.next;
                }
                else{
                    prev.next=curr.next;
                   curr=prev;
                }

            }
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
