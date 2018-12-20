package com.shuang.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.shuang.entity.Customer;
import com.shuang.mapper.CustumerMapper;

@Repository
public class CustomerRepository extends BaseJDBCRepository {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepository.class);
	
	public List<Customer> getAllCustomer(){
		LOGGER.info("enter getAllCustomer");
		final List<Customer> allCustomer = this.getNamedParameterJdbcTemplate().query(this.getSQLMapping().get("getAllCustomer"), new CustumerMapper());
		LOGGER.info("getAllCustomer: Retreive {} customers", allCustomer != null ? allCustomer.size() : 0 );
		LOGGER.info("exit getAllCustomer");
		return allCustomer;
	}
	
}
