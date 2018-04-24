package top.kylewang.mjtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.kylewang.mjtest.bean.CollectData;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
public interface CollectDataRepository extends JpaRepository<CollectData, Integer> {

}