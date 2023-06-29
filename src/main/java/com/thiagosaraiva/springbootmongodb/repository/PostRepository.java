package com.thiagosaraiva.springbootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thiagosaraiva.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	List<Post> findByTitleContainingIgnoreCase(String text);// com IgnoreCase ele desconsidera a pesquisa com diferença entre letras maiúsculas e minúsculas

}
