package co.com.bancolombia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories(basePackages = "co.com.bancolombia.r2dbc")
public class R2dbcConfig {

}