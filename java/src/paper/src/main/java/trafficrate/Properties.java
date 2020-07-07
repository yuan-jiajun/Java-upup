package trafficrate;

import java.util.Date;

/**
 * @author Yuan Jiajun
 * @description
 * @date 2020/7/7 16:58
 */
public class Properties {
    private Date date;
    private double packetsCapture;
    private double bytesCapture;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPacketsCapture() {
        return packetsCapture;
    }

    public void setPacketsCapture(double packetsCapture) {
        this.packetsCapture = packetsCapture;
    }

    public double getBytesCapture() {
        return bytesCapture;
    }

    public void setBytesCapture(double bytesCapture) {
        this.bytesCapture = bytesCapture;
    }
}