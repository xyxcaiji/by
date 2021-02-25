package 阅文;

import sun.security.provider.MD5;
import sun.security.rsa.RSASignature;

import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5加密算法
 */
public class Main4 implements Serializable {
    public static void main(String[] args) throws IOException {
//        System.out.println(56);
//        ServerSocketFactory
//        DatagramSocket ds=new DatagramSocket(0);
//        Socketf
//        InetAddress destination=InetAddress.getByName("localhost");
//        DatagramPacket datagramPacket=
//                new DatagramPacket(data.getBytes(), data.getBytes().length,destination,8081);
//        发送数据
//        ds.send(datagramPacket);
//        System.out.println(ds.getLocalPort());
//        byte b=14;
//        int a=b>>5;
//        System.out.println(a);
        //md5(123123141,32);
        System.out.println("query=中文&version=1.0.0".hashCode());
        String str="query=中文&version=1.0.0";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            //计算MD5函数
            md5.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8位字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            //一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方）
            System.out.println(new BigInteger(1,md5.digest()).toString(16));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
