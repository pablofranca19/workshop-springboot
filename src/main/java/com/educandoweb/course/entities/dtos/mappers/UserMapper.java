package com.educandoweb.course.entities.dtos.mappers;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.dtos.UserDTO;

public class UserMapper {

	
	public static UserDTO toDTO (User user) {
		
		if (user == null) {
			return null;
		}
		
		UserDTO dto = new UserDTO();
		dto.setId(user.getId());
		dto.setName(user.getName());
		dto.setEmail(user.getEmail());
		
		return dto;
	}
	
	
	public static User toUser (UserDTO dto) {
		
		if (dto == null) {
			return null;
		}
		
		User user = new User();
		user.setId(dto.getId());
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		
		return user;
		
	}
	
	
}
