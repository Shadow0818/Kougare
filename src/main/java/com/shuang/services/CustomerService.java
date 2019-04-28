//package com.shuang.services;
//
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.shuang.dto.CustomerDTO;
//import com.shuang.entity.Customer;
//import com.shuang.repository.CustomerRepository;
//
//@Service
//public class CustomerService {
//		
//	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
//	
//	@Autowired
//	private CustomerRepository customerRepository;
//	
//	public List<CustomerDTO> getAllCustomer() {
//		LOGGER.info("enter getAllCustomer");
//		List<CustomerDTO> allCustomer = this.transferEntityToDTO(this.customerRepository.getAllCustomer());
//		LOGGER.info("exit getAllCustomer");
//		return allCustomer;
//	}
//
//	@SuppressWarnings("null")
//	private List<CustomerDTO> transferEntityToDTO(final List<Customer> allCustomer) {
//		List<CustomerDTO> allCustomerDTO = null;
//		for (Customer data: allCustomer) {
//			CustomerDTO custData = this.getNewCustomerDTO();
//			custData.setUserId(data.getUserId());
//			custData.setFirstName(data.getFirstName());
//			custData.setLastName(data.getLastName());
//			custData.setCellPhone(data.getCellPhone());
//			custData.setEmail(data.getEmail());
//			custData.setPassword(data.getPassword());
//			custData.setComment(data.getComment());
//			custData.setAddress(data.getAddress());
//			custData.setCounty(data.getCounty());
//			custData.setState(data.getState());
//			custData.setCountry(data.getCountry());
//			custData.setZipCode(data.getZipCode());
//			allCustomerDTO.add(custData);
//		}
//		return allCustomerDTO;
//	}
//
//	private CustomerDTO getNewCustomerDTO() {
//		return new CustomerDTO();
//	}
//
//}
