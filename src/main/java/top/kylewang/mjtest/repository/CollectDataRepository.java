package top.kylewang.mjtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import top.kylewang.mjtest.bean.CollectData;

@Repository
public interface CollectDataRepository extends JpaRepository<CollectData, Integer> {

}