package main.java.lian;

import sun.net.util.IPAddressUtil;

import java.util.Arrays;

public class IpTest implements Cloneable {
    public static void main(String[] args) {
//        String ipv4 = "1.1.1.1";
//        String ipv6 = "ABCD:EF01:2345:6789:ABCD:EF01:2345:6789";
//
//        boolean iptest1 = ipTest(ipv4);
//        System.out.println(iptest1);//true
//
//        boolean iptest2 = ipTest(ipv6);
//        System.out.println(iptest2);//trues
        String[] s={"ba","ac","ab"};
        Arrays.sort(s);
        int[] num={1,4,5,63,1,2,3};
        Arrays.sort(num,0,5);
        System.out.println(Arrays.toString(num));
    }
    public static  boolean ipTest(String ipStr){
        boolean iPv4LiteralAddress = IPAddressUtil.isIPv4LiteralAddress(ipStr);
        boolean iPv6LiteralAddress = IPAddressUtil.isIPv6LiteralAddress(ipStr);
        //ip有可能是v4,也有可能是v6,滿足任何一种都是合法的ip
        if (!(iPv4LiteralAddress||iPv6LiteralAddress)){
            return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}