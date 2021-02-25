package thread.thrad1.part1;

public class Main {
    public static void main(String[] args) {
     int tatle=100;
     Salar s1=new Salar("南站",tatle);
     Salar s2=new Salar("北站",tatle);
     s1.start();
     s2.start();
    }
}
