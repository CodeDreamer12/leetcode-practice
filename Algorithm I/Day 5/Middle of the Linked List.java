class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int ans=0;
        if(count%2==0){
            ans=(count/2)+1;
            ListNode curr1=head;
          while(ans!=1){
              curr1=curr1.next;
              ans--;
          }
          return curr1;
        }
          ans=(count+1)/2;
          ListNode curr2=head;
          while(ans!=1){
              ans--;
              curr2=curr2.next;
          }
          return curr2;  
    }
}
