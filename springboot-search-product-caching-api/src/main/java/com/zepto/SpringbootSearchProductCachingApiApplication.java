package com.zepto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootSearchProductCachingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSearchProductCachingApiApplication.class, args);
	}

}
