package com.educandoweb.course.services;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

    private final CategoryRepository categoryRepository;
	
	@Autowired
	private UserRepository userRepository;

    UserService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
	
	public List <User> findAll () {
		return userRepository.findAll();
	}
	
	public User findById (Long id) {
		Optional <User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert (User user) {
		return userRepository.save(user);
	}
	
	public void delete (Long id) {
		userRepository.deleteById(id);
	}
	
	public User update (Long id, User user) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, user);
		return userRepository.save(entity);
	}
	
	public void updateData (User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
	
}
