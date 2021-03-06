package com.ecommerce.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.web.entity.UserList;
import com.ecommerce.web.repository.UserRepository;

@Controller
public class UserController {
	
	//Dependency Injection ------->
	@Autowired
	UserRepository repo;
	
	
	//UserList handler------------>
	@RequestMapping(value="/userlist")
	public String getUserList(Model model) {
		model.addAttribute("title", "UserList - SportyShoes.com");
		List<UserList> list = repo.findAll();
		model.addAttribute("list",list);
		System.out.println("User data"+list);
		return "userlist";
		
	}
	
	//User Search handler--------------->
	@PostMapping("/user")
	public String searchUser(@RequestParam String search,Model model ) {
		model.addAttribute("title", "UserSearchResult - SportyShoes.com");
		List<UserList> user = null;
		user= repo.findByEmail(search);
		model.addAttribute("list",user);
		
		return "userlist";
		
	}

}
