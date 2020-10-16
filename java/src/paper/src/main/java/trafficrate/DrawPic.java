package trafficrate;

import java.awt.*;
import java.io.*;
import java.util.Map;

import org.apache.batik.dom.GenericDOMImplementation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.graphics2d.svg.SVGUtils;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Yuan Jiajun
 * @description
 * @date 2020/7/7 17:43
 */
public class DrawPic {
//    public static void getPic() {

    public static void main(String[] args) {
        StandardChartTheme mChartTheme = new StandardChartTheme("CN");
        mChartTheme.setLargeFont(new Font("黑体", Font.BOLD, 20));
        mChartTheme.setExtraLargeFont(new Font("宋体", Font.PLAIN, 15));
        mChartTheme.setRegularFont(new Font("宋体", Font.PLAIN, 15));
        ChartFactory.setChartTheme(mChartTheme);
        CategoryDataset mDataset = GetDataset();
        JFreeChart mChart = ChartFactory.createLineChart(
                "折线图",//图名字
                "年份",//横坐标
                "数量",//纵坐标
                mDataset,//数据集
                PlotOrientation.VERTICAL,
                true, // 显示图例
                true, // 采用标准生成器
                false);// 是否生成超链接

        CategoryPlot mPlot = (CategoryPlot) mChart.getPlot();
        mPlot.setBackgroundPaint(Color.LIGHT_GRAY);
        mPlot.setRangeGridlinePaint(Color.BLUE);//背景底部横虚线
        mPlot.setOutlinePaint(Color.RED);//边界线

        ChartFrame mChartFrame = new ChartFrame("折线图", mChart);
        mChartFrame.pack();
        mChartFrame.setVisible(true);

        SVGGraphics2D g2 = new SVGGraphics2D(6000, 4000);
        Rectangle r = new Rectangle(0, 0, 6000, 4000);
        mChart.draw(g2, r);

        File f = new File("java/src/paper/src/main/java/trafficrate/TrafficRate.svg");
        try {
            SVGUtils.writeToSVG(f, g2.getSVGElement());

//            Writer out = new FileWriter(outputStream, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static CategoryDataset GetDataset() {
//        TrafficRateMap.buildMap();
        TrafficRateMap.singleFileMap("java/src/paper/src/main/java/trafficrate/logresource/ntci_traffic_process.log-20200624");
        DefaultCategoryDataset mDataset = new DefaultCategoryDataset();
        Map<Integer, Properties> myMap = TrafficRateMap.myMap;
        int total = TrafficRateMap.count;
        int interval = 1;
        int k = interval;
        double packetsCapture = 0;
        double bytesCapture = 0;

        for (int i = 1; i < total; i++) {
            Properties properties = myMap.get(i);
            packetsCapture += properties.getPacketsCapture();
            bytesCapture += properties.getBytesCapture();
            k--;
            if (k == 0) {
//                Date date = entry.getKey();
//                Long datelong = date.getTime() - 1594109897000L;
//                String dateString = Long.toString(datelong);
//
//                mDataset.addValue(packetsCapture, "packetsCapture", dateString);
//                mDataset.addValue(bytesCapture, "bytesCapture", dateString);

                mDataset.addValue(packetsCapture, "packetsCapture", Integer.toString(i));
                mDataset.addValue(bytesCapture, "bytesCapture", Integer.toString(i));

                packetsCapture = 0;
                bytesCapture = 0;
                k = interval;
            }
        }
        return mDataset;
    }

    public static void addValue(DefaultCategoryDataset mDataset, double value, String line, String columKey) {
        mDataset.addValue(value, line, columKey);
    }

}
