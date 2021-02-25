package bincha;

public class Book {
    int age=1;
    String name="王五";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Book book=new Book();
      //  book.age;
        book.f1();
    }
    public void f1()
    {
        System.out.println("..");
    }
}
