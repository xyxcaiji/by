package zuoye;

import java.io.*;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GetPort {

    private static AtomicInteger ai = new AtomicInteger(0);
    public static void main(String[] args) throws IOException {
        final FileOutputStream fos = new FileOutputStream("d:\\04142015-牛科伟.dat");
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());


        try {
            for (int i = 1; i <= 5 ; i++){
                threadPool.execute(()->{
                    while (ai.get() < 254){
                        String address="222.24.16."+ai.getAndIncrement();
                        Process process = null;
                        try {
                            process = Runtime.getRuntime().exec("ping "+address);
                            InputStreamReader r = new InputStreamReader(process.getInputStream());
                            LineNumberReader returnData = new LineNumberReader(r);

                            String returnMsg="";
                            String line = "";
                            while ((line = returnData.readLine()) != null) {
                                returnMsg += line;
                            }

                            if(returnMsg.contains("100% loss")){
                                System.out.println(address +" 连接失败.");
                            }
                            else{
                                System.out.println(address +" 连接畅通.");
                                fos.write(address.getBytes());
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } );
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally
        {
            threadPool.shutdown();//关闭
        }

    }
}
