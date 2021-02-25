package thread.thrad1;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
显示时间
 */
public class Demo3 extends JFrame {
    private JLabel show=new JLabel();
    private SimpleDateFormat  sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Demo3()
    {
        super("显示时间");
        this.setSize(400,300);
        this.setLocation(200,200);

        show.setText(sf.format(new Date()));

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true)
                {
                    show.setText(sf.format(new Date()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        show.setFont(new Font("微软雅黑",Font.BOLD,26));
        show.setForeground(Color.red);
        this.add(show);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo3();
    }
}
