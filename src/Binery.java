import java.util.ArrayList;
import java.util.logging.Level;

public class Binery {

    public static void main(String[] args) {
        int[] arr={1,8,10,89,1000,1000,1000,1000,1234};
        ArrayList arrayList = binerySearch2(arr, 0, arr.length - 1, 1000);
        System.out.println(arrayList);

    }
    //这个是简单的，但是如果你要查找的数不止一个呢，那就请看下面的2方法
    public static int binerySearch(int [] arr,int left,int right,int findval)
    {
        if(left>right)
        {
            return -1;
        }
        int mid=(left+right)/2;
        int midd=arr[mid];
        if(findval<midd)
        {
            return binerySearch(arr,left,mid-1,findval);
        }else if(findval>midd)
        {
           return binerySearch(arr,mid+1,right,findval);
        }else {
            return mid;
        }
    }

    //加强版二分
    public static ArrayList binerySearch2(int [] arr,int left,int right,int findval)
    {
        if(left>right)
        {
            return new ArrayList();
        }
        int mid=(left+right)/2;
        int midd=arr[mid];
        if(findval<midd)
        {
            return binerySearch2(arr,left,mid-1,findval);
        }else if(findval>midd)
        {
            return binerySearch2(arr,mid+1,right,findval);
        }else {
            ArrayList<Integer> arrayList=new ArrayList<Integer>();
            int temp=mid-1;
            while (true)
            {
                if(temp<0||arr[temp]!=findval)
                {
                    break;
                }else{
                    arrayList.add(temp);
                    temp-=1;
                }
            }
            arrayList.add(mid);
            temp=mid+1;
            while (true)
            {
                if(temp>arr.length-1||arr[temp]!=findval)
                {
                    break;
                }else{
                    arrayList.add(temp);
                    temp+=1;
                }
            }
            return arrayList;
        }
    }


}
