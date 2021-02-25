package thread.thrad1.part6;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4);
        Consummer consummer=new Consummer("小李子",box);
        consummer.setPriority(10);
        Shengchan shengchan=new Shengchan("王师傅",box);
        Shengchan shengchan1=new Shengchan("张师傅",box);

        consummer.start();
        shengchan.start();
        shengchan1.start();
    }
}
