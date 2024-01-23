package com.registration.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registration.Repo.SignUpRepo;
import com.registration.dto.SignUp;

@Repository
public class SignUpDao {
	@Autowired
	private SignUpRepo repo;

	public SignUp saveSignUp(SignUp s) {
		return repo.save(s);
	}

	public List<SignUp> fetchLogin(SignUp s) {
		return repo.findAll();
	}

}
