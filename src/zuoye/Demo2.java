package zuoye;

import java.io.*;
import java.nio.Buffer;

public class Demo2 {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader=new BufferedReader(new FileReader("/info.xml"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("d:\\04172015-牛科伟.txt"));
        String s=null;
        while ((s=bufferedReader.readLine())!=null)
        {
            bufferedWriter.write(s);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
