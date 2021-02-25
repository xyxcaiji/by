package 哔哩哔哩;

import zuoye.GetPort;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(GetCoinCount(200));
    }
    public static int GetCoinCount(int N)
    {
        int temp=1024-N;
        int[] arr={64,16,4,1};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            while (temp>=arr[i])
            {
                temp-=arr[i];
                count++;
            }
        }
        return count;
    }

}
