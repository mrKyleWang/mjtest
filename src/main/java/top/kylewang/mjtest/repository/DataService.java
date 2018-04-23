package top.kylewang.mjtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import top.kylewang.mjtest.bean.CollectData;

public interface DataService extends JpaRepository<CollectData, Integer> {

}