package Demo;

import java.util.Arrays;

public class Hebing {
    public static void main(String[] args) {
        int[] n1={1,3,5,7};
        int[] n2={6,4,2};
        int[] bind = bind(n1, n1.length, n2, n2.length);
        System.out.println(Arrays.toString(bind));
    }
    public static int[] bind(int[] n1,int a,int[] n2,int b)
    {
        int[] hebing=new int[a+b];
        int i=0;
        int j=b-1;
        int k=0;
        while(i<a&&j>=0)
        {
            if(n1[i]<n2[j])
            {
                hebing[k++]=n1[i++];
            }else{
                hebing[k++]=n2[j--];
            }
        }
        while (i<a)
        {
            hebing[k++]=n1[i++];
        }
        while (j>0)
        {
            hebing[k++]=n2[j--];
        }
        return hebing;
    }
}
