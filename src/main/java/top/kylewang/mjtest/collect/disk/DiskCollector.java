package top.kylewang.mjtest.collect.disk;

import java.io.File;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public class DiskCollector {

	public DiskInfo getCollectedData() {
		// 获取磁盘分区列表
		File root = File.listRoots()[0];
		DiskInfo diskInfo = new DiskInfo();
		long free = root.getFreeSpace();
		long total = root.getTotalSpace();
		long use = total - free;
		diskInfo.setFreeSpace(change(free));
		diskInfo.setUseSpace(change(use));
		diskInfo.setTotalSpace(change(total));
		diskInfo.setUseRatio(use / total);
		return diskInfo;
	}

	/**
	 * 单位转换为M
	 * @param num
	 * @return
	 */
	private static long change(long num) {
		return num / 1024 / 1024;
	}
}
