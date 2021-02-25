package VIPKID;

import java.util.*;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String start = scanner.nextLine();
        String end=scanner.nextLine();
        String sss=scanner.nextLine();
        String[] s = sss.split(" ");
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            list.add(s[i]);
        }
        System.out.println(list);
        judge(list,start,end);
    }
    public static int judge(ArrayList<String> list,String start,String end)
    {
        HashMap<String,Boolean> judge=new HashMap<>();
        Queue<String> queue=new LinkedList<String>();

        judge.put(start,true);
        ((LinkedList<String>) queue).add(start);
        int len=0;
        while (!queue.isEmpty())
        {
            int size=queue.size();
            len++;
            while (size-->0){
                String cur=queue.poll();
                for(String next:list){
                    if(judge.get(next)!=null)
                    {
                        continue;
                    }
                    if(!can(cur,next)){
                        continue;
                    }
                    if(end.equals(next)){
                        return ++len;
                    }
                    ((LinkedList<String>) queue).add(next);
                    judge.put(next,true);
                }
            }
        }
        return 0;
    }
    public static boolean can(String s1,String s2)
    {
        int ind=0;
        int cnt=0;
        while (ind<s1.length())
        {
            if(s1.charAt(ind)!=s2.charAt(ind))
            {
                cnt++;
                ind++;
            }
        }
        return cnt==1;
    }
}
