package top.kylewang.mjtest.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

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

    @Override
    public void run(ApplicationArguments args) throws Exception {
        diskCollectService.collectStart();
    }
}
