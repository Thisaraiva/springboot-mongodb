package com.thiagosaraiva.springbootmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.thiagosaraiva.springbootmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
	//o "?0" significa que o parametro será o primeiro de entrada que no caso será o parâmetro "text"
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);// com IgnoreCase ele desconsidera a pesquisa com diferença entre letras maiúsculas e minúsculas

}
