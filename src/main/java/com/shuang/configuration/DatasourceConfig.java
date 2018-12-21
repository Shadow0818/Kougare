package com.shuang.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DatasourceConfig {
	
	@NotNull
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	private String url;
	
	public void setUrl(final String url) {
		this.url = url;
	}
	
	public void setUserName(final String userName) {
		this.username = userName;
	}
	
	@Bean
	DataSource dataSource() throws SQLException {
		final OracleDataSource dataSource = new OracleDataSource();
		dataSource.setUser(this.username);
		dataSource.setPassword(this.password);
		dataSource.setUrl(this.url);
		dataSource.setImplicitCachingEnabled(true);
		dataSource.setFastConnectionFailoverEnabled(true);
		return dataSource;
	}
	
	@Bean
	@Autowired
	@Qualifier("dataSource")
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(final DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

}
