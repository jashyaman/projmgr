package com.sr.logacc.swag.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.sr.logacc.swag.domain.Resource;
import com.sr.logacc.swag.domain.Role;
import com.sr.logacc.swag.domain.User;
import com.sr.logacc.swag.exceptions.UserNotFoundException;
import com.sr.logacc.swag.service.UserService;

@RestController
public class EntityController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/users/all")
	public ResponseEntity<Map<String,Object>> returnUsers() {
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		returnMap.put("data", userService.getUserListJsonString());
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
	@RequestMapping("/resources/all")
	public ResponseEntity<Map<String,Object>> returnResources() {
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		returnMap.put("data", userService.getResourceListJsonString());
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
	@RequestMapping("/roles/all")
	public ResponseEntity<Map<String,Object>> returnRoles() {
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		returnMap.put("data", userService.getRoleListJsonString());
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
	/* ------------------------------------------------------------------------------------- */
	
	@RequestMapping("/user/{id}")
	public ResponseEntity<Map<String,Object>> findUserById(@PathVariable("id") String id) throws JsonParseException, JsonMappingException, IOException, UserNotFoundException {
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		JavaType type = new ObjectMapper().getTypeFactory().constructCollectionLikeType(List.class, User.class);
		List<User> userList = new ObjectMapper().readValue(userService.getUserListJsonString(),  type);
		
		User user = userList.get(Integer.parseInt(id));
		
		
		
		
		if(user == null)
			throw new UserNotFoundException("no user found with id " + id);

		returnMap.put("data", user);
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
	@RequestMapping("/resource/{id}")
	public ResponseEntity<Map<String,Object>> findyResourceById(@PathVariable("id") String id) throws ResourceNotFoundException, JsonParseException, JsonMappingException, IOException {
		
	
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		JavaType type = new ObjectMapper().getTypeFactory().constructCollectionLikeType(List.class, Resource.class);
		List<Resource> resourceList = new ObjectMapper().readValue(userService.getResourceListJsonString(),  type);
		
		Resource resource = resourceList.get(Integer.parseInt(id));
		
		
		if(resource == null)
			throw new ResourceNotFoundException("no resource found with id " + id);

		returnMap.put("data", resource);
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
	@RequestMapping("/role/{id}")
	public ResponseEntity<Map<String,Object>> findRoleById(@PathVariable("id") String id) throws RoleNotFoundException, JsonParseException, JsonMappingException, IOException {
		
		Map<String,Object> returnMap = new HashMap<>();
		returnMap.put("status", "ok");
		JavaType type = new ObjectMapper().getTypeFactory().constructCollectionLikeType(List.class, Role.class);
		List<Role> roleList = new ObjectMapper().readValue(userService.getRoleListJsonString(),  type);
		
		Role role = roleList.get(Integer.parseInt(id));
		
		
		if(role == null)
			throw new RoleNotFoundException("no role found with id " + id);

		returnMap.put("data", role);
		return new ResponseEntity<>(returnMap,HttpStatus.OK);
	}
	
}
