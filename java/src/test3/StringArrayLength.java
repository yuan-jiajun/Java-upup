package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yuanjiajun
 * @description
 * @date 2020/2/24 22:26
 */
public class StringArrayLength {
    private static String[] topoAllDetectMacs;

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(3);
        list.add("yuan");
        list.add("jia");
        list.add("jun");
        topoAllDetectMacs = new String[2];
        for (int i = 0; i < list.size(); i++) {
            topoAllDetectMacs[i] = list.get(i);
        }
        System.out.println(Arrays.toString(topoAllDetectMacs));
    }



//    private static void setSwitchersPortStreamType() {
//        for (int i = 0; i < switchCount; i++) {
////            switchers[i].getPortInfos().parallelStream().forEach(portInfo -> {
////            });
//            for (PortInfo switchPort : switchers[i].getPortInfos())
//                for (MacInfo macInfos : macTableLists[i]) {
//                    for (String topoAllDetectMac : topoAllDetectMacs)
//                        if (macInfos.getPortLearnedFrom().equals(switchPort.getPortNum()) ||
//                                macInfos.getMacAddress().equals(topoAllDetectMac)) {
//                            if (topoAllDetectMac.equals(symbolNodeDetectMac))
//                                switchPort.setPortCascadeType(1);
//                            else
//                                switchPort.setPortCascadeType(-1);
//                        }
//                }
//        }
//    }
//
//
//    //整理交换机数据
//        AnalyseUtil.organizeSwitchData(switchers);
//    //交换机检测数据写入缓存, 使用java stream
//    List<String> serialNums = switchers.parallelStream().map(Switcher::getTaskIdSerialNum).collect(Collectors.toList());
//        Cache.switcherTaskSerialNumsCache.put(taskId, serialNums);
//        switchers.parallelStream().forEach(switcher -> Cache.switcherCache.put(switcher.getTaskIdSerialNum(), switcher));


}