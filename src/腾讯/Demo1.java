package 腾讯;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> arrayList=new ArrayList();
        for(int i=0;i<n;i++)
        {
            arrayList.add(scanner.nextInt());
        }
        arrayList.remove(m-1);
        for(int i=0;i<arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }

    }
//    class Node{
//        int value=0;
//        Node next=null;
//        Node(int value)
//        {
//            this.value=value;
//        }
//        public void add(int val)
//        {
//            Node
//        }
//    }
}
