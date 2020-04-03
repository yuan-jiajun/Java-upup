package hashcollision;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/2 16:38
 */
public class HashCollision {
    public static final int PORTMAXNUM = 65535;
    public static final int PROTOCALMAXNUM = 255;
    public static final int IPMAX = (int) Math.pow(2, 32);
    public static SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm:ss \t");


    public static void main(String[] args) {
        List<Integer> ipList = new ArrayList<>();
        Map<Long, Long> hashCodeList = new HashMap<>();

        long hashCode = 0;
        String hashInfo = null;

        String time = null;
        for (int protNum = 1; protNum < PROTOCALMAXNUM; protNum++) {
            for (int srcPort = 1; srcPort < PORTMAXNUM; srcPort++) {
                for (int dstPort = 1; dstPort < PORTMAXNUM; dstPort++) {
                    for (int srcIp = 16777216; srcIp < IPMAX; srcIp++) {
                        for (int dstIp = 16777216; dstIp < IPMAX; dstIp++) {// 1 0000 0000 0000 0000 0000 0000的十进制为16777216
                            if (dstIp % 8388608 == 0) {// 1000 0000 0000 0000 0000 8388608
                                System.out.print(sdf.format(new Date()));
                                System.out.printf("srcIp: %-18s\t" +
                                                "dstIp: %-18s\t" +
                                                "srcPort: %-6d\t" +
                                                "dstPort: %-6d\t" +
                                                "protNum: %-4d\n",
                                        FiveTuple.ipParseInt(srcIp),
                                        FiveTuple.ipParseInt(dstIp),
                                        srcPort, dstPort, protNum);
                            }

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

//                                WriteToFile.hashInfo(hashInfo);
                            } else {

                                System.out.println(hashInfo);

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