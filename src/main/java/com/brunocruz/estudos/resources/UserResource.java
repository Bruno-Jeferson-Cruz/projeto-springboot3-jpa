package com.brunocruz.estudos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunocruz.estudos.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u=new User(1L,"ana","ana@gmail.com","99987897","1234");
		return ResponseEntity.ok().body(u);
		
	}	
}
