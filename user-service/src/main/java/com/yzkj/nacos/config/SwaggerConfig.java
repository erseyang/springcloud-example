package com.yzkj.nacos.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${springdoc.api-docs.enabled:true}")
    private boolean enabled;

    @Bean
    public OpenAPI customOpenAPI() {
        OpenAPI openAPI = new OpenAPI();
        if (enabled) {
            Info info = new Info();
            info.setTitle("Demo");
            info.setVersion("1.0.0");
            info.setDescription("Demo测试");
            openAPI.setInfo(info);
        } else {
            openAPI.setPaths(null);
        }
        return openAPI;
    }
}
