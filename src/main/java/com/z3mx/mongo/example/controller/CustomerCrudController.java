package com.z3mx.mongo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.z3mx.mongo.example.model.CustomerRequest;
import com.z3mx.mongo.example.model.CustomerResponse;
import com.z3mx.mongo.example.model.Customers;
import com.z3mx.mongo.example.service.CustomersService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author lantonio
 *
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class CustomerCrudController {
	
	/**
	 * 
	 */
	@Autowired
	private CustomersService customersService;
	
	/**
	 * API to get All customer records in database.
	 * 
	 * @return {@link ResponseEntity} < {@link List} < {@link Customers} >>
	 */
	@GetMapping("/customer")
	public ResponseEntity<List<CustomerResponse>> getAllCustomers(){
//		log.debug("::STARTING GET METHOD TO GET ALL THE CUSTOMERS::");
		List<CustomerResponse> response = customersService.getAll();
		
		return new ResponseEntity<List<CustomerResponse>>(response, HttpStatus.OK);
	}
	
	/**
	 * API for save Customer in database.
	 * 
	 * @param request {@link CustomerRequest}
	 * 
	 * @return ResponseEntity Void with {@link HttpStatus} OK
	 */
	@PostMapping("/customer")
	public ResponseEntity<CustomerResponse> saveCustomer(@RequestBody CustomerRequest request){
//		log.debug("::STARTING POST METHOD TO SAVE A CUSTOMER IN DATABASE::");
//		log.debug("Request {} ",request);
		CustomerResponse response = customersService.saveCustomer(request);
//		log.debug("::STARTING POST METHOD TO SAVE A CUSTOMER IN DATABASE::");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
