package com.escolar.consejo.administracion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	        .title("Api consejo escolar")
	        .description("API para administracion consejo escolar Magdalena")
	        .license("")
	        .licenseUrl("http://unlicense.org")
	        .termsOfServiceUrl("")
	        .version("1.0.0")
	        .contact(new Contact("", "", ""))
	        .build();
	}
	@Bean

    public Docket usersApi() {

        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())

                .select()

                .apis(RequestHandlerSelectors.basePackage("com.escolar.consejo.administracion.controller"))

                .build()

                .useDefaultResponseMessages(false);

    }

}
