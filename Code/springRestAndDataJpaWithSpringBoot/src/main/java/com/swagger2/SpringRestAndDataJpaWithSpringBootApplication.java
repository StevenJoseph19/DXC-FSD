package com.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringRestAndDataJpaWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAndDataJpaWithSpringBootApplication.class, args);
	}
	
	@Bean
	public Docket docket() {

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.swagger2.controller")).build();
	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder().title("Employee Management Services")
				.description("A REST application for Employee Management Services").licenseUrl("").termsOfServiceUrl("")
				.version("1.0.0").license("")
				.contact("Intrepid Employee Management Services Pvt. Ltd.").build();
	}
}
