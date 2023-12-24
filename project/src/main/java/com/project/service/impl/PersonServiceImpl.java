package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.repo.PersonRepo;

@Service
public class PersonServiceImpl {
	
	@Autowired
	private PersonRepo personRepo;
	
	
	
}
