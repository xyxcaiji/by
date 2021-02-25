import sun.plugin.dom.html.ns4.HTMLAnchorCollection;

public class Han {
    public static void main(String[] args) {
        char a='A',b='B',c='C';
        han(5,a,b,c);
    }
    public static void han(int num,char a,char b,char c)
    {
    if(num==1)
    {
        System.out.println("将"+num+"从"+a+"-->"+c);
    }else {
        han(num-1,a,c,b);
        System.out.println("将"+num+"从"+a+"-->"+c);
        han(num-1,b,a,c);
    }
    }
}
