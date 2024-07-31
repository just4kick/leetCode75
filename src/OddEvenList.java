public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=new ListNode();

        while(head.next!=null && head.next.next!=null)
        {
            temp.next=head.next.next;
            head=head.next.next;
            temp=temp.next;
        }

        return temp;
    }

    public static void main(String[] args) {



    }
}
