package com.thiagosaraiva.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiagosaraiva.springbootmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
