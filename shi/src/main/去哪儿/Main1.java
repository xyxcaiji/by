package main.去哪儿;

import java.math.BigInteger;
import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        BigInteger m1 = BigInteger.valueOf(m);
        BigInteger n1 = BigInteger.valueOf(n);
        if(n>m/2){
            BigInteger son = jie(m1, n1.add(BigInteger.ONE));
            BigInteger mother = jie(m1.subtract(n1), BigInteger.ONE);
            System.out.println(son.divide(mother));
        }else {
            BigInteger son = jie(m1, n1.add(BigInteger.ONE).subtract(n1));
            BigInteger mother = jie(n1, BigInteger.ONE);
            System.out.println(son.divide(mother));
        }
    }
    public static BigInteger jie(BigInteger m,BigInteger n){
        if(m.compareTo(n)<=-1){
            return n;
        }
        return m.multiply(jie(m.subtract(BigInteger.ONE),n));
    }
}
