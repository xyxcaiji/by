package lectout;

public class 两数相加 {
    public static void main(String[] args) {

    }
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=new ListNode(0);
        ListNode cur=root;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0)
        {
            int num1=l1!=null?l1.val:0;
            int num2=l2!=null?l2.val:0;
            int sum=num1+num2+carry;
            carry=sum/10;

            ListNode tempList=new ListNode(sum%10);
            cur.next=tempList;
            cur=tempList;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return root.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
