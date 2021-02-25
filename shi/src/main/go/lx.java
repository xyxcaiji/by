package main.go;

public class lx {
    public static lx t1=new lx();
    static {
        System.out.println("blockB");
    }
    {
        System.out.println("blockA");
    }

    public static void main(String[] args) {
        lx lx=new lx();
    }

}
