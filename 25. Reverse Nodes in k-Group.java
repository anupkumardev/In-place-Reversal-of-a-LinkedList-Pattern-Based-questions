class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
      ListNode left=head;
      ListNode right;
      ListNode prevleft=null;
      ListNode res=null;
      while(true){
        right=left;
        for(int i=0;i<(k-1);i++){
            if(right==null){
                break;
            }
            right=right.next;
        }
        if(right != null){
            ListNode nextleft=right.next;
            reverse(left,k);
            if(prevleft != null){
            prevleft.next=right;
            }
            prevleft=left;
            if(res==null){
                res = right;
            }
            left=nextleft;
        }
        else{
            if(prevleft != null){
                prevleft.next=left;
                if(res == null){
                    res = left;
                }
            }
            break;
        }
      } 
      return res;
    }
    void reverse(ListNode head, int times){
        ListNode curr=head;
        ListNode prev=null;
        while(times>0){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            times--;
        }
        return;
     
    }
}
