package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Test25CacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test25CacheApplication.class, args);
	}
}
