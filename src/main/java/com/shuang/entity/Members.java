package com.shuang.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
/**
 * this class uses hibernate to connect to the database with Entity. 
 * @author Shuang
 *
 */
@Entity
public class Members {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	private String address;
	
	private String phone;
	
	@NotNull
	private String email;
	
	private String password;

//	/**
//	 * @return the id
//	 */
//	public final long getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public final void setId(long id) {
//		this.id = id;
//	}
//
//	/**
//	 * @return the firstName
//	 */
//	public final String getFirstName() {
//		return firstName;
//	}
//
//	/**
//	 * @param firstName the firstName to set
//	 */
//	public final void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	/**
//	 * @return the lastName
//	 */
//	public final String getLastName() {
//		return lastName;
//	}
//
//	/**
//	 * @param lastName the lastName to set
//	 */
//	public final void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	/**
//	 * @return the address
//	 */
//	public final String getAddress() {
//		return address;
//	}
//
//	/**
//	 * @param address the address to set
//	 */
//	public final void setAddress(String address) {
//		this.address = address;
//	}
//
//	/**
//	 * @return the phone
//	 */
//	public final String getPhone() {
//		return phone;
//	}
//
//	/**
//	 * @param phone the phone to set
//	 */
//	public final void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	/**
//	 * @return the email
//	 */
//	public final String getEmail() {
//		return email;
//	}
//
//	/**
//	 * @param email the email to set
//	 */
//	public final void setEmail(String email) {
//		this.email = email;
//	}
//
//	/**
//	 * @return the password
//	 */
//	public final String getPassword() {
//		return password;
//	}
//
//	/**
//	 * @param password the password to set
//	 */
//	public final void setPassword(String password) {
//		this.password = password;
//	}
//	
	
}
