package lectout;
/**
 * 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对(h, k)表示，其中h是这个人的身高，k是排在这个人前面且身高大于或等于h的人数。 编写一个算法来重建这个队列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/queue-reconstruction-by-height
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 *
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/queue-reconstruction-by-height
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class 身高重排列 {
    public static void main(String[] args) {
//        [7,0], [4,4], [7,1], [5,0], [6,1], [5,2]
        int[][] people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(reconstructQueue(people));
        List<Integer> list=new ArrayList();
//        list.add(0,2);
//        list.add(0,1);
//        System.out.println(list.toString());
    }
    public static int[][] reconstructQueue(int[][] people)
    {
        Arrays.sort(people,(o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]);
        for(int i=0;i<people.length;i++)
        {
            System.out.println(people[i][0]+" "+people[i][1]);
        }
        List<int[]> res = new ArrayList<>();
        for(int[] person:people)
        {
            res.add(person[1],person);
        }
        System.out.println(res);
        return res.toArray(new int[res.size()][]);
    }
}
