package gensheixue;

public class Main2 {
    class Node{
        int data;
        Node next;
    }

    public static void main(String[] args) {

    }
    public Node mergeTwoLists(Node n1,Node n2)
    {
        Node temp=new Node();
        Node result=temp;
        while (n1!=null&&n2!=null)
        {
            if(n1.data<n2.data)
            {
                temp.next=n1;
                n1=n1.next;
            }else {
                temp.next=n2;
                n2=n2.next;
            }
            temp=temp.next;
        }
        temp.next=(n1==null)?n2:n1;
        return result.next;
    }
}
