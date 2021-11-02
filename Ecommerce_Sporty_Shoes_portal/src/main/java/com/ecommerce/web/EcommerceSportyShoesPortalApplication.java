package com.ecommerce.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.web.entity.Product;
import com.ecommerce.web.repository.ProductRepository;




@SpringBootApplication
public class EcommerceSportyShoesPortalApplication implements CommandLineRunner {


	public static void main(String[] args) {
		
		SpringApplication.run(EcommerceSportyShoesPortalApplication.class, args);
	}
	@Autowired
	ProductRepository<Product> repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repo.addProduct(new Product(1,"Soccer shoes","Nike",3000,6,"Male"));
		repo.addProduct(new Product(2,"Soccer shoes","Adidas",2000,5,"Female"));
		repo.addProduct(new Product(3,"Soccer shoes","Reebok",3000,7,"Male"));
		
		repo.addProduct(new Product(4,"Running shoes","Nike",1000,6,"Female"));
		repo.addProduct(new Product(5,"Running shoes","Adidas",2000,6,"Female"));
		repo.addProduct(new Product(6,"Running shoes","Reebok",3000,7,"Male"));
		
		repo.addProduct(new Product(7,"Golf shoes","Nike",2000,6,"Female"));
		repo.addProduct(new Product(8,"Golf shoes","Puma",2000,4,"Female"));
		repo.addProduct(new Product(9,"Golf shoes","Reebok",3000,7,"Male"));
		
		
		repo.addProduct(new Product(10,"High Top shoes","Puma",1000,6,"Female"));
		repo.addProduct(new Product(11,"High Top shoes","Adidas",1000,4,"Male"));
		repo.addProduct(new Product(12,"High Top shoes","Red Tap",2500,7,"Male"));
		
		
		repo.addProduct(new Product(13,"Hiking Boots shoes","Red Tap",1000,4,"Male"));
		repo.addProduct(new Product(14,"Hiking Boots shoes","Adidas",3000,5,"Female"));
		repo.addProduct(new Product(15,"Hiking Boots shoes","Reebok",3000,7,"Male"));
	}


}
