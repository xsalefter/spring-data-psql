package com.xsalefter.springdatapsql;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories("com.xsalefter.springdatapsql.repository")
public class ApplicationConfig {

    private final Logger LOG = LoggerFactory.getLogger(ApplicationConfig.class);


    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(DataSourceProperties dsProperties) {
//        LOG.debug(">> Creating new DataSource with properties: {}", dsProperties);
//
//        final HikariConfig config = new HikariConfig();
//        config.setDataSourceClassName(dsProperties.getType().getName());
//        config.addDataSourceProperty("url", dsProperties.getUrl());
//        config.addDataSourceProperty("user", dsProperties.getUsername());
//        config.addDataSourceProperty("password", dsProperties.getPassword());
//
//        return new HikariDataSource(config);
    	return DataSourceBuilder.create().build();
    }
}
