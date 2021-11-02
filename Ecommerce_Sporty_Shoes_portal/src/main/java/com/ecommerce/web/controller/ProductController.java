package com.ecommerce.web.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.web.entity.Product;
import com.ecommerce.web.helper.MessageHelper;
import com.ecommerce.web.repository.ProductRepository;
@Controller
public class ProductController {
	
	@Autowired
	ProductRepository<Product> repo;

	@RequestMapping(value="adminDashboard")
	public String dashboardt(Model model) {
		model.addAttribute("title", "AddProduct - SportyShoes.com");
		return "adminDashboard";
		
		
	}
	@RequestMapping("/manageProduct")
	public String manageProduct(Model model) {
		model.addAttribute("title", "ManageProduct - SportyShoes.com");
		return "manageProduct";
		
	}
	
	@RequestMapping("addproduct")
	public String addProduct(Model model) {
		model.addAttribute("title", "AddProduct - SportyShoes.com");
		return "addProduct";
		
		
	}
	@PostMapping("/processAddproduct")
	public String processAddProduct(@ModelAttribute Product product,HttpSession session) {
		
	try {
		
		
		System.out.println("Addedd" +product);
		repo.addProduct(product);
		session.setAttribute("message", new MessageHelper("Product added Successfully !","success"));
	}catch(Exception e) {
		System.out.println("Something is wrong" +e.getMessage());
		e.printStackTrace();
		//session.setAttribute("message", new MessageHelper("Something went wrong try again","danger"));
	}
	
			return "addproduct";
	
	}
	@RequestMapping("/manage-cat")
	public String manageCategory() {
		return "manageproduct-category";
	}
	
	
	@RequestMapping(value="/soccer")
	public String getProductSoccer(Model model) {
		List<Product> product = null;
		
		product = repo.findSoccerShoes();
		model.addAttribute("product", product);
		System.out.println("List of soccer shoes: " +product);
		return "manageproduct-category";
		
		
	}
	
	
	
	@RequestMapping(value="/golf")
	public String getProductGolf(Model model) {
		List<Product> product = null;
		
	     product= repo.findGolfShoes();
		model.addAttribute("product", product);
		System.out.println("List of golfr shoes:" +product);
		return "manageproduct-category";
		
		
	}
	
	
	@RequestMapping(value="/running")
	public String getProductRunning(Model model) {
		List<Product> product = null;
		
		product = repo.findRunningShoes();
		model.addAttribute("product", product);
		System.out.println( "List of running shoes: "+ product);
		return "manageproduct-category";
		
		
	}
	
	
	@RequestMapping(value="/hightop")
	public String getProductHighTop(Model model) {
		List<Product> product = null;
		
		product = repo.findHighTopShoes();
		model.addAttribute("product", product);
		System.out.println( "List of high top shoes: "+ product);
		return "manageproduct-category";
		
		
	}
	
	@RequestMapping(value="/boots")
	public String getProductHikingBoots(Model model) {
		List<Product> product = null;
		
		product = repo.findHikingBootsShoes();
		model.addAttribute("product", product);
		System.out.println("List of hiking boots shoes: "+ product);
		return "manageproduct-category";
		
		
	}
	@PostMapping("/deleteProduct")
		
	public String deleteProduct(@RequestParam String product_id,HttpSession session) {
		try {
		if(product_id!=null) {
			session.setAttribute("message", new MessageHelper("Product deleted Successfully !","success"));
			
		}
		}catch(Exception e) {
			return "error";
		}
		
		return "deleteproduct";
	}
			
			
		
	
		
		
		

		
		
	

}