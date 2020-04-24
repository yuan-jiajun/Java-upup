package paper.hashcollision;

/**
 * @author : yuanjiajun
 * @version :
 * @description :
 * @date : 2020/4/2 16:39
 */
public class FiveTuple {
    private long srcIP;//32 bit
    private long desIP;//32
    private long srcPort;//16
    private long dstPort;//16
    private int prot;//8

    public FiveTuple(long srcIP, long desIP, long srcPort, long dstPort, int prot) {
        this.srcIP = srcIP;
        this.desIP = desIP;
        this.srcPort = srcPort;
        this.dstPort = dstPort;
        this.prot = prot;
    }

    static int seed = 31;

    public long hashCode2() {
        long hash = 0;
        hash = hash * seed + srcIP;
        hash = hash * seed + desIP;
        hash = hash * seed + srcPort;
        hash = hash * seed + dstPort;
        hash = hash * seed + prot;
        return hash;
    }

    public long getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(long srcIP) {
        this.srcIP = srcIP;
    }

    public long getDesIP() {
        return desIP;
    }

    public void setDesIP(long desIP) {
        this.desIP = desIP;
    }

    public long getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(long srcPort) {
        this.srcPort = srcPort;
    }

    public long getDstPort() {
        return dstPort;
    }

    public void setDstPort(long dstPort) {
        this.dstPort = dstPort;
    }

    public int getProt() {
        return prot;
    }

    public void setProt(int prot) {
        this.prot = prot;
    }
}