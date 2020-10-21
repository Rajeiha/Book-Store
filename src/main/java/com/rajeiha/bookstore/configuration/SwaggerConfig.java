package com.rajeiha.bookstore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket swaggerApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.rajeiha"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Swagger API",
                "API Reference",
                "1.0.0",
                "Public API",
                new Contact(
                        "Name 01",
                        "https://www.youtube.com/channel/UCnn3VqIPxKOdUsyOCpZa4fw",
                        "restapi.gmail.com"),
                "API Licence Open",
                "https://www.youtube.com/channel/UCnn3VqIPxKOdUsyOCpZa4fw",
                Collections.emptyList());
    }
}
