package top.kylewang.mjtest.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import top.kylewang.mjtest.bean.CollectData;
import top.kylewang.mjtest.repository.CollectDataRepository;
import top.kylewang.mjtest.service.CpuCollectService;
import top.kylewang.mjtest.service.DiskCollectService;

/**
 * @author KyleWang
 * @version 1.0
 * @description
 * @date 2018年04月24日
 */
public class TaskRunner implements ApplicationRunner {

    @Autowired
    private DiskCollectService diskCollectService;

    @Autowired
    private CpuCollectService cpuCollectService;

    @Autowired
    private CollectDataRepository collectDataRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true){
			CollectData collectData = new CollectData();
			diskCollectService.collectDiskInfo(collectData);
			cpuCollectService.collectCpuInfo(collectData);
			collectDataRepository.save(collectData);
			Thread.sleep(5000);
            
        }
    }
}
