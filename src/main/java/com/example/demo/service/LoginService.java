package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Login;
import com.example.demo.repository.LoginRepository;

@Service
public class LoginService {
    
    @Autowired
    private LoginRepository repo;
  
  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username, password);
      return user;
  }
    
}
