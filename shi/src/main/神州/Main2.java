package main.神州;

public class Main2 {
    public static int[] pushIntArray(int[] arr,int pushOffset){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int index=(i+pushOffset)%arr.length;
            temp[index]=arr[i];
        }
        return temp;
    }
}
