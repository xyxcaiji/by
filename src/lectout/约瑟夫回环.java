package lectout;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 约瑟夫回环 {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList();
        List<Integer> list=new ArrayList<>();

        System.out.println("请输入约瑟夫环  中 总个数数：");
        Scanner sca = new Scanner(System.in);
        int N = sca.nextInt();
        // 提示输入要出圈的数值
        System.out.println("请输入要出圈的数值：");
        int X = sca.nextInt();
        System.out.println("按出圈的次序输出序号：");

        for(int i=0 ;i<N;i++){
            alist.add(i,sca.nextInt());
        }
        //System.out.println(alist);
        int i=-1;
        int count=0;
        while (alist.size()!=0)
        {
            ++i;
            if(i==alist.size())
            {
                i=0;
            }
            ++count;
            if(count==X)
            {
                System.out.println("移出去:"+alist.get(i));
                list.add(alist.get(i));
                alist.remove(i);
                count=0;
                i--;
            }
        }

    }
}
