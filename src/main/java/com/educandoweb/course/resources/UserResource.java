package com.educandoweb.course.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.dtos.UserDTO;
import com.educandoweb.course.entities.dtos.mappers.UserMapper;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService userService;
	
	
    @GetMapping
    private ResponseEntity<List<UserDTO>> findAll() {
      List <User> userList = userService.findAll();
      List<UserDTO> userDtoList = userList.stream().map(UserMapper::toDTO).collect(Collectors.toList());
        return ResponseEntity.ok().body(userDtoList);
    }
    
    @GetMapping(value = "/{id}")
    private ResponseEntity<UserDTO> findById (@PathVariable Long id) {
    	User obj = userService.findById(id);
    	UserDTO dto = UserMapper.toDTO(obj);
    	return ResponseEntity.ok().body(dto);
    }
    
    @PostMapping
    public ResponseEntity<UserDTO> insert (@RequestBody UserDTO userDTO) {
    	User user = UserMapper.toUser(userDTO);
    	userService.insert(user);
    	UserDTO response = UserMapper.toDTO(user);
    	URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
    	return ResponseEntity.created(uri).body(response);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete (@PathVariable Long id){
    	userService.delete(id);
    	return ResponseEntity.noContent().build();
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDTO> update (@PathVariable Long id, @RequestBody UserDTO userDTO) {
    	User user = UserMapper.toUser(userDTO);
    	user = userService.update(id, user);
    	UserDTO responsePut = UserMapper.toDTO(user);
    	return ResponseEntity.ok().body(responsePut);
    }
    
 }
