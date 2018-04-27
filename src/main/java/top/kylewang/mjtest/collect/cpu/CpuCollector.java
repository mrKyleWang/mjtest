package top.kylewang.mjtest.collect.cpu;

import com.sun.management.OperatingSystemMXBean;

import java.lang.management.ManagementFactory;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public class CpuCollector {

	public CpuInfo getCollectedData() {
		OperatingSystemMXBean bean = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
		double systemRatio = bean.getSystemCpuLoad() * 100;
		double processRatio = bean.getProcessCpuLoad() * 100;
		return new CpuInfo(systemRatio, processRatio);
	}
}
