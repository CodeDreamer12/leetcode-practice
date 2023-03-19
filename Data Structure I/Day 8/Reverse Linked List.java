class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextPtr;
        while(curr!=null){
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;
        }
        return prev;
    }
}
