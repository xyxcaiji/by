package 练习;

public class AA {
    static {
        System.out.println("aa.static");
    }
    {
        System.out.println("aa:[}");
    }
}
class BB extends AA{
    static {
        System.out.println("BB.static");
    }
    {
        System.out.println("BB.{}");
    }

    public static void main(String[] args) {
        BB b=new BB();

    }
}
