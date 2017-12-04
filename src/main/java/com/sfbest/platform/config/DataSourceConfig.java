package com.sfbest.platform.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {
	@Value("${spring.datasource.driverClassName}")
	private String driver;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	@Value("${spring.datasource.initialSize}")
	private int initialSize ;
	@Value("${spring.datasource.minIdle}")
	private int minIdle ;
	@Value("${spring.datasource.max-active}")
	private int maxActive;
	@Value("${spring.datasource.max-idle}")
	private int maxIdel;
	@Value("${spring.datasource.max-maxWait}")
	private long maxWait;
	@Value("${spring.datasource.max-timeBetweenEvictionRunsMillis}")
	private long timeBetweenEvictionRunsMillis ; 
	@Value("${spring.datasource.max-minEvictableIdleTimeMillis}")
	private long minEvictableIdleTimeMillis ; 
	@Value("${spring.datasource.max-validationQuery}")
	private String validationQuery ;
	@Value("${spring.datasource.max-testWhileIdle}")
	private boolean testWhileIdle ;
	@Value("${spring.datasource.max-testOnBorrow}")
	private boolean testOnBorrow ;
	@Value("${spring.datasource.max-testOnReturn}")
	private boolean testOnReturn ;
	@Value("${spring.datasource.max-filters}")
	private String filters ;
	@Bean
	public DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(url);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driver);
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
//TODO            logger.error("druid configuration initialization filter", e);
        }
        return datasource;
	}
}