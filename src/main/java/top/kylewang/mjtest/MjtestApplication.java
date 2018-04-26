package top.kylewang.mjtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import top.kylewang.mjtest.runner.TaskRunner;

/**
 * @description
 * @author KyleWang
 * @version 1.0
 * @date 2018年04月24日
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "top.kylewang.mjtest.repository")
public class MjtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MjtestApplication.class, args);
	}

	@Bean
	public TaskRunner taskRunner(){
	    return new TaskRunner();
    }
}
