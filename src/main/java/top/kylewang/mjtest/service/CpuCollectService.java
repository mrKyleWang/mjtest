package top.kylewang.mjtest.service;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import top.kylewang.mjtest.bean.CollectData;
import top.kylewang.mjtest.collect.cpu.CpuCollector;
import top.kylewang.mjtest.collect.cpu.CpuInfo;

import java.io.IOException;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
@Service
public class CpuCollectService {

	public void collectCpuInfo(CollectData collectData) throws IOException {
		CpuCollector cpuCollector = new CpuCollector();
		CpuInfo cpuInfo = cpuCollector.getCollectedData();
		System.out.println(JSON.toJSONString(cpuInfo));
		collectData.setCpuInfo(JSON.toJSONString(cpuInfo));
	}
}
