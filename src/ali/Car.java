package ali;

import java.util.HashMap;

public class Car extends Ren {
    final  int i=0;
    public static void T1()
    {
        System.out.println("car...");
    }
    public void T2()
    {
        System.out.println("Cart2");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        HashMap<Car,Integer> hash=new HashMap<>();
        Car car=new Car();
        //Car car1=new Car();
        Integer put1 = hash.put(car, 2);
        System.out.println(put1);
        Integer put = hash.put(car, 1);
        System.out.println(put);
    }
}
