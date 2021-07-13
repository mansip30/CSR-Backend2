package com.CSR.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CSR.backend.model.User;
import com.CSR.backend.repository.UserRepository;

@Service
public class Auth_class {
	@Autowired
	private UserRepository user1;
	
	public String auth(User user) {
		System.out.println(user1.findById(user.getEmailAddress()));
		if(user1.findById(user.getEmailAddress())!=null) {
			return "login successfull";
		}
		else {
			return "Login unsuccessfull";
		}
		
		
	}

}
