package com.thiagosaraiva.springbootmongodb.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiagosaraiva.springbootmongodb.domain.Post;
import com.thiagosaraiva.springbootmongodb.repository.PostRepository;
import com.thiagosaraiva.springbootmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public List<Post> findByTitle(String text){
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String text, Date minDate, Date maxDate){
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);//Para comparar a data precisamos pegar a data do dia seguinte ao que gostaríamos de comparar
		return repo.fullSearch(text, minDate, maxDate);
	}
}
