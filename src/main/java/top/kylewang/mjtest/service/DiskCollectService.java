package top.kylewang.mjtest.service;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.kylewang.mjtest.bean.CollectData;
import top.kylewang.mjtest.collect.disk.DiskCollector;
import top.kylewang.mjtest.collect.disk.DiskInfo;
import top.kylewang.mjtest.repository.CollectDataRepository;

import java.util.List;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
@Service
public class DiskCollectService {

    @Autowired
    private CollectDataRepository collectDataRepository;

    public void collectStart(){
        DiskCollector diskCollector = new DiskCollector();
        while (true){
            List<DiskInfo> diskInfos = diskCollector.getCollectedData();
            System.out.println(JSON.toJSONString(diskInfos));
            CollectData collectData = new CollectData();
            collectData.setData(JSON.toJSONString(diskInfos));
            collectDataRepository.save(collectData);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
