package com.zxy.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxy.cloud.dao")
public class MicroserviceSimpleProviderMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderMovieApplication.class, args);
	}

}
