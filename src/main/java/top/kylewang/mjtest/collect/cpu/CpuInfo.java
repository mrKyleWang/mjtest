package top.kylewang.mjtest.collect.cpu;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public class CpuInfo {

	/** 系统cpu使用率 */
	private double systemRatio;
	/** 进程cpu使用率 */
	private double processRatio;

	public CpuInfo() {
	}

	public CpuInfo(double systemRatio, double processRatio) {
		this.systemRatio = systemRatio;
		this.processRatio = processRatio;
	}

	public double getSystemRatio() {
		return systemRatio;
	}

	public void setSystemRatio(double systemRatio) {
		this.systemRatio = systemRatio;
	}

	public double getProcessRatio() {
		return processRatio;
	}

	public void setProcessRatio(double processRatio) {
		this.processRatio = processRatio;
	}
}
