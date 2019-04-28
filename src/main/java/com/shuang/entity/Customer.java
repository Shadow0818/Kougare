//package com.shuang.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.data.annotation.Id;
///**
// * this class uses hibernate to connect to the database with Entity. 
// * @author Shuang
// *
// */
//@Entity
//@Table(name = "CUSTOMER")
//public class Customer {
//
//	@Id
//	@Column(name = "USER_ID")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
//	@SequenceGenerator(sequenceName = "CUSTOMER_SEQ", allocationSize = 1, name = "CUSTOMER_SEQ")
//	private long userId;
//	
//	@Column(name = "FIRST_NAME")
//	private String firstName;
//	
//	@Column(name = "LAST_NAME")
//	private String lastName;
//	
//	@Column(name = "CELL_PHONE")
//	private String cellPhone;
//	
//	@Column(name = "EMAIL")
//	private String email;
//	
//	@Column(name = "PASSCODE")
//	private String password;
//	
//	@Column(name = "COMMENTS")
//	private String comment;
//	
//	@Column(name = "ADDRESS")
//	private String address;
//	
//	@Column(name = "COUNTY")
//	private String county;
//	
//	@Column(name = "STATES", length = 2)
//	private String state;
//	
//	@Column(name = "COUNTRY")
//	private String country;
//	
//	@Column(name = "ZIPCODE")
//	private int zipCode;
//
//	/**
//	 * @return the userId
//	 */
//	public final long getUserId() {
//		return userId;
//	}
//
//	/**
//	 * @param userId the userId to set
//	 */
//	public final void setUserId(long userId) {
//		this.userId = userId;
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
//	 * @return the cellPhone
//	 */
//	public final String getCellPhone() {
//		return cellPhone;
//	}
//
//	/**
//	 * @param cellPhone the cellPhone to set
//	 */
//	public final void setCellPhone(String cellPhone) {
//		this.cellPhone = cellPhone;
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
//	/**
//	 * @return the comment
//	 */
//	public final String getComment() {
//		return comment;
//	}
//
//	/**
//	 * @param comment the comment to set
//	 */
//	public final void setComment(String comment) {
//		this.comment = comment;
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
//	 * @return the county
//	 */
//	public final String getCounty() {
//		return county;
//	}
//
//	/**
//	 * @param county the county to set
//	 */
//	public final void setCounty(String county) {
//		this.county = county;
//	}
//
//	/**
//	 * @return the state
//	 */
//	public final String getState() {
//		return state;
//	}
//
//	/**
//	 * @param state the state to set
//	 */
//	public final void setState(String state) {
//		this.state = state;
//	}
//
//	/**
//	 * @return the country
//	 */
//	public final String getCountry() {
//		return country;
//	}
//
//	/**
//	 * @param country the country to set
//	 */
//	public final void setCountry(String country) {
//		this.country = country;
//	}
//
//	/**
//	 * @return the zipCode
//	 */
//	public final int getZipCode() {
//		return zipCode;
//	}
//
//	/**
//	 * @param zipCode the zipCode to set
//	 */
//	public final void setZipCode(int zipCode) {
//		this.zipCode = zipCode;
//	}
//	
//	
//	
//	
//
//
//	
//}
