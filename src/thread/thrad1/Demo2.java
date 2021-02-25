package thread.thrad1;

class Demo02
        {

            static class Learning extends  Thread
            {
                public Learning(String name)
                {
                    super(name);
                }

                @Override
                public void run() {
                    for(int i=0;i<10000;i++)
                    {
                        System.out.println(this.getName()+"---上课。。。。"+i);

                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                }

            }
            public static void main(String[] args)
            {
                new Learning("老张").start();

        for(int i=0;i<1000;i++)
        {
            System.out.println(Thread.currentThread().getName()+"..看手机..."+i);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



    }

}
