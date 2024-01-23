package com.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.dao.SignUpDao;
import com.registration.dto.SignUp;

@Service
public class SignUpService {

	@Autowired
	private SignUpDao dao;

	public SignUp saveSignUp(SignUp s) {
		return dao.saveSignUp(s);
	}

	public List<SignUp> fetchLogin(SignUp s) {
		return dao.fetchLogin(s);
	}
}
