package com.tes.user.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SwaggerConfiguration {

  private static final Logger logger = LoggerFactory.getLogger(SwaggerConfiguration.class);

  @Bean
  public OpenAPI springShopOpenAPI() {
    return new OpenAPI()
            .info(new Info()
                    .version("1.0"));
  }
}
