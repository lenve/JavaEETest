package org.sang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UseMyStarterApplication {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication.run(UseMyStarterApplication.class, args);
	}
}
