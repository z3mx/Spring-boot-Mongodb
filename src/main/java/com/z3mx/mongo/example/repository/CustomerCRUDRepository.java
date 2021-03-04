package com.z3mx.mongo.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.z3mx.mongo.example.entity.CustomersEntity;

/**
 * CustomerCRUDRepository.
 * 
 * @author lantonio
 *
 */
@Repository
public interface CustomerCRUDRepository extends MongoRepository<CustomersEntity, String> {

	CustomersEntity findByName(String name);
}
