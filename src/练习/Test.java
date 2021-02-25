package 练习;

import javafx.scene.Parent;

public class Test {
    public static void main(String[] args) {
        Parent1 parent=new Chile();
        Chile chile = new Chile();
        System.out.println(parent.num1+"=="+chile.num1);
    }

}
class Parent1{
    int num1=10;
}
class Chile extends Parent1{
    int num1=5;
}