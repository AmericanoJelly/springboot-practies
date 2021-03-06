package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * Spring Boot Test Integration 기반
 * Error : Spring Boot Test Integration(@SpringBootTest) 에서는
 * @Configuration을 달고 있는 설정 클래스는 자동(스캔) 하지 못한다.
 */

@Configuration
public class MyApplication {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[]args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {}
	}
}
