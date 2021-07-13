package com.CSR.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CSR.backend.model.User;
import com.CSR.backend.service.Auth_class;

@RestController
@CrossOrigin(origins = "*")
public class homeController {
	
	@Autowired
	private Auth_class authentication;
		@PostMapping("/login")
		public String home(@RequestBody User user) {
			System.out.println(user.toString());
			return authentication.auth(user);
			
	}

}
