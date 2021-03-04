package com.z3mx.mongo.example.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Customer entity class.
 * 
 * @author lantonio
 *
 */
@Getter
@Setter
@Builder
@Document(collection = "Customers")
public class CustomersEntity {

	/**
	 * id field.
	 */
	@Id
	private String id;
	
	/**
	 * name field.
	 */
	private String name;
	
	/**
	 * age field.
	 */
	private String age;
	
	/**
	 * adress field.
	 */
	private String adress;
	
	/**
	 * creation date field.
	 */
	private Date creationDate;
}
