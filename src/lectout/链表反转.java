package lectout;

public class 链表反转 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(-1);
    }
    public static ListNode reverseListByLocal(ListNode listNode){
        ListNode pre = null, cur = listNode, next = null;
        while(cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
