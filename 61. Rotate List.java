class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      if(head == null) return head;
      int n=1;
      ListNode last=head;
      while(last.next != null){
        n++;
        last=last.next;
      }  
      k=k%n;
      if(k==0){
        return head;
      }
      //n-k'th node find
      int count = 1;
      ListNode t = head;
      while(t != null){
        if(count == n-k)
        break;
        count++;
        t=t.next;
      }

      last.next=head;
      ListNode res=t.next;
      t.next=null;
      return res;
    }
}
