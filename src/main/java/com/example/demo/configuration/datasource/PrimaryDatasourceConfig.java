package com.example.demo.configuration.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration("primaryDataSource")
public class PrimaryDatasourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "primary.datasource")
    public DataSource dataSource() {
        System.out.println("Primary");
        return DataSourceBuilder.create().build();
    }
}
