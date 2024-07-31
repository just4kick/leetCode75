import java.util.ArrayList;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre=head;
        ListNode temp=head;
        ListNode res=head;

        if(head==null || head.next==null)
        {
            return head;
        }
        head=head.next;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int a:ar)
        {

        }
        while (head.next!=null)
        {
            pre=head;
            head=head.next;

        }
        return temp;
    }
}
