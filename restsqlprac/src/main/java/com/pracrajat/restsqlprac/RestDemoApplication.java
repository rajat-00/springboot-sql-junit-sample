package com.pracrajat.restsqlprac;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.pracrajat.restsqlprac")
//@EnableJpaRepositories(basePackages = "com.pracrajat.restsqlprac.repository")
//@EntityScan(basePackages = {"com.pracrajat.restsqlprac.model"})
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Cloud Vendor API Application")
						.description("Cloud Vendor API Documentation")
						.version("1.0")
						.termsOfService("https://example.com/terms")
						.contact(new Contact()
								.name("Rajat Anand")
								.email("arajatanand@gmail.com")
								.url("https://google.com"))
						.license(new License()
								.name("Rajat License")
								.url("https://google.com")));
	}
}

