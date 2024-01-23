package com.registration.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registration.dto.SignUp;

public interface SignUpRepo extends JpaRepository<SignUp, String> {

}
