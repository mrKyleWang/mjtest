package top.kylewang.mjtest.collect.disk;

public class DiskInfo {

	/** 磁盘分区名 */
	private String diskPath;

	/** 空闲磁盘 */
	private long freeSpace;

	/** 已使用磁盘 */
	private long useSpace;

	/** 总磁盘容量 */
	private long totalSpace;

	/** 磁盘使用率 */
	private String useRatio;

	/** 默认输出格式 */
	private String unit;

	public String getDiskPath() {
		return diskPath;
	}

	public void setDiskPath(String diskPath) {
		this.diskPath = diskPath;
	}

	public long getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(long freeSpace) {
		this.freeSpace = freeSpace;
	}

	public long getUseSpace() {
		return useSpace;
	}

	public void setUseSpace(long useSpace) {
		this.useSpace = useSpace;
	}

	public long getTotalSpace() {
		return totalSpace;
	}

	public void setTotalSpace(long totalSpace) {
		this.totalSpace = totalSpace;
	}

	public String getUseRatio() {
		return useRatio;
	}

	public void setUseRatio(String useRatio) {
		this.useRatio = useRatio;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
}
