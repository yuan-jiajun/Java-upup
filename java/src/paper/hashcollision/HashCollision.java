package paper.hashcollision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/2 16:38
 */
public class HashCollision {
    public static final int PORTMAXNUM = 65535;
    public static final int PROTOCALMAXNUM = 255;
    public static final long IPMAX = (long) Math.pow(2, 32);

    public static void main(String[] args) {
        List<Long> ipList = new ArrayList<>();
        Map<Long, Long> hashCodeList = new HashMap<>();

        long hashCode = 0;
        String hashInfo = null;


        for (int protNum = 0; protNum < PROTOCALMAXNUM; protNum++) {
            for (int srcPort = 0; srcPort < PORTMAXNUM; srcPort++) {
                for (int dstPort = 0; dstPort < PORTMAXNUM; dstPort++) {
                    for (long srcIp = 0; srcIp < IPMAX; srcIp++) {
                        for (long dstIp = 0; dstIp < IPMAX; dstIp++) {

                            hashCode = new FiveTuple(srcIp, dstIp, srcPort, dstPort, protNum).hashCode2();

                            hashInfo = "hashCode: " + hashCode + "\t" +
                                    "srcIp: " + srcIp + "\t" +
                                    "dstIP: " + dstIp + "\t" +
                                    "srcPort: " + srcPort + "\t" +
                                    "dstPort: " + dstPort + "\t" +
                                    "prot: " + protNum;

                            if (!hashCodeList.containsKey(hashCode)) {
                                hashCodeList.put(hashCode, hashCode);

//                                System.out.println(hashInfo);

                                WriteToFile.hashInfo(hashInfo);
                            } else {

//                                System.out.println(hashInfo);

                                WriteToFile.hashCollisionInfo(hashInfo);
//                                WriteToFile.doThis(hashCollisionInfo, "/home/yuan/paper/hashCollision.txt");
                            }
                        }
                    }
                }
            }
        }
    }
}