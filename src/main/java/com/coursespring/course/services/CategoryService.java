package com.coursespring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursespring.course.entities.Category;
import com.coursespring.course.repositories.CategoryRepository;

//É preciso registrar o CategoryService como um componente Spring
//para que a injeção de dependência automática possa ser feita
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
