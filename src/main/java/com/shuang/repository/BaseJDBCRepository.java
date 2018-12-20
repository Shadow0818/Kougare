package com.shuang.repository;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.shuang.common.GlobalConstants;

public abstract class BaseJDBCRepository {
	
	@Autowired
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Resource(name = GlobalConstants.AllSQLQuery) 
	private Map<String, String> allSqlQuery;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return this.namedParameterJdbcTemplate;
	}
	
	public Map<String, String> getSQLMapping(){
		return this.allSqlQuery;
	}
	
	
}
