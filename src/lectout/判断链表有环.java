package lectout;

public class 判断链表有环 {
    public static void main(String[] args) {
    }
    public static boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode fast=head.next;
        ListNode slow=head;
        while (slow!=fast)
        {
            if(slow.next==null||fast.next.next==null) return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
}