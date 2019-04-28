//package com.shuang.mapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.springframework.jdbc.core.RowMapper;
//
//import com.shuang.common.GlobalConstants.CustomerConstants;
//import com.shuang.entity.Customer;
//
//public class CustumerMapper implements RowMapper<Customer> {
//
//	@Override
//	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
//		final Customer customer = new Customer();
//		customer.setUserId(rs.getLong(CustomerConstants.Cust_User_Id));
//		customer.setFirstName(rs.getString(CustomerConstants.Cust_First_Name));
//		customer.setLastName(rs.getString(CustomerConstants.Cust_Last_Name));
//		customer.setCellPhone(rs.getString(CustomerConstants.Cust_Phone));
//		customer.setEmail(rs.getString(CustomerConstants.Email));
//		customer.setPassword(rs.getString(CustomerConstants.Password));
//		customer.setComment(rs.getString(CustomerConstants.Comment));
//		customer.setAddress(rs.getString(CustomerConstants.Address));
//		customer.setCounty(rs.getString(CustomerConstants.County));
//		customer.setState(rs.getString(CustomerConstants.States));
//		customer.setCountry(rs.getString(CustomerConstants.Country));
//		customer.setZipCode(rs.getInt(CustomerConstants.Zip_Code));
//		return customer;
//	}
//
//}
