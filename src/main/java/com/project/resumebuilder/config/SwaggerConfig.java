package com.project.resumebuilder.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Resumint Resume Builder API",
                version = "1.0",
                description = "API documentation for Resumint backend"
        )
)
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        scheme = "bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addResponses("200", new ApiResponse().description("Success"))
                        .addResponses("400", new ApiResponse().description("Bad Request"))
                        .addResponses("401", new ApiResponse().description("Unauthorized"))
                        .addResponses("403", new ApiResponse().description("Forbidden"))
                        .addResponses("404", new ApiResponse().description("Not Found"))
                        .addResponses("500", new ApiResponse().description("Internal Server Error"))
                );
    }
}
