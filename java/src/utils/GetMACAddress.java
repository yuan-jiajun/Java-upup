package utils;

import org.junit.Test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;

/**
 * @author yuanjiajun
 * @description
 * @date 2021/1/7 18:55
 */
public class GetMACAddress {
    private static String getMacAddress() throws UnknownHostException, SocketException {
        //获取IP地址，输出示例：WCGZ-DZ-013803/10.88.12.117
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia.getHostAddress());
        //获取网卡的MAC地址
        byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();

        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mac.length; i++) {
            if (i != 0) {
                sb.append("-");
            }
            //字节转换为整数
            int temp = mac[i] & 0xff;
            String str = Integer.toHexString(temp);
            if (str.length() == 1) {
                sb.append("0" + str);
            } else {
                sb.append(str);
            }
        }
        return sb.toString().toUpperCase();
    }


    public static String[] getMacAddress2() {
        StringBuilder re = new StringBuilder();
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {

                StringBuilder sb = new StringBuilder();
                NetworkInterface networkInterface = enumeration.nextElement();
                if (networkInterface != null) {
                    byte[] bytes = networkInterface.getHardwareAddress();

                    if (bytes != null) {
                        for (int i = 0; i < bytes.length; i++) {
                            if (i != 0 && i % 2 == 0) {
                                sb.append("-");
                            }
                            int tmp = bytes[i] & 0xff; // 字节转换为整数
                            String str = Integer.toHexString(tmp);
                            if (str.length() == 1) {
                                sb.append("0" + str);
                            } else {
                                sb.append(str);
                            }
                        }
                        re.append(sb.toString().toLowerCase() + "\n");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return re.toString().split("\n");
    }

    @Test
    public void test() throws SocketException, UnknownHostException {
//        System.out.println(getMacAddress());
        System.out.println(Arrays.toString(getMacAddress2()));
    }
}
