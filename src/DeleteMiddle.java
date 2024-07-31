


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {



        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=head;
        if(head.next==null)
        {
            return head=null;
        }

       while(fast!=null && fast.next!=null)
       {
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;
       }
       pre.next=pre.next.next;
        return head;
    }

    public static void main(String[] args) {

    }

}
