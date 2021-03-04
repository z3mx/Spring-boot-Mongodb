package com.z3mx.mongo.example.model;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Customer Response.
 * 
 * @author lantonio
 *
 */
@Getter
@Setter
@Builder
public class CustomerResponse extends Customers {

	/**
	 * name attribute.
	 */
	protected String name;
	
	/**
	 * age attribute.
	 */
	protected String age;
	
	/**
	 * adress attribute.
	 */
	protected String adress;
	
	/**
	 * creation date field.
	 */
	protected Date creationDate;

}
