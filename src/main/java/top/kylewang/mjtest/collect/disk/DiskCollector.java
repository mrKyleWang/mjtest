package top.kylewang.mjtest.collect.disk;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DiskCollector {


    public List<DiskInfo> getCollectedData() {
        // 获取磁盘分区列表
        File[] roots = File.listRoots();
        ArrayList<DiskInfo> diskInfos = new ArrayList<>();
        for (File file : roots) {
            DiskInfo diskInfo = new DiskInfo();
            long free = file.getFreeSpace();
            long total = file.getTotalSpace();
            long use = total - free;
            diskInfo.setDiskPath(file.getPath());
            diskInfo.setFreeSpace(change(free));
            diskInfo.setUseSpace(change(use));
            diskInfo.setTotalSpace(change(total));
            diskInfo.setUseRatio(bfb(use, total));
            diskInfos.add(diskInfo);
        }
        return diskInfos;
    }

    /**
     * 单位转换为M
     * @param num
     * @return
     */
    public static long change(long num) {
        return num / 1024 / 1024 ;
    }

    public static String bfb(Object num1, Object num2) {
        double val1 = Double.valueOf(num1.toString());
        double val2 = Double.valueOf(num2.toString());
        if (val2 == 0) {
            return "0.0%";
        } else {
            DecimalFormat df = new DecimalFormat("#0.00");
            return df.format(val1 / val2 * 100) + "%";
        }
    }

}
