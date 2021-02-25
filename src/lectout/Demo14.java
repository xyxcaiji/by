package lectout;

import Demo.Lis;

import java.util.*;

/*
组合总数
给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。

candidates 中的每个数字在每个组合中只能使用一次。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/combination-sum-ii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(";");
        String[] money = split[0].split(",");
        int[] value=new int[money.length];
        for(int i=0;i<value.length;i++)
        {
            value[i]=Integer.parseInt(money[i]);
        }
        int target=Integer.parseInt(split[1]);
        String lists = combinationSum2(value, target);
        System.out.println(lists);
    }
    public static String combinationSum2(int[] candidates, int target) {
        StringBuffer sbf=new StringBuffer();
        Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<>();
        find(lists,new ArrayList<>(),target,candidates,0,0);
        System.out.println(lists);
        String[] strings=new String[lists.size()];
        for(int j=0;j<lists.size();j++)
        {
            List<Integer> next = lists.get(j);
            StringBuffer sb1=new StringBuffer();
            for(int i=0;i<next.size();i++)
            {
                if(i==next.size()-1)
                {
                    sb1.append(next.get(i)+";");
                }else {
                    sb1.append(next.get(i)+",");
                }
            }
            strings[j]=sb1.toString();
        }
        for(int i=0;i<strings.length;i++)
        {
            if(i==0)
            {
                sbf.append(strings[strings.length-1]);
            }
            else {
                sbf.append(strings[i-1]);
            }

        }
        return sbf.substring(0,sbf.length()-1);

    }
    public static void find(List<List<Integer>> lists, List<Integer> temp,int target,int[] candidates,int start,int count)
    {

        if(count==target)
        {
            if(!lists.contains(temp))
            {
                lists.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {

            if(count+candidates[i]>target) break;
            //if(i>start&&candidates[i]==candidates[i-1]) continue;
            //[[1, 1, 6], [1, 2, 5], [1, 7], [1, 2, 5], [1, 7], [2, 6]]
            temp.add(candidates[i]);
//            System.out.println(temp);
//            System.out.println(i);
            find(lists,temp,target,candidates,i+1,count+candidates[i]);
            temp.remove(temp.size()-1);
        }
    }
}
