package top.kylewang.mjtest.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import top.kylewang.mjtest.bean.CollectData;
import top.kylewang.mjtest.collect.disk.DiskCollector;
import top.kylewang.mjtest.collect.disk.DiskInfo;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
@Service
public class DiskCollectService {

	public void collectDiskInfo(CollectData collectData) {
		DiskCollector diskCollector = new DiskCollector();
		DiskInfo diskInfo = diskCollector.getCollectedData();
		System.out.println(JSON.toJSONString(diskInfo));
		collectData.setDiskInfo(JSON.toJSONString(diskInfo));
	}
}
