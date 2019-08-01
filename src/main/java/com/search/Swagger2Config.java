package com.search;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	@Bean
	public Docket api() {

		final Docket docket = new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors
						.basePackage("com.search.controller"))
				.paths(regex("/.*"))
				.build().apiInfo(apiEndPointsInfo());
		//AC http://springfox.github.io/springfox/docs/snapshot/#q27
		docket.forCodeGeneration(true);
		return docket;
	}

	private ApiInfo apiEndPointsInfo() {

		return new ApiInfoBuilder().title("Spring Boot REST API")
				.description("Employee Management REST API")
				.contact(new Contact("Antonio Casado", "https://github.com/acasado666", "antonio1313@gmail.com"))
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.version("1.13.13")
				.build();
	}
}
