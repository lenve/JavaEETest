package org.sang;

import org.sang.bean.BookBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Test19SpringBoot2Application {

	@Value(value = "${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Value("${book.pinyin}")
	private String bookPinYin;

	public static void main(String[] args) {
//		SpringApplication.run(Test19SpringBoot2Application.class, args);//默认启动方式
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Test19SpringBoot2Application.class);
		//修改Banner的模式为OFF
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}

	@Autowired
	private BookBean bookBean;

	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
//		return "Hello Spring Boot!";
	}
	@RequestMapping("/book")
	public String book() {
		return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
	}
}
