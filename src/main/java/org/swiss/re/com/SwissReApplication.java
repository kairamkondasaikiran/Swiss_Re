package org.swiss.re.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SwissReApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwissReApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		
		SimpleClientHttpRequestFactory factory = new  SimpleClientHttpRequestFactory();
		factory.setConnectTimeout(5000);
		factory.setReadTimeout(5000);
		return new RestTemplate(factory);
	}
}
