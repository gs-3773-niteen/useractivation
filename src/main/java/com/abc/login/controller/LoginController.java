package com.abc.login.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
import com.abc.login.service.LoginDetailservice;

@RestController  
public class LoginController {
	
	@Autowired
	LoginDetailservice service;
	
	
//	@Autowired 
	// UserDetailRepo repo;
	
	@GetMapping("/Login")  
	public String getLogin() {
		
		
		//service.getDetails(id);
		
		
		String status="success";
	
		return status;
	}
	
	
	
	
	@GetMapping("/detail")  
	public String getdetail() {
		
		
		//service.getDetails(id);
		
		
		String status="success";
	
		return status;
	}
	
	
	
	/*
	@PostMapping("/insertUser")
	public ResponseEntity<Customer> saveRecord(@RequestBody Customer user){
	    return new ResponseEntity<Customer>(repo.save(user), HttpStatus.CREATED);
	}
	*/
	
	

}
