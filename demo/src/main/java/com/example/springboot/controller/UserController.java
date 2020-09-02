package com.example.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(path="/users",produces="application/json")
	public List<String> getUsers(){
		List<String> names=new ArrayList<String>();
		names.add("John");
		names.add("David");
		return names;
		
	}
}
