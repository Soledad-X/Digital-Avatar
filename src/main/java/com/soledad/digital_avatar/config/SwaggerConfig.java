package com.soledad.digital_avatar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {
    @Bean //配置docket以配置Swagger具体参数
    public Docket docket() {
        return new Docket(DocumentationType.OAS_30);
    }
}
