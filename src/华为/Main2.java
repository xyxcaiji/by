package 华为;

import java.nio.ByteBuffer;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String baoWen = scanner.nextLine();
        String[] bao = baoWen.split(" ");
        System.out.println(sum(bao));
    }
    public static String sum(String[] bao)
    {
        StringBuffer heBing = new StringBuffer();
        int temp=0;
        int contain=0;
        int start=0;
        int end=0;
        for(int i=0;i<bao.length;i++)
        {
            if(bao[i].equals("5a"))
            {
                temp+=1;
                if(temp==1)
                {
                    start=i;
                }
                if(temp==2)
                {
                    end=i;
                }
            }
            if(temp==2)
            {
//                System.out.println(contain+"contain");
//                System.out.println(start+"start");
//                System.out.println(end+"end");
//                System.out.println(i+"i");
                //关键就在这里，题目要求有16进制存在
                if(Integer.parseInt(bao[i-1],16)==contain-1||Integer.parseInt(bao[i-1],16)+Integer.parseInt(bao[i-2],16)==contain-2)
                {
                    for(int j=start;j<end;j++)
                    {
                        heBing.append(bao[j]+" ");
//                        System.out.println(heBing.toString());
                    }
                    temp=1;
                    start=end;
                    end=0;
                    contain=0;
                    continue;
                }
                else {
                    temp=1;
                    start=end;
                    end=0;
                    contain=0;
                    continue;
                }
            }
            else {
                if(bao[i].equals("5b")&&bao[i+1].equals("bb")||bao[i].equals("5b")&&bao[i+1].equals("ba"))
                {
                    contain+=1;
                    i=i+1;
                }
                else {
                    if(!bao[i].equals("5a"))
                        contain+=1;
                }
            }
        }
        if(heBing.length()!=0)
        {
            heBing.append("5a ");
        }
        return heBing.toString();
    }
}
