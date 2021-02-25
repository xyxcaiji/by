package main.途虎养车;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) throws ParseException {
        System.out.println(workdays_between(2020,9,25,2020,9,28));
    }
    public static int workdays_between (int y1, int m1, int d1, int y2, int m2, int d2) {
        // write code here
        String day1 = y1+"-"+m1+"-"+d1;
        String day2 = y2+"-"+m2+"-"+d2;
        SimpleDateFormat smd = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        try {
            c1.setTime(smd.parse(day1));
            c2.setTime(smd.parse(day2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int count = 0;
        while (c1.compareTo(c2)<=0){
            if(c1.get(Calendar.DAY_OF_WEEK)!=7&&c1.get(Calendar.DAY_OF_WEEK)!=1&&c1.get(Calendar.DAY_OF_WEEK)!=2){
                count++;
            }
            c1.add(Calendar.DAY_OF_MONTH,1);
        }
        return count;
    }
}
