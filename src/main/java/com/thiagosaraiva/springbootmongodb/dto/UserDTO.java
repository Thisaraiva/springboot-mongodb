package com.thiagosaraiva.springbootmongodb.dto;

import java.io.Serializable;

import com.thiagosaraiva.springbootmongodb.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String email;
	
	public UserDTO() {		
	}
	
	//Construtor sobrecarregado para receber os parametros da casse User, forma automatizada de instanciaar
	//um UserDTO a partir de User, então usamos o metodo get para buscar os dados da classe User
	public UserDTO(User obj) {	
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
