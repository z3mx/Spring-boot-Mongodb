package com.z3mx.mongo.example.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.z3mx.mongo.example.entity.CustomersEntity;
import com.z3mx.mongo.example.model.CustomerRequest;
import com.z3mx.mongo.example.model.CustomerResponse;
import com.z3mx.mongo.example.model.Customers;
import com.z3mx.mongo.example.repository.CustomerCRUDRepository;
import com.z3mx.mongo.example.service.CustomersService;

/**
 * CustomersService Implementation for mongodb.
 * 
 * @author lantonio
 *
 */
@Service
public class CustomersServiceImpl implements CustomersService {

	/**
	 * repository service.
	 */
	@Autowired
	private CustomerCRUDRepository repository;

	/**
	 * 
	 */
	@Override
	public List<CustomerResponse> getAll() {
		List<CustomersEntity> lista = repository.findAll();
		
		List<CustomerResponse> customersList = new ArrayList<>();
		for (CustomersEntity entity : lista) {
			customersList.add(getCustomerResponse(entity));
		}
		return customersList;
	}

	/**
	 * 
	 */
	@Override
	public CustomerResponse saveCustomer(CustomerRequest customerRequest) {
		repository.save(getCustomerEntity(customerRequest));
		CustomersEntity customersEntity2 = repository.findByName(getCustomerEntity(customerRequest).getName());
		return getCustomerResponse(customersEntity2);
	}

	private CustomersEntity getCustomerEntity(CustomerRequest request) {
		return CustomersEntity.builder()
				.name(request.getName())
				.adress(request.getAdress())
				.age(request.getAge())
				.creationDate(new Date())
				.build();
	}
	
	/**
	 * Method retrieve a {@link CustomerResponse} from {@link CustomersEntity}.
	 * 
	 * @param entity {@link CustomersEntity}
	 * 
	 * @return {@link CustomerResponse}
	 */
	private CustomerResponse getCustomerResponse(CustomersEntity entity) {
		return CustomerResponse.builder()
				.name(entity.getName())
				.age(entity.getAge())
				.adress(entity.getAdress())
				.creationDate(entity.getCreationDate())
				.build();
	}

}
