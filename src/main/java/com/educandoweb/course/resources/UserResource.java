package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
    @GetMapping
    private ResponseEntity<List<User>> findAll() {
      List <User> userList = userService.findAll();
        return ResponseEntity.ok().body(userList);
    }
    
    @GetMapping(value = "/{id}")
    private ResponseEntity<User> findById (@PathVariable Long id) {
    	User obj = userService.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
 }
