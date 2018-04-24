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
 * 描述：<br>
 * 版权：Copyright (c) 2011-2018<br>
 * 公司：北京活力天汇<br>
 * 作者：王凯<br>
 * 版本：1.0<br>
 * 创建日期：2018年04月23日<br>
 */
@Service
public class DiskCollectService {

    @Autowired
    private CollectDataRepository dataRepository;

    public void collectStart(){
        DiskCollector diskCollector = new DiskCollector();
        while (true){
            List<DiskInfo> diskInfos = diskCollector.getCollectedData();
            System.out.println(JSON.toJSONString(diskInfos));
            CollectData collectData = new CollectData();
            collectData.setData(JSON.toJSONString(diskInfos));
            collectData.setId(1);
            dataRepository.save(collectData);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
