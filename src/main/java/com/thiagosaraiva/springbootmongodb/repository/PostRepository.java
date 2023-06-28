package com.thiagosaraiva.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiagosaraiva.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
