package com.z3mx.mongo.example.service;

import java.util.List;

import com.z3mx.mongo.example.model.CustomerRequest;
import com.z3mx.mongo.example.model.CustomerResponse;

/**
 * Customer Service Interface.
 * 
 * @author lantonio
 *
 */
public interface CustomersService {
	
	/**
	 * This method retrieve all the saved in database Customers.
	 * @return
	 */
	List<CustomerResponse> getAll();
	
	/**
	 * This method save in database given customer.
	 * 
	 * @param customers
	 * @return
	 */
	CustomerResponse saveCustomer(CustomerRequest customerRequest);

}
