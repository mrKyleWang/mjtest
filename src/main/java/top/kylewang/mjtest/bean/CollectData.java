package top.kylewang.mjtest.bean;

import javax.persistence.*;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
@Entity
@Table(name = "mjdata")
public class CollectData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "diskInfo")
	private String diskInfo;

	@Column(name = "cpuInfo")
	private String cpuInfo;

	@Column(name = "threadInfo")
	private String threadInfo;

	@Column(name = "date")
	private String date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiskInfo() {
		return diskInfo;
	}

	public void setDiskInfo(String diskInfo) {
		this.diskInfo = diskInfo;
	}

	public String getCpuInfo() {
		return cpuInfo;
	}

	public void setCpuInfo(String cpuInfo) {
		this.cpuInfo = cpuInfo;
	}

	public String getThreadInfo() {
		return threadInfo;
	}

	public void setThreadInfo(String threadInfo) {
		this.threadInfo = threadInfo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}