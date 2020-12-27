package com.homeownersacces.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.homeownersacces.app.entity.User;

public interface UserService {
	
	public Iterable<User> findAll();
	
	public Page<User> findAll(Pageable pageable);		//OJO estos dos métodos son distintos, uno busca todos y otro busca en base a la paginación
														//por eso reciben parámetros distintos

	public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public void deleteById(Long id);
	
	
}
