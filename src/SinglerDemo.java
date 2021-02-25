public class SinglerDemo {
    //饿汉模式  懒汉模式是在初始话类是就加载好
    private static SinglerDemo singlerDemo = new SinglerDemo();
    //懒汉模式  加个锁线程安全
//    public  static  [synchronized]  SinglerDemo getInstance1()
//    {
//        if(singlerDemo==null)
//        {
//            singlerDemo=new SinglerDemo()
//        }
//        return singlerDemo;
//    }

    public static SinglerDemo getInstance() {
        return singlerDemo;
    }
}
//
//public class SingletonDemo {
//            private static class SingletonHolder{
//                private static SingletonDemo instance=new SingletonDemo();
//            }
//            private SingletonDemo(){
//                System.out.println("Singleton has loaded");
//            }
//            public static SingletonDemo getInstance(){
//                return SingletonHolder.instance;
//            }
//        }
