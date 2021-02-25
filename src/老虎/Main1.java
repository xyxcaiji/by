package 老虎;

public class Main1 {
    public static void main(String[] args) {

    }
    public static int minCarCount(int[][] trips,int capacity)
    {
        int count=1;
        int tempPeople=trips[0][0];
        int che=capacity;
        int end=trips[0][2];
        for(int i=1;i<trips.length;i++)
        {
            if(trips[i][0]+tempPeople<capacity)
            {
                if(end<trips[i][1])
                {
                    tempPeople=0;
                }else {
                    tempPeople+=trips[i][0];
                }
            }else {
                count++;
                capacity+=che;
            }
        }
        return count;
    }

}
