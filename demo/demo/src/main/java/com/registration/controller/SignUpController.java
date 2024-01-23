package com.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.registration.dto.SignUp;
import com.registration.service.SignUpService;

@RestController
public class SignUpController {

	@Autowired
	private SignUpService service;

	@PostMapping("savesignup")
	public SignUp saveSignUp(@RequestBody SignUp s) {
		return service.saveSignUp(s);
	}

	@GetMapping("login")
	public List<SignUp> fetchLogin(SignUp s) {
		return service.fetchLogin(s);
	}

}
