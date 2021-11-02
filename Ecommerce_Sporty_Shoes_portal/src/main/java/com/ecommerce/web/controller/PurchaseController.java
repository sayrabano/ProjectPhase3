package com.ecommerce.web.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.web.entity.Purchase;
import com.ecommerce.web.repository.PurchaseRepository;

@Controller
public class PurchaseController {
	@Autowired
	PurchaseRepository repo;

	@RequestMapping("/purchase")
	public String getPurchaseReport(Model model) {
		List<Purchase>purchase= repo.findAll();
		model.addAttribute("purchase",purchase);
		System.out.println("Purchase Report " +purchase);
		return "purchasereport";
	}
	
	
	@PostMapping("/search-result")
	public String searchPurchaseHistory(Model model,@RequestParam String category,@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd") Date date) {
	
		List<Purchase> purchase = repo.findByFilter(category, date);
		model.addAttribute("purchase", purchase);
		System.out.println("Search result " +purchase );
		
		
		
		return "purchasereport";
	}
}