package com.example.demo.configuration.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration("secondaryDatasource")
public class SecondaryDatasourceConfig {

    @Bean("SecondaryData")
    @ConfigurationProperties("secondary.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
